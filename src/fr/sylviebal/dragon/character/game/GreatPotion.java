package fr.sylviebal.dragon.character.game;

public class GreatPotion extends BonusCell {

    @Override
    public void interact(GameCharacter character) {
        Story.onBonusFound("Grande Potion"); // ✅ narration
        character.heal(5); // ✅ soigne le personnage
        System.out.println("💊 Tu récupères 5 points de vie !");
    }

    @Override
    public String toString() {
        return "💊 Grande Potion";
    }
}