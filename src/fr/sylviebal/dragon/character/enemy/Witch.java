package fr.sylviebal.dragon.character.enemy;

import fr.sylviebal.dragon.character.game.EnemyCell;

public class Witch extends EnemyCell {
    public Witch(String name) {
        super(name, 9, 2);
    }

    @Override
    public String toString() {
        return "🧙 " + name;
    }
}
