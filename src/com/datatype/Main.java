package com.datatype;

public class Main{
    public static void main(String[] args){
        // Integer, byte, short, long, double, folat, char, boolean

        // integer
        int i = 2147483647;
        System.out.println("--------------------------------INTEGER");
        System.out.println(i);
        System.out.println("Nilai max = "+ Integer.MAX_VALUE);
        System.out.println("Nilai min = "+ Integer.MIN_VALUE);
        System.out.println("Besar integer = "+ Integer.BYTES + " byte");
        System.out.println("Besar integer = "+ Integer.SIZE+ " bit");

        // Byte
        int b = 2147483647;
        System.out.println("---------------------------------BYTE");
        System.out.println(b);
        System.out.println("Nilai max = "+ Byte.MAX_VALUE);
        System.out.println("Nilai min = "+ Byte.MIN_VALUE);
        System.out.println("Besar byte = "+ Byte.BYTES + " byte");
        System.out.println("Besar byte = "+ Byte.SIZE+ " bit");

        // Short
        int s = 2147483647;
        System.out.println("---------------------------------SHORT");
        System.out.println(s);
        System.out.println("Nilai max = "+ Short.MAX_VALUE);
        System.out.println("Nilai min = "+ Short.MIN_VALUE);
        System.out.println("Besar short = "+ Short.BYTES + " byte");
        System.out.println("Besar short = "+ Short.SIZE+ " bit");

        // Byte
        int l = 2147483647;
        System.out.println("---------------------------------LONG");
        System.out.println(l);
        System.out.println("Nilai max = "+ Long.MAX_VALUE);
        System.out.println("Nilai min = "+ Long.MIN_VALUE);
        System.out.println("Besar Long = "+ Long.BYTES + " byte");
        System.out.println("Besar Long = "+ Long.SIZE+ " bit");
    }
}