package com.company;

public class Conditions {
    int[][] sudoku;


    public Conditions(int[][] sudoku) {
        this.sudoku = sudoku;


    }


    boolean box(int columnNumber, int rowNumber, int fillNumber) {
        int x = 0;
        int y = 0;
        if (columnNumber < 3) x = 3;
        else if (columnNumber < 6) x = 6;
        else if (columnNumber < 9) x = 9;

        if (rowNumber < 3) y = 3;
        else if (rowNumber < 6) y = 6;
        else if (rowNumber < 9) y = 9;

        for (int i = x - 3; i < x; i++) {
            for (int j = y - 3; j < y; j++) {
                if (sudoku[i][j] == fillNumber) return true;
            }
        }
        return false;

    }


    boolean checkNumberInRow(int rowNumber, int fillNumber) {

        for (int i = 0; i < 9; i++)
            if (sudoku[rowNumber][i] == fillNumber) {
                return true;
            }
        return false;

    }


    boolean checkNumberInColumn(int columnNumber, int fillNumber) {
        for (int i = 0; i < 9; i++)
            if (sudoku[i][columnNumber] == fillNumber) {
                return true;
            }
        return false;

    }


    boolean conditions(int rowNumber, int columnNumber, int fillNumber) {
        return !checkNumberInColumn(columnNumber, fillNumber) && !checkNumberInRow(rowNumber, fillNumber) && !box(rowNumber, columnNumber, fillNumber);
    }

}


