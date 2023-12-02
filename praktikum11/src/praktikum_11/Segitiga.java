/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_11;

/**
 *
 * @author User
 */
public class Segitiga extends BangunDatar {
    private double alas;
    
    private double tinggi;
    
public Segitiga(double alas, double tinggi, String warna) {
        this.warna = warna;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
     @Override
    public double luas(){
        return 0.5 * this.alas * this.tinggi;
    }
    @Override
    public double keliling(){
        return 3 * this.alas;
    }   
    
     @Override
    public void print(){
        System.out.println("Segitiga");
        System.out.println("Warna : " + this.warna);
         System.out.println("Alas : " + this.alas);
        System.out.println("Luas : " +this.luas());
        System.out.println("Keliling : " + this.keliling());
        System.out.println();
    }
}
