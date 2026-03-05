package fr.sylviebal.dragon;

import fr.sylviebal.dragon.character.GameCharacter;
import fr.sylviebal.dragon.character.Warrior;
import fr.sylviebal.dragon.character.Wizard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.displayWelcomeMessage();
        menu.displayCharacters();

        int choice = menu.getCharacterChoice();

        menu.displayCharacterSelected(choice);
    }
}