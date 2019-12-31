package com.logic;

public class Main{
    public static void main(String[] args){
        // Operator logika adl operasi yang bisa dilakukan pada tipe data boolean
        // TRUE = 1, FALSE = 0
        // OR adalah tambah, AND adalah kali, XOR, negasi

        boolean a,b,c;
        // OR ||
        System.out.println("-------------------------------OR");
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a+ " || "+b + " = " +c);

        // AND &&
        System.out.println("-------------------------------AND");
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a+ " && "+b + " = " +c);

        // XOR / exclusive or (^)
        System.out.println("-------------------------------XOR (^)");
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a+ " ^ "+b + " = " +c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a+ " ^ "+b + " = " +c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a+ " ^ "+b + " = " +c);
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a+ " ^ "+b + " = " +c);

        // NOT / negasi --> flipping (!)
        System.out.println("-------------------------------NOT");
        a = true;
        c = !a;
        System.out.println(a+ " ! = " +c);
    }
}