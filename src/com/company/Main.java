package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
      Backtracking filling = new Backtracking();
        File sudoku = new File("C:/Users/Rasťo//Desktop/sudoku/in/2006.txt");
        Scanner sc = new Scanner(sudoku);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();


           for (char c:line.toCharArray()){
               if ((c<58)&&(c>47)) System.out.print(c);
               else if (c=='.') System.out.print(0);

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
