package kelompok9tubes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SplashScreenController implements Initializable {

    private AnchorPane AnchorPane2;
    @FXML
    private AnchorPane Pane;
    @FXML
    private ProgressBar Barprogress;
    @FXML
    private ImageView LogoToko;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        splash();
    }

    public void splash() {
        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
            Platform.runLater(() -> {
                try {
                    AnchorPane2 = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(AnchorPane2);
                    stage.setTitle("Cashier Management");
                    stage.setScene(scene);
                    stage.setMinHeight(400);
                    stage.setMinWidth(600);
                    stage.show();
                    Pane.getScene().getWindow().hide();
                } catch (IOException ex) {
                    Logger.getLogger(SplashScreenController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        }).start();
    }
}
