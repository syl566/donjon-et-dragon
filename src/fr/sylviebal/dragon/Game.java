package fr.sylviebal.dragon;

import fr.sylviebal.dragon.character.GameCharacter;
import fr.sylviebal.dragon.character.Warrior;
import fr.sylviebal.dragon.character.Wizard;

import java.util.Scanner;

public class Game {

    private Menu menu;
    private Dice dice;
    private Board board;
    private Character character;
    private Scanner scanner;

    public Game(Menu menu,Dice dice,Scanner scanner) {
        this.menu = menu;
        this.dice = dice;
        this.scanner = scanner;
    }

    public void startGame() {
        while (!menu.displayCharacters()) {
            String type = String.valueOf(menu.getCharacterChoice());
            String name = menu.displayCharacterSelected(choice);
            initGame(type, name);
            while (!checkWin()) playTurn();
            board.print();
            System.out.println("\uD83C\uDFC1Vous avez gagné !\uD83C\uDFC1 \uD83C\uDF89\uD83C\uDF89 ");
        }
    }

    public void initGame(String type, String name) {
        board = new Board(64);
        if (type.equals("Warrior")) character = new character("warrior");
        else character = new character("wizard");
        board.setTile(0, character); //personnage placée sur la case 0
    }

    public void playTurn() { // playTurn itération de jeu
        board.print(); //affiche l'état du plateau
        int roll = dice.roll(6); //lancé un dé a 6faces
        board.moveCharacter(roll); // déplace le personnage du nombre de case obtenu
        this.scanner.nextLine(); // le programme attende que l'utilisateur appuie sur entré avant de continuer
    }

    public boolean checkWin() {
        return board.getTile(63) == character;
    }

}