/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listview;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author hi-tech
 */
public class listViewController implements Initializable {

    private Label label;
    @FXML
    private AnchorPane myPane;
    private ImageView image;
    @FXML
    public static ListView<String> listOfPlayers;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        image = new ImageView();
        listOfPlayers = new ListView(FXCollections.observableList(Arrays.asList("one", "2", "3")));
        label = new Label();
//        listViewController.listOfPlayers.getItems().add("sdfdsfdsf");
        listOfPlayers.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {

            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                System.out.println("clicked on " + listOfPlayers.getSelectionModel().getSelectedItem());
            }
        });
    }

    public void handleMouseClick(MouseEvent arg0) {
        System.out.println("clicked on " + listOfPlayers.getSelectionModel().getSelectedItem());
    }

}
