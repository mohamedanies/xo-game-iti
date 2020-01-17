package networkmode;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author hi-tech
 */
public class listViewController implements Initializable {

    private Label label;
    @FXML
    private AnchorPane myPane;
    @FXML
    private ImageView image;
    @FXML
    private ListView<String> listOfPlayers;
    ObservableList<String> items = FXCollections.observableArrayList();
   
            
//    items.add();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         items.add("esraa");
        listOfPlayers.setItems(items);
//        listOfPlayers.getItems().add("hhh");
    }

    @FXML
    public void handleMouseClick(MouseEvent arg0) {
        System.out.println("clicked on " + listOfPlayers.getSelectionModel().getSelectedItem());
    }

//    @FXML
//    public void handleMouseClick(MouseEvent arg0) {
//        System.out.println("clicked on " + listOfPlayers.getSelectionModel().getSelectedItem());
//    }
}
