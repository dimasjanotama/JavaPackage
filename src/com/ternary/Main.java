package com.ternary;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Variabel x = ekspresi ? statement_true : statement_false

        int input,x;

        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("masukkan nilai: ");
        input = inputUser.nextInt();

        x = (input == 10) ? (input*input) : (input/2);
        System.out.println("hasilnya = "+ x);
    }
}