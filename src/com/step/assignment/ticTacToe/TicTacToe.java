package com.step.assignment.ticTacToe;


import jdk.swing.interop.SwingInterOpUtils;

class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private char[] board;
    public boolean isEmpty = true;
    private int[][] winningChances = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    public TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = this.player1;
        this.board = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    }


    public void changeTurn() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public void putSign(int x) {
        if (x < 0 || x > 9) {
            System.out.println("Invalid board position");
            return;
        }
        if (board[x] != ' ') {
            System.out.println("Board position occupied");
            return;
        }
        board[x] = currentPlayer.getSymbol();
        this.currentPlayer.addMove(x);
    }

    public boolean areEqual(int winningMove[], int playerMoves[]) {
        int winningCount = 0;
        for (int index = 0; index < winningMove.length; index++) {
            for (int move = 0; move < playerMoves.length; move++) {
                if (playerMoves[move] == winningMove[index]) {
                    winningCount++;
                    break;
                }
            }
        }
        return winningCount == 3;
    }


    public boolean hasWon(Player player) {
        for (int i = 0; i < winningChances.length; i++) {
            if (areEqual(winningChances[i], player.getMoves())) {
                return true;
            }
        }
        return false;
    }

    public void displayWinner() {
        if (hasWon(currentPlayer)) {
            System.out.println(currentPlayer.getName() + " Won...!");
            isEmpty = false;
        } else if (!isEmpty) {
            System.out.println("its a tie");
        }
        changeTurn();
    }

    public void printBoard() {
        System.out.print("\n -------------\n");
        for (int i = 0; i < this.board.length; i++) {
            System.out.print(" | " + this.board[i]);
            if (i % 3 == 2) {
                System.out.print(" |\n -------------\n");
            }
        }
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}
