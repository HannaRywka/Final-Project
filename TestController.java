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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;


public class TestController implements Initializable {


    @FXML
    private AnchorPane anchorpane;

    @FXML
    private JFXHamburger hamburguer;

    @FXML
    private JFXDrawer drawer;
    
    @FXML
    private Button das;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO

            VBox box = FXMLLoader.load(getClass().getResource("DrawerMenu.fxml"));
        
        
            drawer.setSidePane(box);

            HamburgerBackArrowBasicTransition burguerTask2 = new HamburgerBackArrowBasicTransition(hamburguer);
            burguerTask2.setRate(-1);

            hamburguer.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) ->{
                burguerTask2.setRate( burguerTask2.getRate() * -1);
                burguerTask2.play();



                if(drawer.isOpened()){
                    drawer.close();
                } else {
                    drawer.open();
                }


            });
            
          } catch (IOException ex) {
            Logger.getLogger(TestController.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
    }    
    
}
