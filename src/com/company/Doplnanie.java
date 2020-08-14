package com.company;

public class Doplnanie {

    Zisteniecisla empty = new Zisteniecisla();

    boolean emptybox(int rowNumber, int columnNumber) {
        if (empty.sudoku[rowNumber][columnNumber] == 0) return true;
        return false;
    }

    boolean backtracking() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (emptybox(i, j)) {
                    for (int x = 1; x < 9; x++) {
                    }
                }
            }
        }
return false;

    }
}
