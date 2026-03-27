package fr.sylviebal.dragon.character.game;

public class GreatPotion extends BonusCell {
    @Override
    public void interact(GameCharacter character) {
<<<<<<< HEAD
        System.out.println(" \uD83D\uDC8A Tu as trouvée une grand potion! ");
=======
        Story.onBonusFound("Grande Potion");;
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
        character.heal(5);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC8A Grande potion";
    }
}
