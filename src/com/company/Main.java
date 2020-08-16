package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        var dir = Path.of("C:/Users/Rasťo/Desktop/sudoku/in/");

        File sudoku = new File("C:/Users/Rasťo/Desktop/sudoku/in/top95.txt");

        var files = Files.list(dir);

       /* files.forEach(file -> {
            .solve(file)
        });
*/

        Input input = new Input();
        input.createInput(sudoku);
        Backtracking filling = new Backtracking(input.getInput());


        System.out.println("Nevyriešené sudoku:");
        filling.printarray();
        if (filling.backtracking()) {
            System.out.println("Vyriešené sudoku:");
            filling.printarray();
        } else System.out.println("Sudoku nemá riešenie");


    }
}
