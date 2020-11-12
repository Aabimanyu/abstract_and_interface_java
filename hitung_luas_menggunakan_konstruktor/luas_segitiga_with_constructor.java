package hitung_luas_menggunakan_konstruktor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author think
 */
public class luas_segitiga_with_constructor extends abstract_with_constructor{

    public luas_segitiga_with_constructor(double alas, double tinggi) {
        super(alas, tinggi);
    }

    
    @Override
    public double getLuas() {
        luas = 0.5 * this.alas * this.tinggi;
        return luas;
    }

    
    
    
}
