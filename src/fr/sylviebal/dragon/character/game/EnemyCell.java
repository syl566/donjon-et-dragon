package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.character.hero.Wizard;

import java.util.Scanner;

public abstract class EnemyCell extends Cell {
    protected String name;
    protected int life;
    protected int attackPower;
    private Scanner scanner = new Scanner(System.in);

    public EnemyCell(String name, int life, int attackPower) {
        this.name = name;
        this.life = life;
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return life > 0;
    }

    public void takeDamage(int damage) {
        this.life -= damage;
        if (this.life < 0) this.life = 0;
    }

    @Override
    public void interact(GameCharacter character) {
        Story.onEnemyEncounter(this.name);
        int playerAttack = character.getAttackPower();
        System.out.println("⚔️ Combat contre " + name + " ! ❤️ " + life);

        while (character.isAlive() && this.isAlive()) {
            System.out.println("\n Que veux-tu faire ?");
            System.out.println("1 - Attaque de base");

            // ✅ Affiche les options selon l'équipement
            if (character.getOffensiveEquipment() != null) {
                System.out.println("2 - Utiliser " + character.getOffensiveEquipment().getName());
            }
            if (character instanceof Warrior) {
                Warrior warrior = (Warrior) character;
                if (warrior.getSword() != null) {
                    System.out.println("3 - Utiliser " + warrior.getSword().getName());
                }
                if (warrior.getWeaponClub() != null) {
                    System.out.println("4 - Utiliser " + warrior.getWeaponClub().getName());
                }
            }
            if (character instanceof Wizard) {
                Wizard wizard = (Wizard) character;
                if (wizard.getFireBallSpell() != null) {
                    System.out.println("3 - Lancer " + wizard.getFireBallSpell().getName());
                }
                if (wizard.getLightningSpell() != null) {
                    System.out.println("4 - Lancer " + wizard.getLightningSpell().getName());
                }
            }

            // ✅ Lecture du choix
            int choice = 1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
            }

            // ✅ Calcul de l'attaque selon le choix
            playerAttack = character.getAttackPower();
            switch (choice) {
                case 1:
                    System.out.println("⚔️ " + character.getName() + " attaque !");
                    break;
                case 2:
                    if (character.getOffensiveEquipment() != null) {
                        playerAttack += character.getOffensiveEquipment().getOffensivePower();
                        System.out.println("✨ " + character.getName() + " utilise "
                                + character.getOffensiveEquipment().getName() + " !");
                    }
                    break;
                case 3:
                    if (character instanceof Warrior && ((Warrior) character).getSword() != null) {
                        playerAttack += ((Warrior) character).getSword().getOffensivePower();
                        System.out.println("⚔️ " + character.getName() + " utilise "
                                + ((Warrior) character).getSword().getName() + " !");
                    } else if (character instanceof Wizard && ((Wizard) character).getFireBallSpell() != null) {
                        playerAttack += ((Wizard) character).getFireBallSpell().getOffensivePower();
                        System.out.println("🔥 " + character.getName() + " lance "
                                + ((Wizard) character).getFireBallSpell().getName() + " !");
                    }
                    break;
                case 4:
                    if (character instanceof Warrior && ((Warrior) character).getWeaponClub() != null) {
                        playerAttack += ((Warrior) character).getWeaponClub().getOffensivePower();
                        System.out.println("🪓 " + character.getName() + " utilise "
                                + ((Warrior) character).getWeaponClub().getName() + " !");
                    } else if (character instanceof Wizard && ((Wizard) character).getLightningSpell() != null) {
                        playerAttack += ((Wizard) character).getLightningSpell().getOffensivePower();
                        System.out.println("⚡ " + character.getName() + " lance "
                                + ((Wizard) character).getLightningSpell().getName() + " !");
                    }
                    break;
                default:
                    System.out.println("❌ Choix invalide, attaque de base !");
            }

            // ✅ Application des dégâts
            this.takeDamage(playerAttack);
            System.out.println(name + " : ❤️ " + this.life + " restant");

            // ✅ Le combat épuise le joueur
            character.setAttackPower(character.getAttackPower() - 1);
            System.out.println("😓 " + character.getName() + " est épuisé ! Attaque : " + character.getAttackPower());

            if (this.isAlive()) {
                System.out.println("💥 " + name + " contre-attaque !");
                character.takeDamage(this.attackPower);
            }
        }

        if (character.isAlive()) {
            System.out.println("🏆 Tu as vaincu " + name + " !");
        }
    }
}
