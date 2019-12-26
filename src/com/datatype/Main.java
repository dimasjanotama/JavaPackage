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
        byte b = 127;
        System.out.println("---------------------------------BYTE");
        System.out.println(b);
        System.out.println("Nilai max = "+ Byte.MAX_VALUE);
        System.out.println("Nilai min = "+ Byte.MIN_VALUE);
        System.out.println("Besar byte = "+ Byte.BYTES + " byte");
        System.out.println("Besar byte = "+ Byte.SIZE+ " bit");

        // Short
        short s = 32767;
        System.out.println("---------------------------------SHORT");
        System.out.println(s);
        System.out.println("Nilai max = "+ Short.MAX_VALUE);
        System.out.println("Nilai min = "+ Short.MIN_VALUE);
        System.out.println("Besar short = "+ Short.BYTES + " byte");
        System.out.println("Besar short = "+ Short.SIZE+ " bit");

        // Byte
        long l = 922L;
        System.out.println("---------------------------------LONG");
        System.out.println(l);
        System.out.println("Nilai max = "+ Long.MAX_VALUE);
        System.out.println("Nilai min = "+ Long.MIN_VALUE);
        System.out.println("Besar Long = "+ Long.BYTES + " byte");
        System.out.println("Besar Long = "+ Long.SIZE+ " bit");

        // Double (koma, bilangan real)
        double d = 10.5D;
        System.out.println("---------------------------------DOUBLE");
        System.out.println(d);
        System.out.println("Nilai max = "+ Double.MAX_VALUE);
        System.out.println("Nilai min = "+ Double.MIN_VALUE);
        System.out.println("Besar Double = "+ Double.BYTES + " byte");
        System.out.println("Besar Double = "+ Double.SIZE+ " bit");

        // Float (koma, bilangan real)
        float f = 9.5F;
        System.out.println("---------------------------------FLOAT");
        System.out.println(f);
        System.out.println("Nilai max = "+ Float.MAX_VALUE);
        System.out.println("Nilai min = "+ Float.MIN_VALUE);
        System.out.println("Besar Float = "+ Float.BYTES + " byte");
        System.out.println("Besar Float = "+ Float.SIZE+ " bit");

        // Char (koma, bilangan real) berdasarkan ASCII
        char c = 'c';
        System.out.println("---------------------------------CHAR");
        System.out.println(c);
        System.out.println("Nilai max = "+ Character.MAX_VALUE);
        System.out.println("Nilai min = "+ Character.MIN_VALUE);
        System.out.println("Besar Character = "+ Character.BYTES + " byte");
        System.out.println("Besar Character = "+ Character.SIZE+ " bit");

        // Boolean (koma, bilangan real)
        boolean val = true;
        System.out.println("---------------------------------BOOLEAN");
        System.out.println(val);
        System.out.println("Nilai max = "+ Boolean.TRUE);
        System.out.println("Nilai min = "+ Boolean.FALSE);
    }
}