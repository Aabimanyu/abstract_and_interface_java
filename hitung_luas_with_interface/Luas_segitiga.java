package hitung_luas_with_interface;

import java.util.Scanner;


class Luas_segitiga implements hitung_Luas_segitiga{

    @Override
    public void hitungLuasSegitiga(){
        Scanner p = new Scanner(System.in);
        double tinggi,alas,luas;
        System.out.print("Masukan Nilai Tinggi Segitiga : ");
        tinggi = p.nextDouble();
        
        System.out.print("Masukan Nilai Alas Segitiga : ");
        alas = p.nextDouble();
        
        luas = alas * tinggi * 0.5;
        System.out.println("Luas Segitiga : "+ luas + " cm2");
    }

}
