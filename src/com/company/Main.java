package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int[][] input = new int[9][9];

        Backtracking filling = new Backtracking();
        File sudoku = new File("C:/Users/Rasťo//Desktop/sudoku/in/2006.txt");
        Scanner sc = new Scanner(sudoku);
        int i = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            for (char c : line.toCharArray()) {
                if ((c < 58) && (c > 47)) {
                    System.out.print(c);
                    i++;
                    if (i % 9 == 0) {
                        System.out.println();
                    }
                } else if (c == '.') {
                    System.out.print(c);
                    i++;
                    if (i % 9 == 0) {
                        System.out.println();
                    }
                }


            }

        }







     /*   System.out.println("Nevyriešené sudoku:");
        filling.printarray();
        if (filling.backtracking()) {
              System.out.println("Vyriešené sudoku:");
              filling.printarray();
}
        else System.out.println("Sudoku nemá riešenie");
*/


    }
}
