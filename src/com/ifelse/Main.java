package com.ifelse;

public class Main{
    public static void main(String[] args){
        int a = 10;

        // IF ELSE 
        System.out.println("------------IF ELSE");
        if(a==5){
            System.out.println("Selesai");
        } else {
            System.out.println("This is a branch");
        }
        System.out.println("selesai");

        // IF ELSE IF
        System.out.println("------------IF ELSE IF");
        a = 12;
        System.out.println("ini adalah AWAL program");
        if(a==5){
            System.out.println("ini action 1");
        } else if(a==10){
            System.out.println("ini action 2");
        } else {
            System.out.println("ini action default");
        }
        System.out.println("ini adalah AKHIR program");

        // IF NESTED
        System.out.println("--------------IF NESTED");


    }
    
}