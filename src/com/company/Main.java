package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        Path dir = Path.of("C:/Users/Rasťo/Desktop/sudoku/in/");

        List<Path> files = Files.list(dir).collect(Collectors.toList());


        for (Path file : files) {

            System.out.println("solving: " + file.getFileName());
            List<Sudoku> sudokuList = Input.createInput(file.toFile());

            for (Sudoku sudoku : sudokuList) {
                Backtracking filling = new Backtracking(sudoku.input);
                System.out.println("Nevyriešené sudoku:");
                filling.printarray();
                if (filling.backtracking()) {
                    System.out.println("Vyriešené sudoku:");
                    filling.printarray();
                } else System.out.println("Sudoku nemá riešenie");

            }


        }
    }
}