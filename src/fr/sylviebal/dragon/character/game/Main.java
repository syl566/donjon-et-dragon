package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.DAO.GameCharacterDao;
import fr.sylviebal.dragon.Menu;
import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.character.hero.Wizard;
import fr.sylviebal.dragon.outofboardexception.OutOfBoardException;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, OutOfBoardException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);

        Story.introduction();
        menu.displayWelcomeMessage();

        // Menu principal
        if (menu.mainMenu()) {
            System.out.println("👋 Au revoir !");
            return;
        }

        // Choix du personnage
        menu.displayCharacters();
        int choice = menu.getCharacterChoice();
        menu.displayCharacterSelected(choice);

        // Nom du personnage
        String nom = menu.getName();

        // Création du personnage
        GameCharacter hero;
        if (choice == 1) {
            hero = new Warrior(nom);
        } else {
            hero = new Wizard(nom);
        }

        // Sauvegarde en base de données
        try {
            GameCharacterDao dao = new GameCharacterDao();
            dao.createHero(hero);
            dao.getHeroes();
        } catch (SQLException e) {
            System.out.println("⚠️ Connexion base de données impossible, on continue sans sauvegarde.");
        }

        Story.characterIntro(hero);

        // Boucle de jeu
        Game game = new Game(hero);
        while (!game.isFinished()) {
            game.playTurn();
        }

        //  Fin de partie
        if (hero.isAlive()) {
            Story.onFinalBossVictory(hero);
            Story.onVictory(hero);
        } else {
            Story.onGameOver(hero);
            System.exit(0);
        }
    }
}






