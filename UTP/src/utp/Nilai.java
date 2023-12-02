/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp;

/**
 *
 * @author User
 */
public class Nilai {
    private String mataKuliah;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;

    public Nilai() {
        this.mataKuliah = "";
        this.nilaiTugas = 0.0;
        this.nilaiUts = 0.0;
        this.nilaiUas = 0.0;
    }

    public Nilai(String mataKuliah) {
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = 0.0;
        this.nilaiUts = 0.0;
        this.nilaiUas = 0.0;
    }

    public Nilai(String mataKuliah, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public double hitungNA() {
        double bobotTugas = 0.3;
        double bobotUts = 0.3;
        double bobotUas = 0.4;

        double NA = (nilaiTugas * bobotTugas) + (nilaiUts * bobotUts) + (nilaiUas * bobotUas);
        return NA;
    }
}
class Mahasiswa {
    private String nama;
    private String npm;
    private Nilai nilai;

    public Mahasiswa(String nama, String npm, Nilai nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Constructor default.
    public Mahasiswa() {
        this.nama = "";
        this.npm = "";
        this.nilai = new Nilai();
    }

    public void print() {
    System.out.println("Nama : " + (nama.isEmpty() ? "null" : nama));
    System.out.println("NPM : " + (npm.isEmpty() ? "null" : npm));
    
    String mataKuliah = (nilai != null && nilai.getMataKuliah() != null) ? nilai.getMataKuliah() : "null";
    
    System.out.println("Mata Kuliah : " + (mataKuliah.isEmpty() ? "null" : mataKuliah));
    System.out.println("Nilai Tugas : " + nilai.getNilaiTugas());
    System.out.println("Nilai UTS : " + nilai.getNilaiUts());
    System.out.println("Nilai UAS : " + nilai.getNilaiUas());
    System.out.println("Nilai Akhir : " + nilai.hitungNA());
    }
}
