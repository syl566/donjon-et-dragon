package fr.sylviebal.dragon.character.hero;

import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.equipement.Sword;
import fr.sylviebal.dragon.equipement.WeaponClub;

public class Warrior extends GameCharacter {

    private WeaponClub weaponClub;
    private Sword sword;


    public Warrior(String name) {
        super(name, "Warrior", 5, 10, 5);
    }

    @Override
    public void attack() {
        int totalAttack = getAttackPower();
        if (weaponClub != null) {
            totalAttack += weaponClub.getOffensivePower();
        }
        if (sword != null) {
            totalAttack += sword.getOffensivePower();
        }
        System.out.println("⚔️ " + getName() + " attaque avec "
                + (sword != null ? sword.getName() : weaponClub != null ? weaponClub.getName() : "son épée")
                + " ! attaque : " + totalAttack);
    }

    public void setWeaponClub(WeaponClub weaponClub) { //setter méthode pour modifier une variable
        this.weaponClub = weaponClub;

    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }


    public void pickUp(int powerUp, int bonusUp) {
        setAttackPower(getAttackPower() + powerUp);
        setAttackBonus(getAttackBonus() + bonusUp);
    }

    @Override
    public String toString() { // sert a décrire un objet sous forme de texte
        String armed = "";
        if (weaponClub != null) armed += " 🪓 " + weaponClub.getName();
        if (sword != null) armed += " ⚔️ " + sword.getName();

        return " \uD83E\uDDDD\uD83C\uDFFD " + super.toString() + (armed.isEmpty() ? "" : " | Arme : " + armed);
    }
}





