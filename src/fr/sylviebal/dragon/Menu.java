package fr.sylviebal.dragon;

import java.util.Scanner;

public class Menu {

    public void displayWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("   Bienvenue dans Donjon et Dragon !");
        System.out.println("=================================");
    }

    public boolean displayCharacters() {
        System.out.println("Choisissez votre personnage :");
        System.out.println("1 - \uD83E\uDD77\uD83C\uDFFB Warrior");
        System.out.println("2 - \uD83E\uDDD9\u200D♂\uFE0F Wizard");
        return false;
    }

    public int getCharacterChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.print("Entrez le numéro du personnage : ");
        choice = scanner.nextInt();

        return choice;
    }

    public void displayCharacterSelected(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Vous avez choisi : Warrior");
                break;
            case 2:
                System.out.println("Vous avez choisi : Wizard");
                break;
            default:
                System.out.println("Choix invalide.");
        }
    }
}