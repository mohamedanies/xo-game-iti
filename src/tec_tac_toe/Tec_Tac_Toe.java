
package tec_tac_toe;

import java.net.InetAddress;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Tec_Tac_Toe extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Parent root = new Home();
        Scene scene = new Scene(root); 
        scene.getStylesheets().add(getClass().getResource("/style/game.css").toExternalForm());
         stage.setScene(scene);
         stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
