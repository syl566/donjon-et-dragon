package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.enemy.Dragon;
import fr.sylviebal.dragon.outofboardexception.OutOfBoardException;

import java.util.Scanner;

/**
 * Classe principale gérant le déroulement du jeu Donjon et Dragon.
 *
 * @author Sylvie Bal
 * @version 1.0
 * @see Board
 * @see GameCharacter
 */
public class Game {

    /** Le personnage contrôlé par le joueur. */
    private GameCharacter gameCharacter;

    /** La position actuelle du joueur sur le plateau. */
    private int playerPosition;

    /** Le plateau de jeu contenant toutes les cases. */
    private Board board;

    /** Scanner pour lire les entrées du joueur. */
    private Scanner scanner;

    /**
     * Crée une nouvelle partie avec le personnage choisi par le joueur.
     *
     * @param character le personnage choisi par le joueur
     */
    public Game(GameCharacter character) {
        this.gameCharacter = character;
        this.board = new Board();
        this.playerPosition = 0;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Joue un tour complet :
     * lance le dé, déplace le personnage sur le plateau
     * et déclenche l'interaction avec la case d'arrivée.
     */
    public void playTurn() {
        System.out.println("Appuyez sur Entrée pour lancer le dé");
        scanner.nextLine();

        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("🎲 Vous avez fait : " + dice);

        try {
            board.moveCharacter(dice);
        } catch (OutOfBoardException e) {
            System.out.println(e.getMessage());
        }
        board.print(gameCharacter);

        Cell currentCell = board.getCell(board.getPlayerPosition());
        currentCell.interact(gameCharacter);

        System.out.println(gameCharacter);
    }

    /**
     * Vérifie si la partie est terminée.
     * La partie se termine si le personnage est mort
     * ou s'il a atteint la dernière case ET vaincu le boss final.
     *
     * @return true si la partie est terminée, false sinon
     */
    public boolean isFinished() {
        Cell lastCell = board.getCell(board.size() - 1);

        boolean bossDefeated = !(lastCell instanceof Dragon)
                || !((Dragon) lastCell).isAlive();

        return !gameCharacter.isAlive()
                || (board.getPlayerPosition() == board.size() - 1 && bossDefeated);
    }
}