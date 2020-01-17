

package networkmode;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Mina
 */
public class listViewController implements Initializable {

    @FXML
    private AnchorPane myPane;
    @FXML
    private ImageView image;
    @FXML
    private ListView<String> listOfPlayers;
    public static ObservableList<String> items = FXCollections.observableArrayList();
   
        

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listOfPlayers.setItems(items);
//        listOfPlayers.getItems().add("hhh");
           items.add("jvkgiuj");
           items.add("njmbk.jmb");
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
