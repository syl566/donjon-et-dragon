package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.equipement.Sword;
public class SwordCell extends BonusCell {
    @Override
    public void interact(GameCharacter character) {

        Story.onBonusFound("Épée");
        if (character instanceof Warrior) {
            Sword sword = new Sword("Excalibur");
            character.setOffensiveEquipment(sword);
            ((Warrior) character).setSword(sword);
            ((Warrior) character).pickUp(5);
            System.out.println("⚔️ Tu avances vers l'épée ! et la récupère :)");
        } else {
            System.out.println("Tu vois une épée mais elle est bloquée impossible de la récupérer!!! ");

        }
    }

    @Override
    public String toString() {
        return "⚔️ Épée";
    }
}