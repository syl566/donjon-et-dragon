package fr.sylviebal.dragon;

import java.util.ArrayList;

public class Board {
    private Cell[] cells;

    public Board(int size){
        cells = new Cell[size];
        for (int i = 0; i < size;i++){
            cells[i] = new Cell(i);
        }
    }
    public int getSize() {
        return cells.length;
    }
    public Cell getCell(int index) {
        return cells[index];
    }

    // calcul la nouvelle position sur le plateau
    public int move(int currentPosition, int diceValue) {
        int newPos = currentPosition + diceValue;
        if (newPos >= getSize()) {
            newPos = getSize() - 1; // reste sur la dernière case
        }
        return newPos;
    }
}


   /* private Object[] board;
    private int playerPosition;

    public Board(int size) {
        board = new Object[size];
    }

    public Object getTile(int pos) {
        return board[pos];
    }

    public void setTile(int pos, Object tile) {
        board[pos] = tile;
    }

    public void moveCharacter(int move) {
        Object character = getTile(playerPosition);
        setTile(playerPosition, null);

        playerPosition += move;
        if (playerPosition >= board.length) {
            playerPosition = board.length - 1;
        }

        setTile(playerPosition, character);
    }

    public void print() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == null) {
                System.out.print("◻");
            } else {
                System.out.print(board[i]);
            }
        }
        System.out.println();
    }

}*/

