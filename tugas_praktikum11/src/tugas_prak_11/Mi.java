package tugas_prak_11;

public class Mi extends HpXiaomi {
    
    public Mi (String warna, String kamera, int ram, int penyimpanan ){
        this.warna = warna;
        this.kamera = kamera;
        this.ram = ram;
        this.penyimpanan = penyimpanan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public Integer getPenyimpanan() {
        return penyimpanan;
    }

    public void setPenyimpanan(Integer penyimpanan) {
        this.penyimpanan = penyimpanan;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }
       @Override
        public void print(int i){
        System.out.println("=== MI ===");
           System.out.println();
           System.out.println("Spesifikasi ");
        System.out.println("Warna       : " + this.warna);
        System.out.println("Kamera      : " + this.kamera);
        System.out.println("RAM         : " + this.ram + " Gb");
        System.out.println("Penyimpanan : " + this.penyimpanan + " Gb");
        System.out.println();
        System.out.println();
      }
}
