package com.company;

public class Doplnanie {

    Zisteniecisla empty = new Zisteniecisla();

    boolean prazdne(int riadokcislo, int stlpeccislo) {
        if (empty.pole[riadokcislo][stlpeccislo] == 0) return true;
        return false;
    }

    boolean doplnit() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (prazdne(i, j)) {
                    for (int x = 1; x < 9; x++) {
                    }
                }
            }
        }
return false;

    }
}
