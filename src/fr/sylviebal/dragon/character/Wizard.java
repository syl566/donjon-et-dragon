package fr.sylviebal.dragon.character;

public class Wizard extends GameCharacter {

    public Wizard(String name) {

        super(name, "Wizard", 6, 8); // super (..) appele le constructeur du parent
    }

    @Override
    public void attack() {
        System.out.println("❤\uFE0F\u200D\uD83D\uDD25" + getName() + " Lance un sort " + getAttackPower());
    }
    @Override
    public String toString() {
        return "🧙🏻‍♂️ " + super.toString();
    }
}
