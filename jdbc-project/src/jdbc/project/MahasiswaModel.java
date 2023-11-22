package jdbc.project;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class MahasiswaModel {
    private final Connection CONN;

    public MahasiswaModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public void addMahasiswa(Mahasiswa mhs){
        String insert = "INSERT INTO `mhs` VALUES ('" + mhs.getNpm() + "','" + mhs.getNama() + "')";
        System.out.println(insert);
        
        try {
            if (CONN.createStatement().executeUpdate(insert)>0){
            System.out.println("Berhasil Memasukkan Data");
        } else{
                System.out.println("Gagal Memasukkan Data");
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Memasukkan Data");
        }
    }
    public ArrayList<Mahasiswa> getMahasiswa(){
        String query = "SELECT * FROM `mhs`";
        ArrayList<Mahasiswa> mhs = new ArrayList();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            
              while(rs.next()){
                 Mahasiswa temp = new Mahasiswa(rs.getString("npm"), rs.getString("nama"));
                 mhs.add(temp);
              }      
            } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mhs;
    }
   public void updateMahasiswa(Mahasiswa mhs){
       String update =  "UPDATE `mhs` SET `nama`='" + mhs.getNama() + "'WHERE `npm`='" + mhs.getNpm() + "'";
       System.out.println(update);
       
        try {
            if (CONN.createStatement().executeUpdate(update) > 0){
                System.out.println("Berhasil Mengupdate Data");
            } else {
                System.out.println("Gagal Mengupdate Data");
            }
                    } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Mengupdate Data");
        }
     } 
   public void deleteMahasiswa(Mahasiswa mhs){
       String delete = "DELETE FROM `mhs` WHERE `npm`='" + mhs.getNpm() + "'";
       System.out.println(delete);
       
        try {
            if (CONN.createStatement().executeUpdate(delete) > 0){
                System.out.println("Berhasil Menghapus Data");
            } else {
                System.out.println("Gagal Menghapus Data");
            }
                    
            } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Menghapus Data");
       }
   }
}
