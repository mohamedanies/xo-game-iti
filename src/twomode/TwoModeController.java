/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twomode;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import tec_tac_toe.Home;

/**
 * FXML Controller class
 *
 * @author hi-tech
 */
public class TwoModeController implements Initializable {

    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private ImageView Imgback;
    @FXML
    private TextField Textnamex;
    @FXML
    private TextField Textnameo;
    @FXML
    private Button Okbtn;
    @FXML
    private Button Cancelbtn;
    FXMLLoader fxmlLoader;
    Parent root1;
    Stage stage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Okbtn.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("esraa");

                try {

                    fxmlLoader = new FXMLLoader(getClass().getResource("gameboard.fxml"));
                    root1 = (Parent) fxmlLoader.load();
                    stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    //stage.initStyle(StageStyle.UNDECORATED);
                    stage.setTitle("Enter name");
                    stage.setScene(new Scene(root1));
                   stage.setResizable(false);
                    stage.show();
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }

}
