package fr.sylviebal.dragon.character.enemy;

import fr.sylviebal.dragon.character.game.EnemyCell;
import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.character.game.Story;
<<<<<<< HEAD

import java.util.Scanner;

public class Dragon extends EnemyCell {
    private boolean isFinalBoss;
    private final Scanner scanner = new Scanner(System.in);

    public Dragon(String name) {
        super(name, 15, 4);
        this.isFinalBoss = false;
    }

    public void setFinalBoss(boolean isFinalBoss) {
=======

public class Dragon extends EnemyCell {
    private boolean isFinalBoss;

    public Dragon(String name) {
        super(name, 20, 15);
        this.isFinalBoss = false;
    }

    public Dragon(String name, boolean isFinalBoss) {
        super(name, isFinalBoss ? 50 : 20, isFinalBoss ? 25 : 15); // ✅ boss plus fort
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
        this.isFinalBoss = isFinalBoss;
    }

    @Override
    public void interact(GameCharacter character) {
        if (isFinalBoss) {
<<<<<<< HEAD
            fightFinalBoss(character);
        } else {
            // Combat simple existant (un seul échange)
            Story.onEnemyEncounter(this.name);

            int playerAttack = character.getAttackPower();
            if (character.getOffensiveEquipment() != null) {
                playerAttack += character.getOffensiveEquipment().getOffensivePower();
            }

            this.takeDamage(playerAttack);
            System.out.println("⚔️ " + character.getName() + " frappe " + name + " avec " + playerAttack + " !");
            System.out.println("💔 " + name + " : ❤️ " + this.life + " restant");

            if (!this.isAlive()) {
                System.out.println("💀 " + name + " est vaincu !");
            } else {
                System.out.println("🔥 " + name + " réplique et s'enfuit !");
                character.takeDamage(this.attackPower);
            }
        }
    }

    private void fightFinalBoss(GameCharacter character) {
        System.out.println("""
                ================================================
                🐉 BOSS FINAL — RYUU LE DRAGON MAUDIT APPARAÎT !
                ================================================
                """);
        Story.onFinalBoss();

        int round = 1;

        while (this.isAlive() && character.isAlive()) {
            System.out.println("\n--- ⚔️ Round " + round + " ---");
            System.out.println("🐉 " + name + " : ❤️ " + this.life);
            System.out.println("🧙 " + character.getName() + " : ❤️ " + character.getLifePoints());
            System.out.println("Appuyez sur Entrée pour attaquer...");
            scanner.nextLine();

            /* Attaque du joueur*/
            int playerAttack = character.getAttackPower();
            if (character.getOffensiveEquipment() != null) {
                playerAttack += character.getOffensiveEquipment().getOffensivePower();
            }
            this.takeDamage(playerAttack);
            System.out.println("⚔️ " + character.getName() + " frappe " + name + " pour " + playerAttack + " dégâts !");
            System.out.println("💔 " + name + " : ❤️ " + this.life + " restant");

            if (!this.isAlive()) break;

            /* Réplique du dragon*/
            System.out.println("🔥 " + name + " crache du feu !");
            character.takeDamage(this.attackPower);

            round++;
        }

        /* Résultat du combat*/
        if (!this.isAlive()) {
            Story.onFinalBossVictory(character);  // ← à la place du println actuel
        } else {
            Story.onGameOver(character);          // ← à la place du println actuel
        }
    }
}
=======
            Story.onFinalBoss();
        } else {
            Story.onEnemyEncounter(this.name);
        }

        // ✅ Combat
        int playerAttack = character.getAttackPower();
        if (character.getOffensiveEquipment() != null) {
            playerAttack += character.getOffensiveEquipment().getOffensivePower();
        }

        this.takeDamage(playerAttack);
        System.out.println("⚔️ " + character.getName() + " frappe " + name + " avec " + playerAttack + " !");
        System.out.println("💔 " + name + " : ❤️ " + this.life + " restant");
        character.setAttackPower(character.getAttackPower() - 3);

        if (!this.isAlive()) {
            Story.onFinalBossVictory(character); // ✅ narration victoire boss
        } else {
            System.out.println("🔥 " + name + " réplique furieusement !");
            character.takeDamage(this.attackPower);
        }
    }
}


>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
