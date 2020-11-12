package hitung_luas_menggunakan_konstruktor;

import java.util.Scanner;


public abstract class abstract_with_constructor2{
    protected double luas,diameter,jari,pi;

    public abstract_with_constructor2() {
        this.luas = 0;
        this.diameter = 0;
        this.jari = 0;
        this.pi = 0;
    }

    public abstract_with_constructor2(double diameter, double jari, double pi) {
        
        this.diameter = diameter;
        this.jari = jari;
        this.pi = pi;
    }

   public abstract double getLuas(); 

    public double getDiameter() {
        return diameter;
    }

    public double getJari() {
        return jari;
    }

    public double getPi() {
        return pi;
    }
   
    
    
}
