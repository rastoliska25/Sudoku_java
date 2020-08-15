package com.company;

public class Doplnanie {

    int[][] sudokuin =
            {
                    {9,0,0,1,0,0,0,0,5},
                    {0,0,5,0,9,0,2,0,1},
                    {8,0,0,0,4,0,0,0,0},
                    {0,0,0,0,8,0,0,0,0},
                    {0,0,0,7,0,0,0,0,0},
                    {0,0,0,0,2,6,0,0,9},
                    {2,0,0,3,0,0,0,0,6},
                    {0,0,0,2,0,0,9,0,0},
                    {0,0,1,9,0,4,5,7,0},
            };



    Zisteniecisla numberTry = new Zisteniecisla(sudokuin);

    boolean emptybox(int rowNumber, int columnNumber) {
        return numberTry.sudoku[rowNumber][columnNumber] == 0;
    }

    boolean backtracking() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (emptybox(i, j)) {
                    for (int x = 1; x < 10; x++) {
                        if (numberTry.conditions(i, j, x)) {
                            numberTry.sudoku[i][j] = x;
                            if (backtracking()) {
                                return true;
                            }
                            else {
                                numberTry.sudoku[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }

        } return true;
    }


    public void finished(){
        for (int i = 0; i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(numberTry.sudoku[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }



}
