package fr.sylviebal.dragon.character.enemy;

import fr.sylviebal.dragon.character.game.EnemyCell;

public class Dragon extends EnemyCell {
    public Dragon(String name) {
        super(name, 20, 15);
    }

    @Override
    public String toString() {
        return "🐉 " + name;
    }
}

