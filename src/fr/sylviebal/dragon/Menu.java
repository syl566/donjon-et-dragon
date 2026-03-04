package fr.sylviebal.dragon;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    //constructeur
    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean mainMenu() {
        System.out.println("""
                Faites votre choix :
                1- Commencer la partie
                2- Modifier personnage
                3- Quitter le jeux
                """);

        int input = scanner.nextInt();
        scanner.nextLine();

         switch (input) {
            case 1:
                return false;
            case 2:
                System.out.println("Pas encore implenté");
                return mainMenu();

            case 3:
                return true;
            default:
                System.out.println(" Veuillez choisir le bon numéro ");
                return mainMenu();
        }
    }

    public String getType() {
        System.out.println("Faites votre choix entre Warrior et Wizard");
        return scanner.nextLine();
    }

    public String getName() {
        System.out.println(" Enter un nom");
        return scanner.nextLine();
    }
}