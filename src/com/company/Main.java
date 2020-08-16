package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int[][] input = new int[9][9];

        Backtracking filling = new Backtracking();
        File sudoku = new File("C:/Users/Rasťo/Desktop/sudoku/in/2006.txt");
        Scanner sc = new Scanner(sudoku);
        int i = 0;
        int j = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            for (char c : line.toCharArray()) {
                if ((c < 58) && (c > 47)) {

                    input[i][j]=c-48;
                    j++;
                    if (j % 9 == 0) {
                        j=0;
                        i++;
                        if (i==9) break;
                    }
                }
            else if (c == '.') {
                    input[i][j]=0;
                    j++;
                    if (j % 9 == 0) {
                        j= 0;
                        i++;
                        if (i==9) break;
                    }

                }


            /*

            for (int q = 0; q<line.length();q++){
                if ((line.charAt(q)<58)&&(line.charAt(q)>47)){
                    input [0][0]= (line.charAt(q))-48;
                }


*/



            }

        }



            for (int a = 0; a<9;a++){
                for (int b=0;b<9;b++){
                    System.out.print(input[a][b]);
                }
                System.out.println();
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
