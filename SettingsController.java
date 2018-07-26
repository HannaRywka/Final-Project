/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicalgameapplication;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class SettingsController implements Initializable {
    
    @FXML
    private Label labelSettings;
    
    @FXML
    private Label labelOption1;
    
    @FXML
    private Label labelOption2;
    
    @FXML
    private Label labelOption3;
    
    @FXML
    private Label labelOption4;
    
    @FXML
    private Label labelOption5;
    
    @FXML
    private Label labelOption6;
    
    @FXML
    private ImageView imgSettings;
    
    @FXML
    private Button btnBackGame;

    @FXML
    private JFXHamburger btnHamburger;

    @FXML
    private JFXDrawer menuDrawer;
    
    @FXML
    private void callBackGame(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
        
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
         try {
            // TODO

            VBox box = FXMLLoader.load(getClass().getResource("DrawerMenu.fxml"));
            
            menuDrawer.setSidePane(box);

            HamburgerBackArrowBasicTransition burguerTask2 = new HamburgerBackArrowBasicTransition(btnHamburger);
            burguerTask2.setRate(-1);

            btnHamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) ->{
                burguerTask2.setRate( burguerTask2.getRate() * -1);
                burguerTask2.play();

                if(menuDrawer.isOpened()){
                    menuDrawer.close();
                } else {
                    menuDrawer.open();
                }
                
            });
            
          } catch (IOException ex) {
            Logger.getLogger(TestController.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
    }    
        
    
}
