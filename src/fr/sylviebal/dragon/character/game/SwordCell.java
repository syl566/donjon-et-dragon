package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.equipement.Sword;
public class SwordCell extends BonusCell {
    @Override
    public void interact(GameCharacter character) {
<<<<<<< HEAD
        Story.onBonusFound("Épée");
        if (character instanceof Warrior) {
            Sword sword = new Sword("Excalibur");
            character.setOffensiveEquipment(sword);
            ((Warrior) character).setSword(sword);
            ((Warrior) character).pickUp(5,2);
            System.out.println("⚔️ Tu avances vers l'épée ! et la récupère :)");
        } else {
            System.out.println("Tu vois une épée mais elle est bloquée impossible de la récupérer!!! ");
=======
        if (character instanceof Warrior) {
            Sword sword = new Sword("Excalibur");
            character.setOffensiveEquipment(sword);
            Story.onBonusFound("Épée");
            ((Warrior) character).pickUp(5);
        } else {
            System.out.println("Tu vois une épée ");
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
        }
    }

    @Override
    public String toString() {
        return "⚔️ Épée";
    }
}