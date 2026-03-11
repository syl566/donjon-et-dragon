package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.equipement.Sword;

public class SwordCell extends BonusCell {
    @Override
    public void interact(GameCharacter character) {
        if (character instanceof Warrior) {
            Sword sword = new Sword("Excalibur");
            character.setOffensiveEquipment(sword);
            ((Warrior) character).setSword(sword);
            ((Warrior) character).pickUp(5,2);
            System.out.println("⚔️ Tu trouves une Épée !");
        } else {
            System.out.println("Tu vois une épée ");
        }
    }

    @Override
    public String toString() {
        return "⚔️ Épée";
    }
}