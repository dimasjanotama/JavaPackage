package com.unary;

public class Main{
    public static void main(String[] args){
        // Unary = operasi yang dilakukan pada 1 variabel saja

        // unary plus minus
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n", angka,+angka);
        System.out.printf("unary '-', %d menjadi %d\n", angka,-angka);

        // unary increment dan decrement
        int angka2 = 10;
        angka2++;
        System.out.println(angka2);

        int angka3 = 10;
        angka3--;
        System.out.println(angka3);

        int a=5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);
        int b=5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++);
        // KENAPA BEGITU? karena ++a artinya dia menambahkan baru ditampilkan, sdgkan a++ ditampilkan dulu 
        // baru dijumlahkan

        // unary boolean
        boolean ucup = true;
        System.out.println("nilai boolean = "+ ucup);
        System.out.println("nilai boolean = "+ !ucup);
        // negasi ! tdk bisa diaply di int, -td bisa diaply di boolean
    }
}