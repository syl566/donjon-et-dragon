package fr.sylviebal.dragon.character.game;

public class FireBallSpell extends BonusCell{
  @Override
    public void interact(GameCharacter character){
      System.out.println("Tu reçois une boule de feu - 4life");
  }
    @Override
    public String toString() {
        return "⚔️ boule de feu";
    }

}
