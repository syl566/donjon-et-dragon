package fr.sylviebal.dragon.character;

public class Wizard extends GameCharacter {

    public Wizard(String name) {

        super(name, "Wizard", 6, 8);
    }

    @Override
    public void attack() {
        System.out.println("\uD83D\uDD25" + getName() + " Lance un sort " + getAttackPower());
    }
    @Override
    public String toString() {
        return "🧙🏻‍♂️ " + super.toString();
    }
}
