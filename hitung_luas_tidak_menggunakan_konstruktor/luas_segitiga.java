package hitung_luas_tidak_menggunakan_konstruktor;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author think
 */
public class luas_segitiga extends abstract_seluruh{
    public void hitungSegitiga(){
        Scanner input = new Scanner(System.in);
         tinggi = 0;alas = 0;luas = 0;
        System.out.printf("Masukan Tinggi : ");
        tinggi = input.nextDouble();
        
        System.out.printf("Masukan Alas   : ");
        alas = input.nextDouble();
        
        luas = alas*tinggi*0.5;
        System.out.println("Luas Segitiga : " + luas +" cm2");
    }
}
