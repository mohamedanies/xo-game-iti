/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkmode;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

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
    Socket s;
    DataInputStream dis;
    PrintStream ps;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Thread th;
        th =new Thread(this);
        th.start();
        Go.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
                if(UserName.getText()!=null&&Password.getText()!=null){
                    try {
                        ps=new PrintStream(s.getOutputStream());
                        ps.println("login"+"."+ UserName.getText() + "." + Password.getText());
                        UserName.clear();
                        Password.clear();
                    } catch (IOException ex) {
                        Logger.getLogger(RegisterationController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }   
        });
        register.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
                if(UserName.getText()!=null&&Password.getText()!=null){
                    try {
                        ps=new PrintStream(s.getOutputStream());
                        ps.println("register"+"."+ UserName.getText()+"."+ Password.getText());
                        UserName.clear();
                        Password.clear();
                    } catch (IOException ex) {
                        Logger.getLogger(RegisterationController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }   
        });
        
    }
@Override
        public void run(){
        
        while(true){
            try {
                s=new Socket("127.0.0.1", 5005);
                dis=new DataInputStream(s.getInputStream());   
                String reply=dis.readLine();
                if(reply.equals("valid"))
                    System.out.println("valid :D");
           
                
            } catch (IOException ex) {
              //  Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
//              TextArea.clear();
//              TextArea.setText("Server is disconnected...");
//              break;
            }
            
        }
        }    
    
}
