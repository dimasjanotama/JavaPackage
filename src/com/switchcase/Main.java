package com.switchcase;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String input;
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Panggil nama: ");
        input = inputUser.next(); // untuk ngambil integer pake nextInt, kalo string cuma next() aja

        // Ekspresi berupa satuan (int,long,byte,short), string, enum
        switch(input){
            case "otong":
                System.out.println("Otong hadir");
                break;
            case "ucup":
                System.out.println("Ucup hadir");
            case "mario":
                System.out.println("Mario hadir");
                break;
            default:
                System.out.println(input+ " tidak hadir");
        }
        // Berbeda dengan IF ELSE pada SWITCH CASE ketika case(ekspresion) true maka default tetap dijalankan
        // Untuk membuat sama seperti IF ELSE digunakan break;

        // ketika case pertama TRUE dan ada break, program akan berhenti tapi, jika tidak ada break akan menjalankan
        // semua case dibawahnya dan akan berhenti ketika ada break
        System.out.println("-----------PROGRAM SELESAI");

    }
}