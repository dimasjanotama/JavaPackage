package com.ucup;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        String x = "TEST SUCCESFUL";
        System.out.println(x);
    }
}

// How to make package and class to run by JVM :
// 1. Buat folder bin dan src --> com --> buat folder (nama)
// 2. Buat Main.java di folder tsb
// 3. Compile dengan java compiler : arahkan ke folder src, run:
//          javac [folder letak Main.java] -d [direktori dimana com dll mau disimpan (folder class bin)]
//          javac com/ucup/Main.java -d ../bin 