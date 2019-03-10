package com.step.assignment.ticTacToe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PlayerTest {

    Player player = new Player("Akanksha",'X');

    @Test
    void getName() {
        assertEquals("Akanksha",player.getName());
    }

    @Test
    void getSymbol() {
        assertEquals('X',player.getSymbol());
    }

}
