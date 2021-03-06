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
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class DrawerMenuController implements Initializable {
    
    @FXML
    private Button btnResume;
    
    @FXML
    private Button btnRestart;
    
    @FXML
    private Button btnProfile;
    
    @FXML
    private Button btnSettings;
    
    @FXML
    private Button btnChangeUser;

    
    @FXML
    private void callGame(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
        
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
    @FXML
    private void callProfile(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Profile.fxml"));
        
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
    @FXML
    private void callSettings(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
        
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
    @FXML
    private void callChangeUser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        
        
    }
    
}
