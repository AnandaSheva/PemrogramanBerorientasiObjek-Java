/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_11;

/**
 *
 * @author User
 */
public class SegiEmpat extends BangunDatar {
        private double sisi;

    public SegiEmpat(double sisi, String warna) {
        this.warna = warna;
        this.sisi = sisi;
    }

    public SegiEmpat(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double luas(){
        return this.sisi * this.sisi;
    }
    @Override
    public double keliling(){
        return 4 * this.sisi;
    } 
     @Override
    public void print(){
        System.out.println("Segiempat");
        System.out.println("Warna : " + this.warna);
        System.out.println("Sisi : " + this.sisi);
        System.out.println("Luas : " +this.luas() );
        System.out.println("Keliling : " + this.keliling());
        System.out.println();
    }
}
