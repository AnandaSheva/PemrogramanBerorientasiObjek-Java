/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_11;

/**
 *
 * @author User
 */
public class Lingkaran extends BangunDatar {
    private double jari;
    
    public Lingkaran(double jari, String warna){
        this.jari= jari;
        this.warna = warna;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    @Override
    public double keliling(){
        return 2 * Math.PI * this.jari;
    }
    
    @Override
    public double luas(){
        return Math.PI * this.jari * this.jari;
    }
    
    @Override
    public void print(){
        System.out.println("Lingkaran");
        System.out.println("Warna : " + this.warna);
        System.out.println("Jari-jari :" + this.jari);
        System.out.println("Luas : " +this.luas() );
        System.out.println("Keliling : " + this.keliling());
        System.out.println();
    }
}

