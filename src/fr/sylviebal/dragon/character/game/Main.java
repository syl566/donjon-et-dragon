package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.DAO.GameCharacterDao;
import fr.sylviebal.dragon.Menu;
import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.character.hero.Wizard;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);

        Story.introduction();
        menu.displayWelcomeMessage();
        menu.displayCharacters();
        int choice = menu.getCharacterChoice();
        menu.displayCharacterSelected(choice);
        menu.getName();

        GameCharacter character;
        if (choice == 1) {
            character = new Warrior("Guerrier");
        } else {
            character = new Wizard("Mage");
        }

        Story.characterIntro(character); // intro du personnage

        Game game = new Game(character);
        while (!game.isFinished()) {
            game.playTurn();
        }

        // message de fin selon résultat
        if (character.isAlive()) {
            Story.onVictory(character);
        } else {
            Story.onGameOver(character);
        }
    }

    private static int getChoice() throws SQLException {
        GameCharacterDao dao = new GameCharacterDao();

        // créer un personnage
        GameCharacter hero = new Warrior("");
        dao.createHero(hero);

        // affiche tous les personnages
        dao.getHeroes();

        Scanner scanner = new Scanner(System.in);   //création du scanner
        Menu menu = new Menu(scanner);

        menu.displayWelcomeMessage();
        menu.mainMenu();
        menu.displayCharacters();

        int choice = menu.getCharacterChoice();
        menu.displayCharacterSelected(choice);
        return choice;
    }
}