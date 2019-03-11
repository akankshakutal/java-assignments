package com.step.assignment.ticTacToe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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

    @Test
    void hasWin() {
        List<List> integers = new ArrayList<>(8);
        integers.add(Arrays.asList(0, 1, 2));
        assertEquals(false,player.hasWon(integers));
        player.addMove(0);
        player.addMove(1);
        player.addMove(2);
        assertEquals(true,player.hasWon(integers));

    }


}
