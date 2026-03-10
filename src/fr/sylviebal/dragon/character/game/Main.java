package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.DAO.GameCharacterDao;
import fr.sylviebal.dragon.Menu;
import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.character.hero.Wizard;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        // créer la dao
        int choice = getChoice();

        GameCharacter hero;
        if (choice == 1) {
            hero = new Warrior("Guerrier");
        } else {
            hero = new Wizard("Mage");
        }
        Game game = new Game(hero);
        while (!game.isFinished()) {
            game.playTurn();
        }
        if (hero.isAlive()) {
            System.out.println("🏆 Félicitations " + hero.getName() + " ! Tu as terminé  donjon_et_dragon !");
        } else {
            System.out.println("💀 Game Over ! " + hero.getName() + " est mort...");
        }
    }

    private static int getChoice() throws SQLException {
        GameCharacterDao dao = new GameCharacterDao();

        // créer un personnage
        GameCharacter hero = new Warrior("JEAN");
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