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
public class luas_lingkaran_with_constructor1 extends abstract_with_constructor2{

    public luas_lingkaran_with_constructor1(double diameter, double jari, double pi) {
        super(diameter, jari, pi);
    }

    @Override
    public double getLuas() {
        double jari = this.diameter/2;
        double luas = 3.14 * jari * jari;
        return luas;
    }
    
}
