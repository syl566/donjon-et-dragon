package fr.sylviebal.dragon.character.enemy;

import fr.sylviebal.dragon.character.game.Cell;
import fr.sylviebal.dragon.character.game.EnemyCell;
import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.character.game.Story;

public class Dragon extends EnemyCell {
    private boolean isFinalBoss;

    public Dragon(String name) {
        super(name, 20, 15);
        this.isFinalBoss = false;
    }

    public Dragon(String name, boolean isFinalBoss) {
        super(name, isFinalBoss ? 50 : 20, isFinalBoss ? 25 : 15); // ✅ boss plus fort
        this.isFinalBoss = isFinalBoss;
    }

    @Override
    public void interact(GameCharacter character) {
        if (isFinalBoss) {
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

        if (!this.isAlive()) {
            Story.onFinalBossVictory(character); // ✅ narration victoire boss
        } else {
            System.out.println("🔥 " + name + " réplique furieusement !");
            character.takeDamage(this.attackPower);
        }
    }
}


