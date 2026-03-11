package fr.sylviebal.dragon.character.game;

public class GreatPotion extends BonusCell {
    @Override
    public void interact(GameCharacter character) {
        Story.onBonusFound("Grande Potion");

        System.out.println(" \uD83D\uDC8A Tu as trouvée une grand potion! ");
        character.heal(5);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC8A Grande potion";
    }
}
