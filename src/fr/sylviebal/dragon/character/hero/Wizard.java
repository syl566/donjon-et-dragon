package fr.sylviebal.dragon.character.hero;

import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.equipement.Spell;
import fr.sylviebal.dragon.equipement.Sword;

public class Wizard extends GameCharacter {

    private Sword sword;
    private int attackPower;

    public Wizard(String name) {

        super(name, "Wizard", 6, 8, 7); // super (..) appele le constructeur du parent
    }
    public void pickUp(int powerUp, int bonusUp) {
        setAttackPower(getAttackPower() + powerUp);
        setAttackBonus(getAttackBonus() + bonusUp);
    }
    public void setFireBallSpell(Spell fireBallSpell) {
        this.fireBallSpell = fireBallSpell;
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
