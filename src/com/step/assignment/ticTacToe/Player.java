package com.step.assignment.ticTacToe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Player {
    private String name;
    private char symbol;
    private List<Integer> moves;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
        this.moves = new ArrayList<>();
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

    public boolean hasWon(List winningCombinations) {
        return winningCombinations.stream().anyMatch(moveSet -> {
            return this.getMoves().containsAll((Collection<?>) moveSet);
        });
    }
}
