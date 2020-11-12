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
public class luas_lingkaran extends abstract_seluruh{
    public void hitungLingkaran(){
        Scanner input = new Scanner(System.in);
        luas = 0 ; diameter = 0 ;pi = 3.14;jari  = 0;
        System.out.printf("Masukan diameter lingkaran : ");
        diameter = input.nextDouble();
        jari = diameter/2;
        luas = pi* jari * jari;
        System.out.println("Luas lingkaran : " + luas + " cm2");
    }
}
