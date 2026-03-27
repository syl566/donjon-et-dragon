package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.DAO.GameCharacterDao;
import fr.sylviebal.dragon.Menu;
import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.character.hero.Wizard;
import fr.sylviebal.dragon.outofboardexception.OutOfBoardException;

import java.sql.SQLException;
import java.util.Scanner;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

<<<<<<< HEAD
   public static void main(String[] args) throws SQLException, OutOfBoardException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);

        Story.introduction();
        menu.displayWelcomeMessage();

        if (menu.mainMenu()) {
            System.out.println("👋 Au revoir !");
            return;
        }
        // créer la dao
        int choice = getChoice();

        GameCharacter hero;
        if (choice == 1) {
            hero = new Warrior(menu.getName());
        } else {
            hero = new Wizard(menu.getName());
        }

        Story.characterIntro(hero);
        Game game = new Game(hero);
        while (!game.isFinished()) {
            game.playTurn();
        }
        if (hero.isAlive()) {
            Story. onFinalBossVictory(hero);
        } else {
            Story.onGameOver(hero);
            System.exit(0);
        }
    }

    private static int getChoice() throws SQLException {
        GameCharacterDao dao = new GameCharacterDao();

        /* créer un personnage*/
        GameCharacter hero = new Warrior("");
        dao.createHero(hero);

        /*affiche tous les personnages*/
        dao.getHeroes();

        Scanner scanner = new Scanner(System.in);   //création du scanner
        Menu menu = new Menu(scanner);
=======
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55

        Story.introduction();
        menu.displayWelcomeMessage();
        menu.mainMenu();
        menu.displayCharacters();
        int choice = menu.getCharacterChoice();
        menu.displayCharacterSelected(choice);
<<<<<<< HEAD
        return choice;
=======
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
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
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