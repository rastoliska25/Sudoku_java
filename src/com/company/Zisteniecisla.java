package com.company;

public class Zisteniecisla {
    int size = 9;
    int sudoku[][] =
            {

                    {5, 3, 0, 0, 7, 0, 0, 0, 0},
                    {6, 0, 0, 1, 9, 5, 0, 0, 0},
                    {0, 9, 8, 0, 0, 0, 0, 6, 0},
                    {8, 0, 0, 0, 6, 0, 0, 0, 3},
                    {4, 0, 0, 8, 0, 3, 0, 0, 1},
                    {7, 0, 0, 0, 2, 0, 0, 0, 6},
                    {0, 6, 0, 0, 0, 0, 2, 8, 0},
                    {0, 0, 0, 4, 1, 9, 0, 0, 5},
                    {0, 0, 0, 0, 8, 0, 0, 7, 9},

            };







    boolean row(int rownumber, int cislo) {

        for (int i = 0; i < size; i++)
            if (sudoku[rownumber][i] == cislo) {
                return true;
            }
            return false;

    }

    boolean column (int columnNumber, int fillNumber){
        for (int i = 0; i<size; i++)
            if (sudoku[i][columnNumber]==fillNumber) {
                return true;
            }
            return false;

    }

    boolean stvorec (int columnNumber, int rowNumber, int fillNumber){
        int x = 0;
        int y = 0;
        if (columnNumber<3)  x=3;
        else if (columnNumber<6) x=6;
        else if (columnNumber<9) x=9;

        if (rowNumber<3)  y=3;
        else if (rowNumber<6) y=6;
        else if (rowNumber<9) y=9;

for (int i = x-3; i<x; i++){
    for (int j = y-3; j<y; j++){
if (sudoku[i][j]==fillNumber) return true;
    }
}
return false;

    }


    boolean mozemdosadit(int rowNumber, int columnNumber, int fillNumber){
if (!column(columnNumber,fillNumber)&&!row(rowNumber,fillNumber)&&!stvorec(rowNumber,columnNumber,fillNumber)) return true;
return false;
    }

}
