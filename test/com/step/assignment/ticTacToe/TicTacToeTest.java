package com.step.assignment.ticTacToe;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    Player player1 = new Player("Akanksha",'O');
    Player player2 = new Player("Pratiksha",'X');
    TicTacToe ticTacToe = new TicTacToe(player1,player2);

    @Test
    void hasWin() {
        assertEquals(false,ticTacToe.hasWon(player1));
        player2.addMove(0);
        player2.addMove(1);
        player2.addMove(2);
        assertEquals(true,ticTacToe.hasWon(player2));

    }


    @Test
    void areEqual() {
        boolean actual = ticTacToe.areEqual(new int[]{1,2,3},new int[]{1,2,3});
        assertEquals(true,actual);
        actual = ticTacToe.areEqual(new int[]{1,2,5},new int[]{4,6,7});
        assertEquals(false,actual);
        actual = ticTacToe.areEqual(new int[]{1,2,3},new int[]{1,2,4});
        assertEquals(false,actual);
    }

}