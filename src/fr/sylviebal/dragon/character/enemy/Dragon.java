package fr.sylviebal.dragon.character.enemy;

import fr.sylviebal.dragon.character.game.EnemyCell;
import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.character.game.Story;
import java.util.Scanner;

public class Dragon extends EnemyCell {

    private boolean isFinalBoss;
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Crée un Dragon standard.
     *
     * @param name le nom du Dragon
     */
    public Dragon(String name) {
        super(name, 15, 4);
        this.isFinalBoss = false;
    }

    /**
     * Crée un Dragon avec la possibilité d'être le boss final.
     *
     * @param name         le nom du Dragon
     * @param isFinalBoss  true si c'est le boss final
     */
    public Dragon(String name, boolean isFinalBoss) {
        super(name, isFinalBoss ? 50 : 15, isFinalBoss ? 25 : 4);
        this.isFinalBoss = isFinalBoss;
    }

    @Override
    public void interact(GameCharacter character) {
        if (isFinalBoss) {
            fightFinalBoss(character);
        } else {
            //  Combat simple
            Story.onEnemyEncounter(this.name);

            int playerAttack = character.getAttackPower();
            if (character.getOffensiveEquipment() != null) {
                playerAttack += character.getOffensiveEquipment().getOffensivePower();
            }

            this.takeDamage(playerAttack);
            System.out.println("⚔️ " + character.getName() + " frappe " + name + " avec " + playerAttack + " !");
            System.out.println("💔 " + name + " : ❤️ " + this.life + " restant");

            //  Le combat épuise le joueur
            character.setAttackPower(character.getAttackPower() - 3);

            if (!this.isAlive()) {
                System.out.println("💀 " + name + " est vaincu !");
            } else {
                System.out.println("🔥 " + name + " réplique et s'enfuit !");
                character.takeDamage(this.attackPower);
            }
        }
    }

    /**
     * Gère le combat contre le boss final par rounds successifs.
     * Le combat continue jusqu'à la mort du Dragon ou du joueur.
     *
     * @param character le personnage du joueur
     */
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

            //  Attaque du joueur
            int playerAttack = character.getAttackPower();
            if (character.getOffensiveEquipment() != null) {
                playerAttack += character.getOffensiveEquipment().getOffensivePower();
            }
            this.takeDamage(playerAttack);
            System.out.println("⚔️ " + character.getName() + " frappe " + name + " pour " + playerAttack + " dégâts !");
            System.out.println("💔 " + name + " : ❤️ " + this.life + " restant");

            if (!this.isAlive()) break;

            //  Réplique du Dragon
            System.out.println("🔥 " + name + " crache du feu !");
            character.takeDamage(this.attackPower);

            round++;
        }

        //  Résultat du combat final
        if (!this.isAlive()) {
            Story.onFinalBossVictory(character);
        } else {
            Story.onGameOver(character);
        }
    }
}