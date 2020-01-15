package tec_tac_toe;

//import xogame.singleUser;
import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Home extends AnchorPane {

    protected final ImageView Background;
    protected final ImageView Logo;
    protected final Button SinglePlayer;
    protected final Button TwoPlayers;
    protected final Button OnlineGame;
    protected final Button Exit;
    FXMLLoader fxmlLoader;
    Parent root1;
    Stage stage;

    public Home() {

        Background = new ImageView();
        Logo = new ImageView();
        SinglePlayer = new Button();
        TwoPlayers = new Button();
        OnlineGame = new Button();
        Exit = new Button();

        setId("AnchorPane");
        setPrefHeight(501.0);
        setPrefWidth(439.0);

        Background.setFitHeight(510.0);
        Background.setFitWidth(439.0);
        Background.setPickOnBounds(true);
        Background.setImage(new Image("assets/bg.jpg"));

        Logo.setFitHeight(113.0);
        Logo.setFitWidth(126.0);
        Logo.setLayoutX(153.0);
        Logo.setLayoutY(21.0);
        Logo.setPickOnBounds(true);
        Logo.setImage(new Image("assets/logo.jpg"));

        SinglePlayer.setAlignment(javafx.geometry.Pos.CENTER);
        SinglePlayer.setLayoutX(97.0);
        SinglePlayer.setLayoutY(163.0);
        SinglePlayer.setMnemonicParsing(false);
        SinglePlayer.setOpacity(0.83);
        SinglePlayer.setPrefHeight(50.0);
        SinglePlayer.setPrefWidth(246.0);
        SinglePlayer.setText("Single Player");
        SinglePlayer.setTextFill(javafx.scene.paint.Color.valueOf("#163a4d"));
        SinglePlayer.setCursor(Cursor.HAND);
        SinglePlayer.setFont(new Font("Castellar", 22.0));

        TwoPlayers.setLayoutX(97.0);
        TwoPlayers.setLayoutY(240.0);
        TwoPlayers.setLineSpacing(5.0);
        TwoPlayers.setMnemonicParsing(false);
        TwoPlayers.setOpacity(0.83);
        TwoPlayers.setPrefHeight(50.0);
        TwoPlayers.setPrefWidth(246.0);
        TwoPlayers.setText("Two Players");
        TwoPlayers.setTextFill(javafx.scene.paint.Color.valueOf("#163a4d"));
        TwoPlayers.setFont(new Font("Castellar", 22.0));
        TwoPlayers.setCursor(Cursor.HAND);

        OnlineGame.setLayoutX(97.0);
        OnlineGame.setLayoutY(312.0);
        OnlineGame.setMnemonicParsing(false);
        OnlineGame.setOpacity(0.83);
        OnlineGame.setPrefHeight(50.0);
        OnlineGame.setPrefWidth(246.0);
        OnlineGame.setText("Online Game");
        OnlineGame.setTextFill(javafx.scene.paint.Color.valueOf("#163a4d"));
        OnlineGame.setFont(new Font("Castellar", 22.0));
        OnlineGame.setCursor(Cursor.HAND);

        Exit.setCancelButton(true);
        Exit.setLayoutX(97.0);
        Exit.setLayoutY(388.0);
        Exit.setMnemonicParsing(false);
        Exit.setOpacity(0.83);
        Exit.setPrefHeight(50.0);
        Exit.setPrefWidth(246.0);
        Exit.setText("Exit");
        Exit.setTextFill(javafx.scene.paint.Color.valueOf("#163a4d"));
        Exit.setFont(new Font("Castellar", 22.0));
        Exit.setCursor(Cursor.HAND);

        getChildren().add(Background);
        getChildren().add(Logo);
        getChildren().add(SinglePlayer);
        getChildren().add(TwoPlayers);
        getChildren().add(OnlineGame);
        getChildren().add(Exit);

        SinglePlayer.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("hello");
                try {

                    fxmlLoader = new FXMLLoader(getClass().getResource("/singlemode/single.fxml"));
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
        TwoPlayers.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {

                try {

                    fxmlLoader = new FXMLLoader(getClass().getResource("/twomode/twoMode.fxml"));
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
        OnlineGame.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
//                Alert alert = new Alert(Alert.AlertType.INFORMATION);
////            alert.setResizable(true);
//                Label label1 = new Label("Please Enter server ip address");
//                TextField textField = new TextField();
//                HBox hb = new HBox();
//                hb.getChildren().addAll(label1, textField);
//                
//                        
//                alert.setTitle("Enter server ip");
////                alert.setDialogPane(h);
//                alert.getDialogPane().setMinHeight(100);
//                alert.getDialogPane().setMinWidth(100);
//                TextInputDialog dialog = new TextInputDialog("walter");
//                dialog.setTitle("Text Input Dialog");
//                dialog.setHeaderText("Please enter server ip address");
//                dialog.setContentText("Server ip:");
//                Optional<String> result = dialog.showAndWait();
//                if (result.isPresent()) {
//                    System.out.println("your ip is: " + result.get());
//                }

                try {

                    fxmlLoader = new FXMLLoader(getClass().getResource("/networkmode/Registeration.fxml"));
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
        Exit.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("hello");
//                stage.hide();
                ((Node) (event.getSource())).getScene().getWindow().hide();

            }
        });
    }
}
