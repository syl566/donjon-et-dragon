package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.equipement.WeaponClub;

public class WeaponClubCell extends BonusCell {
    @Override
    public void interact(GameCharacter character) {
        if (character instanceof Warrior) {
            WeaponClub weaponClub = new WeaponClub("massue");
            character.setOffensiveEquipment(weaponClub);

            ((Warrior) character).pickUp(3);
        } else {
            System.out.println("Tu vois une massue");
            Story.onBonusFound("Massue");
        }
    }

    @Override
    public String toString() {
        return "⚔️ Massue";
    }
}
