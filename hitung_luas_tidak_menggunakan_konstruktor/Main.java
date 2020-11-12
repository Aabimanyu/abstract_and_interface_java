/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung_luas_tidak_menggunakan_konstruktor;

import java.util.Scanner;

/**
 *
 * @author think
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu;
        Scanner input = new Scanner(System.in);
        System.out.println("=== Perhitungan Luas ===\n");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Luas Segitiga");
        
        System.out.print("Pilih salah satu : ");
        menu = input.next();
        
        switch(menu){
            case "1" :
        luas_lingkaran p = new luas_lingkaran();
        p.hitungLingkaran();
        break;
            case "2":
        luas_segitiga o = new luas_segitiga();
        o.hitungSegitiga();
        break;
        }
    }
    
}
