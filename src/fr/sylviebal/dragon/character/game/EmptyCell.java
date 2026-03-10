package fr.sylviebal.dragon.character.game;

public class EmptyCell extends Cell {

    public EmptyCell() {
    }

    @Override
    public void interact(GameCharacter character) {

        System.out.println(" \uD83D\uDD73\uFE0F Il ne se passe rien sur cette case. repose toi !!");
    }

    public String toString() {
        return "Empty";
    }
}

