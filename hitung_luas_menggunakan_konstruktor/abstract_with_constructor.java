package hitung_luas_menggunakan_konstruktor;

import java.util.Scanner;


public abstract class abstract_with_constructor{
    protected double luas,alas,tinggi;

    public abstract_with_constructor() {
        
        this.alas = 0;
        this.tinggi = 0;
    }


    public abstract_with_constructor(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public abstract double getLuas();  

    public double getAlas() {
        return alas;
    }

    
    public double getTinggi() {
        return tinggi;
    }
    
    
}
