package fr.sylviebal.dragon.character.enemy;

import fr.sylviebal.dragon.character.game.EnemyCell;

public class Witch extends EnemyCell {
    public Witch(String name) {
        super(name, 12, 10);
    }

    @Override
    public String toString() {
        return "🧙 " + name;
    }
}
