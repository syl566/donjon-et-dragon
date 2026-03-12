package fr.sylviebal.dragon.character.enemy;

import fr.sylviebal.dragon.character.game.EnemyCell;
import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.character.game.Story;

public class Dragon extends EnemyCell {
    private boolean isFinalBoss;

    public Dragon(String name) {
        super(name, 15, 4);
        this.isFinalBoss = false;
    }


    @Override
    public void interact(GameCharacter character) {
        if (isFinalBoss) {
            System.out.println("""
                    ================================================
                    🐉 BOSS FINAL — RYUU LE DRAGON MAUDIT APPARAÎT !
                    ================================================
                    """);
            Story.onFinalBoss();
        } else {
            Story.onEnemyEncounter(this.name);
        }

        int playerAttack = character.getAttackPower();
        if (character.getOffensiveEquipment() != null) {
            playerAttack += character.getOffensiveEquipment().getOffensivePower();
        }

        this.takeDamage(playerAttack);
        System.out.println("⚔️ " + character.getName() + " frappe " + name + " avec " + playerAttack + " !");
        System.out.println("💔 " + name + " : ❤️ " + this.life + " restant");

        if (!this.isAlive()) {
            if (isFinalBoss) {
                System.out.println("""
                        ================================================
                        🏆 RYUU EST VAINCU ! LE CRISTAL EST RÉCUPÉRÉ !
                        ================================================
                        """);
            } else {
                System.out.println("💀 " + name + " est vaincu !");
            }
        } else {
            System.out.println("🔥 " + name + " réplique furieusement !");
            character.takeDamage(this.attackPower);
        }
    }
}

