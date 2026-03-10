package fr.sylviebal.dragon.character.game;

import java.util.Scanner;

public class Game {
    private GameCharacter gameCharacter;
    private int playerPosition ;
    private Board board;
    private Scanner scanner;

    public Game(GameCharacter character) {
        this.gameCharacter = character;
        this.board = new Board();
        this.playerPosition = 0;
        this.scanner = new Scanner(System.in);
    }


    public void playTurn() {
        gameCharacter.attack();

        System.out.println("Appuyez sur Entrée pour lancer le dé");
        scanner.nextLine();

        int dice = (int) (Math.random() * 6) + 1;

        System.out.println("Vous avez fait : " + dice);

        board.moveCharacter(dice);  //c'est le board qui gère le déplacement
        board.print(gameCharacter); // affiche le plateau avec le personnage

        Cell currentCell = board.getCell(board.getPlayerPosition()); //récupere la case sur laquelle le joueur arrive
        currentCell.interact(gameCharacter);
        System.out.println(gameCharacter); //AFFICHE VIE ET ATTAQUE
    }

    public boolean isFinished() {
        // fin si arrivé à la dernière case OU si mort
        return board.getPlayerPosition() == board.size() - 1
                || !gameCharacter.isAlive();
    }
}
