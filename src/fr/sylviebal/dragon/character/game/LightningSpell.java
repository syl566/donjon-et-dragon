package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Wizard;
import fr.sylviebal.dragon.equipement.Spell;

<<<<<<< HEAD
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
=======
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
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
        }
    }
    @Override
    public String toString() {
        return "⚡ Éclair";
    }
}