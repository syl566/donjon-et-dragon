package fr.sylviebal.dragon.character.game;

public class Potion extends BonusCell {
    @Override
    public void interact(GameCharacter character) {
        Story.onBonusFound("Potion");
        character.heal(2);
    }

    public String toString() {
        return "\uD83E\uDDEA potion";
    }
}