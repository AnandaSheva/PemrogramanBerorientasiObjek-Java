/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author User
 */
public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(double jari, String warna) {
        super(warna);
        this.jari = jari;
    }

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double luas(){
        return Math.PI * this.jari * this.jari;
    }
    @Override
    public double keliling(){
        return Math.PI * this.jari * 2;
    }
}