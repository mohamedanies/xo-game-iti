/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlemode;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import tec_tac_toe.Home;
import static twomode.TwoModeController.nameo;
import static twomode.TwoModeController.namex;

/**
 *
 * @author mohamedx
 */
public class singleFormController implements Initializable {

    private Label label;
    @FXML
    private AnchorPane Anchorpane;
    @FXML
    private ImageView Imgback;
    @FXML
    private TextField Textname;
    @FXML
    public RadioButton ChooseX;

    @FXML
    private RadioButton ChooseY;
    @FXML
    private Button Okbtn;
    @FXML
    private Button Cancelbtn;
    FXMLLoader fxmlLoader;
    Parent root1;
    Stage stage;
    boolean xSelected;
    boolean ySelected;
    public static String namex;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final ToggleGroup group = new ToggleGroup();

        //RadioButton rb1 = new RadioButton("Home");
        ChooseX.setToggleGroup(group);
        //ChooseX.setSelected(true);

        //RadioButton rb2 = new RadioButton("Calendar");
        ChooseY.setToggleGroup(group);


        Okbtn.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                if (Textname.getText() != null && Textname.getText().length() != 0 && Textname.getText() != " ") {
                    namex = Textname.getText() + " :";
                } else {
                    namex = "playerx " + ":";
                }
                try {

                    fxmlLoader = new FXMLLoader(getClass().getResource("gameboard.fxml"));
                    root1 = (Parent) fxmlLoader.load();
                    stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setTitle("Enter name");
                    stage.setScene(new Scene(root1));
                    stage.setResizable(false);
                    stage.show();
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
              Cancelbtn.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {

                Stage stage = (Stage) Cancelbtn.getScene().getWindow();
                stage.close();

            }

        });
        ChooseX.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GameboardController.xTurn = true;
                GameboardController.oTurn = false;
        
            }
        });
        ChooseY.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GameboardController.xTurn = false;
                GameboardController.oTurn = true;
            }
        });
    }

}
