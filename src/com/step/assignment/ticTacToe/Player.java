package com.step.assignment.ticTacToe;

public class Player {
    private String name;
    private char symbol;
    private int[] moves;
    private int index = 0;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
        this.moves = new int[]{9, 9, 9, 9, 9};
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void addMove(int move) {
        moves[index] = move;
        index++;
    }

    public int[] getMoves() {
        return moves;
    }
}
