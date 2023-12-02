package tugas_prak_11;

public class Tugas_Prak_11 {

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

