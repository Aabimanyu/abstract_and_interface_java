package hitung_luas_with_interface;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String menu;
        Scanner inputMenu = new Scanner(System.in);
        
        System.out.println("=== MENU === \n");
        System.out.println("1. Hitung Luas Segitiga");
        System.out.println("2. Hitung Luas Lingkaran");
        System.out.print("Masukan Pilihan Anda : ");
        menu = inputMenu.next();
        
        switch(menu){
            case "1" : 
                System.out.println(" ");
        Luas_segitiga output = new Luas_segitiga();
        output.hitungLuasSegitiga();
        break;
        
            case "2" :
              System.out.println(" ");
        Luas_Lingkaran outputLingkaran = new Luas_Lingkaran();
        outputLingkaran.hitungLuasLingkaran();
        break;
    }
    
}
}
