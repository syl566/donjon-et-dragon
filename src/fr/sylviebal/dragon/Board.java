package fr.sylviebal.dragon;

public class Board {
    private Object[] board;

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
}



