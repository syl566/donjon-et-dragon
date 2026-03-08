package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.equipement.WeaponClub;

public class WeaponClubCell extends BonusCell {
    @Override
    public void interact(GameCharacter character){
        WeaponClub weaponClub = new WeaponClub("massue");
        character.setOffensiveEquipment(weaponClub);
        System.out.println("je t'attaque avec une massue! ");
    }
    @Override
    public String toString() {
        return "Massue";
    }
}
