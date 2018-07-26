/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicalgameapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LogInController implements Initializable {
    
    @FXML
    private Label labelName;
    
    @FXML
    private Label labelPassword;
    
    @FXML
    private TextField txtFieldName;
    
    @FXML
    private TextField txtFieldPassword;
    
    @FXML
    private Hyperlink hyperForgotPassword;
    
    @FXML
    private Button btnFacebook;
    
    @FXML
    private Button btnGoogle;
    
    @FXML
    private Button btnStart;
    
    @FXML
    private void callForgotPassword(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("ForgotPassword.fxml"));
        
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
    @FXML
    private void callTutorial(ActionEvent event) throws IOException {
        
        //ProfileController prof = new ProfileController();
        ProfileController.name = txtFieldName.getText();
                                    
        Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
        
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
