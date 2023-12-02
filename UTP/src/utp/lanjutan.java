/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp;

/**
 *
 * @author User
 */
public class lanjutan {
    public class Nilai {
    private String mataKuliah;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;

    public Nilai() {
        this.mataKuliah = null;
        this.nilaiTugas = 0;
        this.nilaiUts = 0;
        this.nilaiUas = 0;
    }

    public Nilai(String mataKuliah) {
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = 0;
        this.nilaiUts = 0;
        this.nilaiUas = 0;
    }

    public Nilai(String mataKuliah, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    public double hitungNA() {
        double na = (nilaiTugas * 0.3) + (nilaiUts * 0.3) + (nilaiUas * 0.4);
        return na;
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
    
    public String mutuNilai() {
        double na = hitungNA();
        if (na >= 76) {
            return "A";
        } else if (na >= 71) {
            return "B+";
        } else if (na >= 66) {
            return "B";
        } else if (na >= 61) {
            return "C+";
        } else if (na >= 56) {
            return "C";
        } else if (na >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}

public class Mahasiswa {
    private String nama;
    private String npm;
    private Nilai nilai;

    public Mahasiswa(String nama, String npm, Nilai nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    public Mahasiswa() {
        this.nama = null;
        this.npm = null;
        this.nilai = new Nilai();
    }

    public void print() {
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("Mata Kuliah : " + nilai.getMataKuliah());
        System.out.println("Nilai Tugas : " + nilai.getNilaiTugas());
        System.out.println("Nilai UTS : " + nilai.getNilaiUts());
        System.out.println("Nilai UAS : " + nilai.getNilaiUas());
        System.out.println("Nilai Akhir : " + nilai.hitungNA());
        System.out.println("Mutu Nilai : " + nilai.mutuNilai());
    }
}
}
