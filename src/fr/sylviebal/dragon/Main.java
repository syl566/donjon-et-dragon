package fr.sylviebal.dragon;

import fr.sylviebal.dragon.character.GameCharacter;
import fr.sylviebal.dragon.character.Warrior;
import fr.sylviebal.dragon.character.Wizard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("====== Bienvenue à Donjon et Dragon ======");
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(new Menu(scanner), new Dice(), scanner);
        game.startGame();

        GameCharacter warrior = new Warrior("Osiris");
        GameCharacter wizard = new Wizard("Merlin");
        System.out.println(warrior);

        warrior.attack();

        System.out.println(wizard);
        wizard.attack();
    }
}