package com.komparasi;

public class Main{
    public static void main(String[] args){
        // operator komparasi menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        // operator persamaan
        System.out.println("-----------------------------PERSAMAAN");
        a = 10;
        b = 5;
        hasilKomparasi = (a==b);
        System.out.printf("%d apakah sama dengan %d ? %s\n",a,b, hasilKomparasi); //s% adalah string
        // komparasi bisa dibandingkan mau itu int atau float

        // operator pertidaksamaan
        System.out.println("-----------------------------PERTIDAKSAMAAN");
        a = 10;
        b = 5;
        hasilKomparasi = (a!=b);
        System.out.printf("%d apakah tidak sama dengan %d ? %s\n",a,b, hasilKomparasi); 

        // operator less than
        System.out.println("-----------------------------KURANG DARI");
        a = 10;
        b = 5;
        hasilKomparasi = (a<b);
        System.out.printf("%d apakah kurang dari dengan %d ? %s\n",a,b, hasilKomparasi); 

        // operator greater than
        System.out.println("-----------------------------LEBIH DARI");
        a = 10;
        b = 5;
        hasilKomparasi = (a>b);
        System.out.printf("%d apakah lebih dari dengan %d ? %s\n",a,b, hasilKomparasi); 

        // untuk kurang dari dan sama dengan, sama dengan syntax JAVASCRIPT <= dan >=
    }
}