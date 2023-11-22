package jdbc.project;

import db.DBHelper;
import java.util.ArrayList;

public class JdbcProject {

    public static void main(String[] args) {
//        DBHelper.getConnection();
        MahasiswaModel mhs = new MahasiswaModel();
                    
           Mahasiswa mhs1 = new Mahasiswa("2217051096", "Muhammad Ferdiansyah");
           mhs.deleteMahasiswa(mhs1);
            ArrayList<Mahasiswa> mahasiswa = mhs.getMahasiswa();
            
            for(int i = 0; i < mahasiswa.size(); i++){
                System.out.println("Nama : " + mahasiswa.get(i).getNama());
                System.out.println("NPM : " + mahasiswa.get(i).getNpm());
            }
        
            
    }
    
}
