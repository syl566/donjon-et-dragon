package fr.sylviebal.dragon.character;

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



