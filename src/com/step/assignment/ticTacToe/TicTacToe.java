package com.step.assignment.ticTacToe;

                                                                                                                                                                                                                

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TicTacToe {
    private List<Player> players;
    private List<List> winningCombinations;
    private Player currentPlayer;
    public boolean isEmpty = true;
    private char[] board = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    public TicTacToe(Player player1,Player player2) {
        this.players = new ArrayList<>(2);
        this.players.add(player1);
        this.players.add(player2);
        winningCombinations = new ArrayList<>(8);
        winningCombinations.add(Arrays.asList(0, 1, 2));
        winningCombinations.add(Arrays.asList(3, 4, 5));
        winningCombinations.add(Arrays.asList(6, 7, 8));
        winningCombinations.add(Arrays.asList(0, 3, 6));
        winningCombinations.add(Arrays.asList(1, 4, 7));
        winningCombinations.add(Arrays.asList(2, 5, 8));
        winningCombinations.add(Arrays.asList(0, 4, 8));
        winningCombinations.add(Arrays.asList(2, 4, 6));
        this.currentPlayer = players.get(0);
    }

    public void makeMove(int x) {
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
        this.displayWinner();
        changeTurn();
    }


    private void changeTurn() {
        this.currentPlayer = this.currentPlayer==players.get(0) ? players.get(1):players.get(0);
    }

    private void displayWinner() {
        if (currentPlayer.hasWon(winningCombinations)) {
            System.out.println(currentPlayer.getName() + " Won...!");
            isEmpty = false;
            return;
        }

        int player1Moves = players.get(0).getMoves().size();
        int player2Moves = players.get(1).getMoves().size();

        if(player1Moves+player2Moves == 9 && isEmpty){
            System.out.println(" Game Draw...!");
            isEmpty = false;
            return;
        }
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
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
}