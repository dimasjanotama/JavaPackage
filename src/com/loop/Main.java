package com.loop;

public class Main{
    public static void main(String[] args){

        // WHILE LOOP
        int a = 0;
        boolean kondisi=true;

        System.out.println("------------AWAL PROGRAM");
        while(kondisi) {
            System.out.println(a);
            a++;
            if(a==10){
                kondisi = false;
            }
        }
        System.out.println("------------AKHIR PROGRAM");

        // DO WHILE LOOP
        int b = 0;
        boolean kondisi2 = true;

        System.out.println("--------------INI AWAL PROGRAM");
        do {
            b++;
            System.out.println(b);
            if(b==10){
                kondisi2 = false;
            }
        } while(kondisi2);

        System.out.println("---------------INI AKHIR PROGRAM");

        // FOR LOOP
        int c;
        int d=0;
        int e=0;

        System.out.println("---------------INI AWAL PROGRAM");
        System.out.println("-----LOOP PERTAMA");
        for(c=0; c<10; c++){
            System.out.println(c);
        }
        System.out.println("-----LOOP KEDUA");
        for(; d<10; d++){
            System.out.println(d);
        }
        // System.out.println("-----LOOP KETIGA(INFINITE)");
        // for(; true; ){
        //     System.out.println(e);
        // }
        System.out.println("---------------INI AKHIR PROGRAM");


    }
}