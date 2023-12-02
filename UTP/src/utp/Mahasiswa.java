/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp;

/**
 *
 * @author User
 */
public class Mahasiswa {
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
}
