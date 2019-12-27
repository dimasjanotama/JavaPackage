package com.operator;

public class Main{
    public static void main(String[] args){
        // Penjumlahan
        int var1 = 12;
        int var2 = 5;
        int hasil;

        hasil = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + hasil);
        // pengurangan 
        hasil = var1 - var2;
        System.out.printf("%d + %d = %d \n", var1, var2, hasil);
        
        // perkalian 
        hasil = var1 * var2;
        System.out.printf("%d x %d = %d \n", var1, var2, hasil);
        // nilai "hasil" akan berubah sesuai perintah diatas
        
        // pembagian 
        hasil = var1 / var2;
        System.out.printf("%d / %d = %d \n", var1, var2, hasil);
        // karena pake koma maka akan tetep bulat karena integer

        float a = 12;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        // modulus (sisa pembagian)
        hasil = var1 % var2;
        System.out.printf("%d %% %d = %d \n", var1, var2, hasil);
        // untuk menulis string % harus ditulis dua kali %%
    }
}