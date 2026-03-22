package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Wizard;
import fr.sylviebal.dragon.equipement.Spell;


public class FireBallSpell extends BonusCell {
  @Override
  public void interact(GameCharacter character) {
    if (character instanceof Wizard) {
      Story.onBonusFound("Boule de Feu"); // ✅ narration en premier
      Spell fireBall = new Spell("Boule de Feu", 7);
      character.setOffensiveEquipment(fireBall);
      ((Wizard) character).setFireBallSpell(fireBall);
      ((Wizard) character).pickUp(2, 7);
    } else {
      System.out.println("🔥 La boule de feu se dissipe... Seul un Mage peut la maîtriser !");
    }
  }

  @Override
  public String toString() {
    return "🔥 Boule de Feu";
  }
}