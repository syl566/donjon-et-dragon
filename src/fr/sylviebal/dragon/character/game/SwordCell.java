package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.equipement.Sword;

public class SwordCell extends BonusCell {
    @Override
    public void interact(GameCharacter character) {
        Sword sword = new Sword("Excalibur");
        character.setOffensiveEquipment(sword);
        System.out.println("⚔️ Tu trouves une Épée ! +10 en attaque !");
    }

    @Override
    public String toString() {
        return "⚔️ Épée";
    }
}