package fr.sylviebal.dragon.character.hero;

import fr.sylviebal.dragon.character.game.GameCharacter;

public class Warrior extends GameCharacter {

    public Warrior(String name) {
        super(name, "Warrior", 5, 10);
    }

    @Override
    public void attack() {
        System.out.println("⚔️ " + getName() + " attaque avec une arme ! " + getAttackPower());
    }

    @Override
    public String toString() {
        return "🛡️ " + super.toString();
    }
}



