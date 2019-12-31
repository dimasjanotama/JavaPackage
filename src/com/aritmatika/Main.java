package com.aritmatika;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // aritmatika dalam java dilakukan dengan menghitung perkalian dan pembagian terlebih dahulu
        // jika dilakukan perkalian dan pembagian akan dilakukan dari kiri ke kanan, begitu juga dg tambah kurang

        Scanner userInput = new Scanner(System.in);
        // perhitungan persamaan kuadrat
        System.out.println("-----------MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m = ");
        m = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();
        int y = (m*x*x) + c;

        System.out.println("nilai y = "+y);
        
    }
}