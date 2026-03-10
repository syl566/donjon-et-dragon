package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.enemy.Dragon;

public class FireBallSpell extends BonusCell{
  @Override
    public void interact(GameCharacter character){
      System.out.println("Tu reçois une boule de feu");
      character.takeDamage(7);
  }
    @Override
    public String toString() {
        return " \uD83D\uDD25 boule de feu";
    }

}
