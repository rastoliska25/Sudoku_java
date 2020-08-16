package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Backtracking filling = new Backtracking();

        File sudoku = new File("C:/Users/Rasťo//Desktop/sudoku/in/2006.txt");
        Scanner sc = new Scanner(sudoku);

        System.out.println(sc.nextLine());


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
