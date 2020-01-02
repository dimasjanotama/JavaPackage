package com.looppractice;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int awal, akhir, total;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan awal : ");
        awal = inputUser.nextInt(); 
        System.out.print("Masukkan akhir : ");
        akhir = inputUser.nextInt(); 
        for(total=0;awal<=akhir;awal++){
            total += awal; 
            System.out.println("ditambah "+awal+" menjadi "+total);
        }
        System.out.println("Nilai total = "+total);

        // FIBONACCI

        
    }
}