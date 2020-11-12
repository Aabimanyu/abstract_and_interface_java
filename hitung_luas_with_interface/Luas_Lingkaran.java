package hitung_luas_with_interface;

import java.util.Scanner;


class Luas_Lingkaran implements hitung_Luas_lingkaran{

    @Override
    public void hitungLuasLingkaran(){
        Scanner p = new Scanner(System.in);
        double diameter,jari,pi = 3.14,luas;
        System.out.print("Masukan Diameter Lingkaran : ");
        diameter = p.nextDouble();
        
        jari = diameter * 0.5;
        luas = pi * jari * jari;
        
        System.out.println("Luas Lingkaran : " + luas + " cm2");
    }

}
