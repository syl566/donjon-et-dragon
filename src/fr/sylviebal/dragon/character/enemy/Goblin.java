package fr.sylviebal.dragon.character.enemy;

import fr.sylviebal.dragon.character.game.EnemyCell;

public class Goblin extends EnemyCell {
    public Goblin(String name) {
        super(name, 6, 1); // ✅ nom, vie, attaque
    }

    @Override
    public String toString() {
        return "👺 " + name;
    }
}