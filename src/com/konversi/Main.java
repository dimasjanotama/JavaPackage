package com.konversi;

public class Main{
    public static void main(String[] args){
        int nilaiInt = 450; //32-bit
        System.out.println("nilai Int = "+ nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar (tidak akan bermasalah)
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = "+ nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil (akan menghilangkan nilai aslinya)
        byte nilaiByte = (byte)nilaiInt; //solusinya dengan casting menambah (byte) / tipe datanya
        System.out.println("nilai byte = "+ nilaiByte); //karena byte maksimal 127 maka 450 tidak bisa ditampilkan

        // Casting pembagian
        float a = 10;
        int b = 4;

        float c = a/b;
        System.out.printf("%f / %d = %f\n",a,b,c); //%f karena hasil float (float dibagi int hasilnya float)

        // Untuk tidak perlu ribet pakai saja casting di hasil (z) dengan syntax (float) x/y
        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf("%d / %d = %f\n",x,y,z); //%f karena hasil float (float dibagi int hasilnya float)


    }
}