package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Wizard;
import fr.sylviebal.dragon.equipement.Spell;

public class LightningSpell extends BonusCell {
    @Override
    public void interact(GameCharacter character) {
        Story.onBonusFound("Éclair");
        if (character instanceof Wizard) {
            Spell lightning = new Spell("Éclair", 5);
            character.setOffensiveEquipment(lightning);
            ((Wizard) character).setLightningSpell(lightning);
            ((Wizard) character).pickUp(2, 7);
            System.out.println("⚡ Tu trouves un Sort Éclair !");
        } else {
            System.out.println("⚡ Tu le vois  mais tu n'arrive pas à l'attraper !");
        }
    }
    @Override
    public String toString() {
        return "⚡ Éclair";
    }
}
