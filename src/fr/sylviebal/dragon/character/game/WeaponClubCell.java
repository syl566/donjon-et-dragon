package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.equipement.WeaponClub;
public class WeaponClubCell extends BonusCell {
    @Override
    public void interact(GameCharacter character) {
<<<<<<< HEAD
        Story.onBonusFound("Massue");

        if (character instanceof Warrior) {
            WeaponClub weaponClub = new WeaponClub("massue");
            character.setOffensiveEquipment(weaponClub);   // stocke dans gameCharacter
            ((Warrior) character).setWeaponClub(weaponClub); // stocke dans Warrior
            ((Warrior) character).pickUp(3, 5);
            System.out.println("🪓 Tu trouves une Massue ! et la recupère :)");
        } else {
            System.out.println(" 🪓 Cette arme brutale ne convient pas à un Mage... Passe ton chemin !");
=======
        if (character instanceof Warrior) {
            WeaponClub weaponClub = new WeaponClub("massue");
            character.setOffensiveEquipment(weaponClub);

            ((Warrior) character).pickUp(3);
        } else {
            System.out.println("Tu vois une massue");
            Story.onBonusFound("Massue");
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
        }
    }

    @Override
    public String toString() {
        return "⚔️ Massue";
    }
}

