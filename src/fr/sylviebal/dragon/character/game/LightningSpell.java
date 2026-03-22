package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Wizard;
import fr.sylviebal.dragon.equipement.Spell;

public class LightningSpell extends BonusCell{
    @Override
    public void interact(GameCharacter character) {
        if (character instanceof Wizard) {
            Story.onBonusFound("Éclair");
            Spell lightning = new Spell("Éclair", 5);
            character.setOffensiveEquipment(lightning);
            ((Wizard) character).setLightningSpell(lightning); // ✅ utilise ta méthode
            ((Wizard) character).pickUp(2, 7);
        } else {
            System.out.println("⚡ Ce sort ne peut être manié que par un Mage !");
        }
    }
    @Override
    public String toString() {
        return "Éclair";
    }
}
