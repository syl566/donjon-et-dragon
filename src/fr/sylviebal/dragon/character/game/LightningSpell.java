package fr.sylviebal.dragon.character.game;

public class LightningSpell extends BonusCell{
   @Override
    public void interact(GameCharacter character){
       System.out.println(" Un sort est jeté !!!");
       character.takeDamage(2);
    }
    @Override
    public String toString() {
        return "Éclair";
    }
}
