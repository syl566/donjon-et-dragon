package fr.sylviebal.dragon.character.game;

public class EmptyCell extends Cell {

    public EmptyCell() {
    }

    @Override
    public void interact(GameCharacter character) {

        System.out.println("Il ne se passe rien sur cette case.");
    }

    public String toString() {
        return "Empty";
    }
}

