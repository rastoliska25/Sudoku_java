package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {


    static List<Sudoku> createInput(File sudoku) throws FileNotFoundException {


        List<Sudoku> sudokuList = new ArrayList<>(); //vytvorí prázdne pole (nekonečny list)

        Scanner sc = new Scanner(sudoku);
        int i = 0;
        int j = 0;
        int amount = 0;
        int[][] input = new int[9][9];
        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            for (char c : line.toCharArray()) {
                amount++;
                if ((c < 58) && (c > 47)) {

                    input[i][j] = c - 48;
                    j++;
                    if (j % 9 == 0) {
                        j = 0;
                        i++;
                        if (i == 9) break;
                    }
                } else if (c == '.' || c == ' ') {
                    input[i][j] = 0;
                    j++;
                    if (j % 9 == 0) {
                        j = 0;
                        i++;
                        if (i == 9) break;
                    }

                }


            }
            if (amount % 81 == 0) {
                sudokuList.add(new Sudoku(input));
                input = new int[9][9];
                i = 0;
                j = 0;
            }
        }

        return sudokuList;
    }
}