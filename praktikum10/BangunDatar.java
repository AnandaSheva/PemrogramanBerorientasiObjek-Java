/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author User
 */
public abstract class BangunDatar {
    private String warna ;
    
    public BangunDatar(String warna) {
        this.warna = warna;
    }

    public BangunDatar(){
        
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public double luas(){
        return 0;
    }
    
    public double keliling(){
        return 0;
    }

}
