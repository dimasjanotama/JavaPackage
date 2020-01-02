package com.breakdll;

public class Main{
    public static void main(String[] args){
        // break, continue, dan return
        int a = 0;
        while(true){
            if(a==10){
                break; //ini keyword untuk memaksa keluar dari loop
            } else if (a==5){
                continue; //ini keyword untuk memaksa memulai loop dari awal
            } else if (a==7){
                return;
            }
            a++;
            System.out.println("looping ke - "+a);
        }
        System.out.println("akhir dari looping");
    }
}