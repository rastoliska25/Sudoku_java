package com.company;

public class Zisteniecisla {
    int velkost = 9;
    int pole[][] =
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







    boolean riadok(int riadokcislo, int cislo) {

        for (int i = 0; i < velkost; i++)
            if (pole[riadokcislo][i] == cislo) {
                return true;
            }
            return false;

    }

    boolean stlpec (int stlpeccislo, int cislo){
        for (int i = 0; i<velkost; i++)
            if (pole[i][stlpeccislo]==cislo) {
                return true;
            }
            return false;

    }

    boolean stvorec (int stlpeccislo, int riadokcislo, int cislo){
        int x = 0;
        int y = 0;
        if (stlpeccislo<3)  x=3;
        else if (stlpeccislo<6) x=6;
        else if (stlpeccislo<9) x=9;

        if (riadokcislo<3)  y=3;
        else if (riadokcislo<6) y=6;
        else if (riadokcislo<9) y=9;

for (int i = x-3; i<x; i++){
    for (int j = y-3; j<y; j++){
if (pole[i][j]==cislo) return true;
    }
}
return false;

    }


    boolean mozemdosadit(int riadokcislo, int stlpeccislo, int cislo){
if (!stlpec(stlpeccislo,cislo)&&!riadok(riadokcislo,cislo)&&!stvorec(riadokcislo,stlpeccislo,cislo)) return true;
return false;
    }

}
