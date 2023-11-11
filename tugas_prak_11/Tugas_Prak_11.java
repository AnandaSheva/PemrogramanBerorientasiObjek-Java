/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_prak_11;

/**
 *
 * @author User
 */
public class Tugas_Prak_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HpXiaomi[] hpxiaomi = new HpXiaomi[3];

        hpxiaomi[0] = new Redmi ("Forest Green", "24 MP", 6, 128);
        hpxiaomi[1] = new Mi  ("Deep Black", "108 MP", 12, 512);
        hpxiaomi[2] = new Poco ("Ocean Blue", "48 MP", 8, 256);
    
        for (int i = 0; i < 3; i++){
           hpxiaomi[i].print(i);
        }    
    }   
}