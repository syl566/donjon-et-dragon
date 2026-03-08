package fr.sylviebal.dragon.character.game;

public class LightningSpell extends BonusCell{
   @Override
    public void interact(GameCharacter character){
       System.out.println("Tu jetes un sort - 5 life");
    }
    @Override
    public String toString() {
        return "Éclair";
    }
}
