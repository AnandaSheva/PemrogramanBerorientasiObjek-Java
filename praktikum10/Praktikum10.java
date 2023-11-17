/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum10;

/**
 *
 * @author User
 */
public class Praktikum10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
BangunDatar bd = new BangunDatar("Hitam");
System.out.println("Warna bangun datar: " + bd.getWarna());
System.out.println();

Lingkaran lingkaran = new Lingkaran(26.0,"Merah");
System.out.println("Luas lingkaran: " + String.format("%.2f", lingkaran.luas()));
System.out.println("Keliling lingkaran: " + String.format("%.2f", lingkaran.keliling()));
System.out.println("Warna Segi Empat" + lingkaran.getWarna());
System.out.println();

Segitiga segitiga = new Segitiga(15, 7, "Merah");
System.out.println("Luas segitiga: " + segitiga.luas());
System.out.println("Keliling segitiga: " + segitiga.keliling());
System.out.println("Warna Segi Empat" + segitiga.getWarna());
System.out.println();

SegiEmpat segiempat = new SegiEmpat(10, "kuning");
System.out.println("Luas segiempat: " + segiempat.luas());
System.out.println("Keliling segiempat: " + segiempat.keliling());
System.out.println("Warna Segi Empat" + segiempat.getWarna());
System.out.println();


    }
    
}
