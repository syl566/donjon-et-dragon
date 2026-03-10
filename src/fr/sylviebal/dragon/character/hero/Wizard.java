package fr.sylviebal.dragon.character.hero;

import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.equipement.Sword;

public class Wizard extends GameCharacter {

    private Sword sword;
    private int attackPower;

    public Wizard(String name) {

        super(name, "Wizard", 6, 8, 7); // super (..) appele le constructeur du parent
    }

    @Override
    public void attack() {
        int attackPower = getAttackBonus();
        if (sword != null) {
            attackPower += sword.getOffensivePower();
        }
        System.out.println("" + getName() + "attaque avec "
                + (sword != null ? sword.getName() : " boule de feu") +
                " ! attaque : " + attackPower);
    }

    @Override
    public String toString() {
        return "🧙🏻‍♂️ " + super.toString();
    }
}
