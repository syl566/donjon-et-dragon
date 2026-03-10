package fr.sylviebal.dragon.character.hero;

import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.equipement.WeaponClub;

public class Warrior extends GameCharacter {

    private WeaponClub weaponClub;
    private int attackPower;

    public Warrior(String name) {
        super(name, "Warrior", 5, 10, 5);
    }

    @Override
    public void attack() {
        int attackPower = getAttackBonus();
        if (weaponClub != null) {
            attackPower += weaponClub.getOffensivePower();
        }
        System.out.println("⚔️ " + getName() + " attaque avec "
                + (weaponClub != null ? weaponClub.getName() : "ses épées")
                + " ! attaque : "+ attackPower);
    }

    public void pickUp(int up) {
            this.attackPower += up;
            if (this.attackPower < 0) this.attackPower = 0;
        }

        @Override
        public String toString () {
            return " \uD83E\uDDDD\uD83C\uDFFD " + super.toString() ;
        }
    }





