/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkmode;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

import java.util.Optional;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import tec_tac_toe.Home;

/**
 * FXML Controller class
 *
 * @author Mina
 */
public class RegisterationController extends Thread implements Initializable {

    @FXML
    private ImageView Background;
    @FXML
    private TextField UserName;
    @FXML
    private Label NameLabel;
    @FXML
    private Label PassLabel;
    @FXML
    private TextField Password;
    @FXML
    private ImageView Logo;
    @FXML
    private Button Go;
    @FXML
    private Button register;
    @FXML
    private Label label;

    Socket s;
    DataInputStream dis;
    PrintStream ps;

    String serverIp;
    FXMLLoader fxmlLoader;
    Parent root;
    Stage stage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Thread th;
        th = new Thread(this);

//        TextInputDialog dialog = new TextInputDialog("walter");
//        dialog.setTitle("Text Input Dialog");
//        dialog.setHeaderText("Please enter server ip address");
//        dialog.setContentText("Server ip:");
//        Optional<String> result = dialog.showAndWait();
//        if (result.isPresent()) {
//            System.out.println("your ip is: " + result.get());
//            serverIp = result.get();
//           
//        }
        serverIp = Home.serverIp;
        th.start();

        Go.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                if (UserName.getText() != null && Password.getText() != null) {

                    if (!(UserName.getText().contains(".")) || !(Password.getText().contains("."))) {
                        try {
                            ps = new PrintStream(s.getOutputStream());
                            ps.println("login" + "." + UserName.getText() + "." + Password.getText());
                            UserName.clear();
                            Password.clear();
                            try {

                                fxmlLoader = new FXMLLoader(getClass().getResource("listView.fxml"));
                                root = (Parent) fxmlLoader.load();
                                stage = new Stage();
                                stage.initModality(Modality.APPLICATION_MODAL);
                                stage.setTitle("Active users");
                                stage.setScene(new Scene(root));
                                stage.setResizable(false);
                                stage.show();
                            } catch (IOException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(RegisterationController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        label.setText("(.)charcter is not allowed");

                    }
                }
            }
        });
        register.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                if (UserName.getText() != null && Password.getText() != null) {
                    label.setVisible(false);
                    String user = UserName.getText();
                    String pass = Password.getText();
                    if (user.indexOf(".") == -1 && pass.indexOf(".") == -1) {
                        try {
                            ps = new PrintStream(s.getOutputStream());
                            ps.println("register" + "." + UserName.getText() + "." + Password.getText());
                            UserName.clear();
                            Password.clear();
                        } catch (IOException ex) {
                            Logger.getLogger(RegisterationController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        label.setVisible(true);
                        label.setText("(.) is not allowed");
                    }
                } else {
                    label.setVisible(true);
                    label.setText("You Must Insert UserName And Password");
                }
            }
        });

    }

    @Override
    public void run() {

        while (true) {
            try {

//                System.out.println(serverIp);
                s = new Socket("127.0.0.1", 5005);

                dis = new DataInputStream(s.getInputStream());
                String reply = dis.readLine();
                if (reply.equals("valid")) {
                    System.out.println("valid :D");
                }

            } catch (IOException ex) {
                //  Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
//              TextArea.clear();
//              TextArea.setText("Server is disconnected...");
//              break;
            }

//            10.140.200.207
        }
    }

}
