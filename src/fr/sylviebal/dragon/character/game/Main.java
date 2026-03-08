package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.Menu;
import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.character.hero.Wizard;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.displayWelcomeMessage();
        menu.displayCharacters();

        int choice = menu.getCharacterChoice();
        menu.displayCharacterSelected(choice);

        GameCharacter character;
        if (choice == 1) {
            character = new Warrior("Guerrier");
        } else {
            character = new Wizard("Mage");
        }
        Game game = new Game(character);
        while (!game.isFinished()) {
            game.playTurn();
        }
        if (character.isAlive()) {
            System.out.println("🏆 Félicitations " + character.getName() + " ! Tu as terminé  donjon_et_dragon !");
        } else {
            System.out.println("💀 Game Over ! " + character.getName() + " est mort...");
        }
    }
}