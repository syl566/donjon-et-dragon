package fr.sylviebal.dragon.character.game;

<<<<<<< HEAD
import fr.sylviebal.dragon.outofboardexception.OutOfBoardException;
=======
import fr.sylviebal.dragon.character.enemy.Dragon;
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55

import java.util.Scanner;

/**
 * Classe principale gérant le déroulement du jeu Donjon et Dragon.
 * Elle orchestre les tours de jeu, les déplacements du personnage
 * sur le plateau et les interactions avec les cases.
 *
 * <p>Un tour de jeu se déroule ainsi :
 * <ol>
 *   <li>Le joueur appuie sur Entrée pour lancer le dé</li>
 *   <li>Le personnage avance du nombre de cases indiqué</li>
 *   <li>Le personnage interagit avec la case (ennemi, bonus, vide)</li>
 * </ol>
 *
 * @author Sylvie Bal
 * @version 1.0
 * @see Board
 * @see GameCharacter
 */
public class Game {

    /**
     * Le personnage contrôlé par le joueur.
     */
    private GameCharacter gameCharacter;
<<<<<<< HEAD
    private int playerPosition ;
=======

    /**
     * La position actuelle du joueur sur le plateau.
     */
    private int playerPosition;

    /**
     * Le plateau de jeu contenant toutes les cases.
     */
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
    private Board board;

    /**
     * Scanner pour lire les entrées du joueur.
     */
    private Scanner scanner;

    /**
     * Crée une nouvelle partie avec le personnage choisi par le joueur.
     * Initialise le plateau de jeu et positionne le joueur à la case 0.
     *
     * @param character le personnage choisi par le joueur
     */
    public Game(GameCharacter character) {
        this.gameCharacter = character;
        this.board = new Board();
        this.playerPosition = 0;
        this.scanner = new Scanner(System.in);
    }

<<<<<<< HEAD

    public void playTurn() throws OutOfBoardException {
=======
    /**
     * Joue un tour complet :
     * lance le dé, déplace le personnage sur le plateau
     * et déclenche l'interaction avec la case d'arrivée.
     * Affiche les statistiques du personnage à la fin du tour.
     */
    public void playTurn() {
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55

        System.out.println("Appuyez sur Entrée pour lancer le dé");
        scanner.nextLine();

        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Vous avez fait : " + dice);

        board.moveCharacter(dice);
        board.print(gameCharacter);

        Cell currentCell = board.getCell(board.getPlayerPosition());
        currentCell.interact(gameCharacter);
<<<<<<< HEAD
        System.out.println(gameCharacter); //AFFICHE VIE ET ATTAQUE

        // Story de fin selon le résultat
        if (!gameCharacter.isAlive()) {
            Story.onGameOver(gameCharacter);
        } else if (board.getPlayerPosition() == board.size() - 1) {
            // Victoire sans boss final (si la dernière case n'est pas le dragon)
            Story.onVictory(gameCharacter);
        }
=======
        System.out.println(gameCharacter);
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
    }

    /**
     * Vérifie si la partie est terminée.
     * La partie se termine si le personnage est mort
     * ou s'il a atteint la dernière case du plateau.
     *
     * @return true si la partie est terminée, false sinon
     */
    public boolean isFinished() {
<<<<<<< HEAD
        return board.getPlayerPosition() == board.size() - 1
                || !gameCharacter.isAlive();
=======

        Cell lastCell = board.getCell(board.size() - 1);

        boolean bossDefeated = !(lastCell instanceof Dragon)
                || !((Dragon) lastCell).isAlive();

        /**
         *  Fin si :
         *le joueur est mort
         *- OU le joueur est sur la dernière case ET boss vaincu
         */
        return !gameCharacter.isAlive()
                || (board.getPlayerPosition() == board.size() - 1 && bossDefeated);
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
    }
}