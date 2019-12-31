package com.logicalpractice;

import java.util.*;

public class Main{
    public static void main(String[] args){
        // Mmebuat objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // Sebuah program untuk menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan nilai tebakan anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah = "+nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda "+ statusTebakan);

        // operasi aljabar boolean (and/or)
        System.out.println("Masukkan nilai antara 4-9");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan>4) && (nilaiTebakan<9);
        System.out.println("tebakan anda: "+statusTebakan);
    }
}