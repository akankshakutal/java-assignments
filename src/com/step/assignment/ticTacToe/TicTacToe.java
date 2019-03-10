package com.step.assignment.ticTacToe;

class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private char[] board;
    public boolean isEmpty = true;
    private int[][] winningChances =new int[][] {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    public TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = this.player1;
        this.board =new char[] {' ',' ',' ',' ',' ',' ',' ',' ',' '};
    }


    public void changeTurn(){
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public void putSign(int x) {
        if(x<0 || x>9 )
        {
            System.out.println("Invalid board position");
            return;
        }
        if(board[x] != ' ')
        {
            System.out.println("Board position occupied");
            return;
        }
        board[x] = currentPlayer.getSymbol();
        this.currentPlayer.addMove(x);
    }

    public boolean areEqual(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        while (i < 3 && j < 3) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
                if (j == 3)
                    return true;
            }
            else {
                i++;
                j = 0;
            }
        }
        return false;
    }


    public boolean hasWon(Player player) {
        for (int i = 0; i <winningChances.length ; i++) {
            if(areEqual(winningChances[i],player.getMoves())){
                return true;
            }
        }
        return false;
    }

    public void displayWinner() {
        if(hasWon(currentPlayer)) {
            System.out.println(currentPlayer.getName()+" Won...!");
            isEmpty=false;
        }
        else if(!isEmpty) {
            System.out.println("its a tie");
        }
        changeTurn();
    }

    public void printBoard(){
        System.out.print("\n -------------\n");
        for (int i = 0; i <this.board.length ; i++) {
            System.out.print( " | " + this.board[i]);
            if(i%3 == 2){
                System.out.print(" |\n -------------\n");
            }
        }
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}
