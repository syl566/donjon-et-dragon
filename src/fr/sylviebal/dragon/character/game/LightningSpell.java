package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Wizard;
import fr.sylviebal.dragon.equipement.Spell;

public class LightningSpell extends BonusCell {
    @Override
    public void interact(GameCharacter character) {
        if (character instanceof Wizard) {
            Spell lightning = new Spell("Éclair", 5);
            character.setOffensiveEquipment(lightning);
            ((Wizard) character).setLightningSpell(lightning);
            ((Wizard) character).pickUp(2, 7);
            System.out.println("⚡ Tu trouves un Sort Éclair !");
        } else {
            System.out.println("⚡ Tu vois un sort éclair mais tu ne peux pas l'utiliser !");
        }
    }
    @Override
    public String toString() {
        return "⚡ Éclair";
    }
}
