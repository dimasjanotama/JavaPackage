package com.scanner;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Java sudah ada library nya (library adalah class2 yang sudah dibuat oleh java) contoh Scanner
        Scanner userInput = new Scanner(System.in); //new Scanner() adalah object dari Class Scanner

        // Penghitungan luas persegi panjang
        System.out.println("-----Program Hitung Luas-------");
        System.out.print("Panjang = ");
        int panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        int lebar = userInput.nextInt();
        int luas = panjang * lebar;
        System.out.println("Luas = "+luas);
        System.out.println("-----Program Hitung Volume-------");
        System.out.print("Tinggi = ");
        int tinggi = userInput.nextInt();
        int volume = luas * tinggi;
        System.out.println("Volume = "+volume);
        
    }
}