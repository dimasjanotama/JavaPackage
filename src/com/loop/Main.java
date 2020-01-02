package com.loop;

public class Main{
    public static void main(String[] args){

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

    }
}