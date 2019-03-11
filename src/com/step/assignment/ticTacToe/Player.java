package com.step.assignment.ticTacToe;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private char symbol;
    private List moves;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
        this.moves = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void addMove(Integer move) {
        moves.add(move);
    }

    public List getMoves() {
        return moves;
    }
}
