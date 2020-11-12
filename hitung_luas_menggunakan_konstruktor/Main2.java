/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung_luas_menggunakan_konstruktor;

/**
 *
 * @author think
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        luas_segitiga_with_constructor p = new luas_segitiga_with_constructor(5,2);
        System.out.println("Luas segitiga : " + p.getLuas() + " cm2");
        
        luas_lingkaran_with_constructor1 o = new luas_lingkaran_with_constructor1(10, 2, 2);
        System.out.println("Luas Lingkaran : "+ o.getLuas()+ " cm2");
    }
    
}
