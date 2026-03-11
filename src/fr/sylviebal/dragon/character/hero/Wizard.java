package fr.sylviebal.dragon.character.hero;

import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.equipement.Spell;

public class Wizard extends GameCharacter {

    private Spell fireBallSpell;
    private Spell lightningSpell;

    public Wizard(String name) {
        super(name, "Wizard", 6, 8, 7);
    }

    public void setFireBallSpell(Spell fireBallSpell) {
        this.fireBallSpell = fireBallSpell;

    }

    public void setLightningSpell(Spell lightningSpell) {
        this.lightningSpell = lightningSpell;

    }

    @Override
    public void attack() {
        int totalAttack = getAttackPower();

        //  ajout du bonus de l'équipement offensif (sort éclair ou boule de feu)
        if (getOffensiveEquipment() != null) {
            totalAttack += getOffensiveEquipment().getOffensivePower();
            System.out.println("✨ " + getName() + " utilise " + getOffensiveEquipment().getName()
                    + " ! attaque totale : " + totalAttack);
        } else {
            System.out.println("🧙 ");
        }
    }

    public void pickUp(int powerUp, int bonusUp) {
        setAttackPower(getAttackPower() + powerUp);
        setAttackBonus(getAttackBonus() + bonusUp);

    }

    @Override
    public String toString() {
        String sorts = "";
        if (fireBallSpell != null) sorts += " 🔥 " + fireBallSpell.getName();
        if (lightningSpell != null) sorts += " ⚡ " + lightningSpell.getName();
        return "🧙🏻‍♂️ " + super.toString() + (sorts.isEmpty() ? "" : " | Sorts : " + sorts);
    }
}