package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zadajte riadok, stlpec a cislo");
String x1=sc.nextLine();
String y1=sc.nextLine();
String z1=sc.nextLine();

int x = Integer.parseInt(x1);
int y = Integer.parseInt(y1);
int z = Integer.parseInt(z1);



        Zisteniecisla a = new Zisteniecisla();
        Doplnanie b = new Doplnanie();

        System.out.println(a.mozemdosadit(x,y,z));
        System.out.println(b.prazdne(x,y));



    }
}
