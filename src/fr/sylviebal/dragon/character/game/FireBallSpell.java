package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Wizard;
import fr.sylviebal.dragon.equipement.Spell;
<<<<<<< HEAD

public class FireBallSpell extends BonusCell {
  @Override
  public void interact(GameCharacter character) {
    Story.onBonusFound("Boule de Feu");

    if (character instanceof Wizard) {
      Spell fireBall = new Spell("Boule de Feu", 7);
      character.setOffensiveEquipment(fireBall);
      ((Wizard) character).setFireBallSpell(fireBall);
      ((Wizard) character).pickUp(7, 2);
      System.out.println("Tu trouves une boule de feu !");
    } else {
      System.out.println("\uD83D\uDD25 La boule de feu se dissipe... Seul un Mage peut la maîtriser");
    }
  }

  @Override
  public String toString() {
    return " \uD83D\uDD25 boule de feu";
  }
=======
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55


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