/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum_11;

/**
 *
 * @author User
 */
public class Praktikum_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran(10, "Merah");
        BangunDatar segitiga = new Segitiga(13, 5, "Biru");
        BangunDatar segiempat = new SegiEmpat(5, "Hitam");
        
        BangunDatar[] bangunDatar = new BangunDatar[3];
        bangunDatar[0] = lingkaran;
        bangunDatar[1] = segitiga;
        bangunDatar[2] = segiempat;
        
        for (int i = 0; i < 3; i++){
            bangunDatar[i].print();
        }
    }
}
