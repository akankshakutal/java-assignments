package com.step.assignment.ticTacToe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Player Name : ");
        String player1Name = scanner.next();

        System.out.println("Enter Second Player Name : ");
        String player2Name = scanner.next();

        Player player1 = new Player(player1Name,'X');
        Player player2 = new Player(player2Name,'O');
        TicTacToe ticTacToe = new TicTacToe(player1,player2);

        System.out.println(player1Name+" your Symbol is X");
        System.out.println(player2Name+" your Symbol is O");

        int x=0;
        while (ticTacToe.isEmpty){
            Player currentPlayer = ticTacToe.getCurrentPlayer();
            System.out.println(currentPlayer.getName() +"'s turn");
            x=scanner.nextInt();
            ticTacToe.makeMove(x);
            ticTacToe.printBoard();
        }
    }

}
