package kelompok9tubes;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DashboardController implements Initializable {
    String pilihan = "";
    int harga_makanan;
    int bayar, beli, Harga;

    @FXML
    private AnchorPane AnchorPane2;
    @FXML
    private Label Judul;
    @FXML
    private ComboBox<String> Combo;
    @FXML
    private TextField TeksHarga;
    @FXML
    private Button BtnBatal;
    @FXML
    private TextField TeksBeli;
    @FXML
    private TextField TeksJumlahharga;
    @FXML
    private TextField TeksBayar;
    @FXML
    private TextField TeksKembalian;
    @FXML
    private Button BtnKeluar;
    @FXML
    private Button BtnHarga;
    @FXML
    private Button BtnKembalian;
    @FXML
    private Label Label1;
    @FXML
    private Label Label2;
    @FXML
    private Label Label3;
    @FXML
    private Label Label4;
    @FXML
    private Label Label5;
    @FXML
    private Label Label6;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       String [] items = {"Roti","Susu","Es Krim"};
       Combo.getItems().addAll(items);
        // Inisialisasi elemen-elemen GUI atau logika lainnya
        // ...
    }
    @FXML
    private void ComboActionPerformed(ActionEvent event) {
        pilihan = (String) Combo.getValue();
        switch (pilihan)
        {
            case "Roti":
                harga_makanan = 3000;
                break;
            case "Es Krim":
                harga_makanan = 5000;
                break;
            case "Susu":
                harga_makanan = 8000;
                break;    
                    
        }
        TeksHarga.setText(""+Integer.toString(harga_makanan));
    }

  

    @FXML
    private void BtnHargaActionPerformed(ActionEvent event) {
        Harga = Integer.parseInt(TeksHarga.getText());
        beli = Integer.parseInt(TeksBeli.getText());
        bayar = Harga * beli;

        DecimalFormat ankga;
        ankga = new DecimalFormat("###,###");
        TeksJumlahharga.setText("Rp. " + Integer.toString(bayar));
    }

    @FXML
    private void BtnBatalActionPerformed(ActionEvent event) {
        TeksBayar.setText("");
        TeksBeli.setText("");
        TeksHarga.setText("");
        TeksKembalian.setText("");
        TeksJumlahharga.setText("");
    }

    @FXML
    private void BtnKeluarActionPerformed(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void BtnKembalianActionPerformed(ActionEvent event) {
        int kembali = Integer.parseInt(TeksBayar.getText());
        int total = kembali - bayar;

        TeksKembalian.setText("Rp. " + Integer.toString(total));
    }
}
