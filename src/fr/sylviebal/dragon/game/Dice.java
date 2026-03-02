package fr.sylviebal.dragon.game;

public class Dice {

    private int die; //Variable d'instance pour le nombre affiché sur le dé.

    public Dice() { //par défaut, utiliser des dés à six faces

        roll(); //Appelle la méthode roll() pour lancer le dé.
    }

    public void roll() {
        die = (int) (Math.random() * 6) + 1;
    }
    public int getValue(){
        return die;
    }
}

