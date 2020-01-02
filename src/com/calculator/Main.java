package com.calculator;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // a operator b
        // IF ELSE CALCULATORR

        // Scanner inputUser;
        // float a,b,hasil;
        // char operator;

        // inputUser = new Scanner(System.in);

        // System.out.print("Nilai a : ");
        // a = inputUser.nextFloat();
        // System.out.print("Operator  : ");
        // operator = inputUser.next().charAt(0); //charAt(0) artinya mengambil karkter paling depan makanya 0
        // System.out.print("Nilai b : ");
        // b = inputUser.nextFloat();

        // System.out.println("input user: "+a +" "+operator+ " "+b);

        // // operator * / + -
        // if (operator == '+'){
        //     hasil = a+b;
        //     System.out.println("hasil = " + hasil);
        // } else if(operator == '-'){
        //     hasil = a-b;
        //     System.out.println("hasil = " + hasil);
        // } else if(operator == '*'){
        //     hasil = a*b;
        //     System.out.println("hasil = " + hasil);
        // } else if(operator== '/'){
        //     if(b==0){
        //         System.out.println("pembagi nol menghasilkan tak hingga");
        //     }else{
        //         hasil = a/b;
        //         System.out.println("hasil = " + hasil);
        //     }
        // } else {
        //     System.out.println("-------------OPERATOR TIDAK DITEMUKAN");
        // }

        // SWITCH CASE CALCULATOR

        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();
        
        switch(operator){
            case "+":
                hasil = a+b;
                System.out.println("hasil = "+hasil);
                break;
            case "-":
                hasil = a-b;
                System.out.println("hasil = "+hasil);
                break;
            case "*":
                hasil = a*b;
                System.out.println("hasil = "+hasil);
                break;
            case "/":
                hasil = a/b;
                System.out.println("hasil = "+hasil);
                break;
            default:
                System.out.println("operator "+operator+" tidak ditemukan");

        }
    }
}