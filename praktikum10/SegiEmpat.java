/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author User
 */
public class SegiEmpat extends BangunDatar {
    private double sisi;

    public SegiEmpat(double sisi, String warna) {
        super(warna);
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
        return Math.PI * this.sisi * this.sisi;
    }
    @Override
    public double keliling(){
        return Math.PI * 4 * this.sisi;
    }   
}