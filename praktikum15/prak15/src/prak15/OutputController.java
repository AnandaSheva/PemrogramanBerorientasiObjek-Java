package prak15;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OutputController {

    @FXML
    private Button btnDataBaru;

    @FXML
    private Label soutAlamat;

    @FXML
    private Label soutNama;

    @FXML
    private Label soutNpm;
    
    public void showValue(Mahasiswa mhs){
        soutNpm.setText(mhs.getNpm());
        soutNama.setText(mhs.getNama());
        soutAlamat.setText(mhs.getAlamat());
    }

    @FXML
    void pergiKeInput(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("FormInput.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnDataBaru.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    

}
