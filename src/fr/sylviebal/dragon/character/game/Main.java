package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.DAO.GameCharacterDao;
import fr.sylviebal.dragon.Menu;
import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.character.hero.Wizard;

import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {
        // créer la dao
        int choice = getChoice();

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

    private static int getChoice() throws SQLException {
        GameCharacterDao dao = new GameCharacterDao();

        // créer un personnage
        GameCharacter hero = new Warrior("JEAN");
        dao.createHero(hero);

        // affiche tous les personnages
        dao.getHeroes();

        // créer un nouvel objet dans la classe Menu et le stocker dans la variable menu
        Menu menu = new Menu();

        menu.displayWelcomeMessage();
        menu.displayCharacters();

        int choice = menu.getCharacterChoice();
        menu.displayCharacterSelected(choice);
        return choice;
    }
}