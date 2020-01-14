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
