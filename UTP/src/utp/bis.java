/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class bis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double jarak = input.nextDouble();
        double waktu = input.nextDouble();

        double kecepatan = (jarak/1000) / waktu;

        String kategori_kecepatan = "";
        if (kecepatan > 80) {
            kategori_kecepatan = "Cepat";
        } else if (40 < kecepatan && kecepatan <= 80) {
            kategori_kecepatan = "Normal";
        } else {
            kategori_kecepatan = "Lambat";
        }

        System.out.printf("%.2f%n", kecepatan);
        System.out.println(kategori_kecepatan);

        input.close();
    }
}