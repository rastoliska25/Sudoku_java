package com.company;

public class Backtracking {
    int[][] sudokuin;


    Conditions numberTry;

    public Backtracking(int[][] input) {
        sudokuin = input;
        numberTry = new Conditions(sudokuin);
    }


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
                            } else {
                                numberTry.sudoku[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }

        }
        return true;
    }


    public void printarray() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(numberTry.sudoku[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }


}
