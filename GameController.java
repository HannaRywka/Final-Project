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
import java.time.Duration;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class GameController implements Initializable {
    
    private boolean check1 = false;
    private boolean check2 = false;
    private int count = 0;
     
    @FXML
    private Label labelGame;

    @FXML
    private Label labelAnimalSpeak;

    @FXML
    private Label labelTimer;
   
    @FXML
    private ImageView imgAnimal;
    
    @FXML
    private ImageView imgBalloon;
    
    @FXML
    private ImageView imgMusicalNote;
    
    @FXML
    private ImageView imgMusicalScale;
    
    @FXML
    private Button btnHold;

    @FXML
    private JFXHamburger btnHamburger;

    @FXML
    private JFXDrawer menuDrawer;
    
    @FXML
    private Media media;
    
    @FXML
    private MediaPlayer mediaplayer;
    
    @FXML
    private boolean firstBeatCheck = false;
    
    @FXML
    private boolean secondBeatCheck = false;
    
    @FXML
    private boolean thirdBeatCheck = false;
    
    @FXML
    private boolean fourthBeatCheck = false;
    
    
    /*
    @FXML
    private void callNoteSound(ActionEvent event) throws IOException {
        System.out.println("disturbed");
    }
*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
            // Attributes
        Timer timerMoveToMainMenu = new java.util.Timer();
        
        //cbMenu.getItems().addAll("Resume", "Restart", "My Profile", "Settings", "Change User");
        
        
        imgMusicalNote.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {

                labelAnimalSpeak.setText("Mooooo!");

                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Get ready: 1");
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream(""));
                                imgMusicalScale.setImage(consoleImage); 
                            }
                        });
                    }
                }, 1000);
                
                

                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Get ready: 2");
                            }
                        });
                    }
                }, 2000);
                
                

                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Get ready: 3");
                            }
                        });
                    }
                }, 3000);

                
                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Get ready: 4");
                            }
                        });
                    }
                }, 4000);

                
                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                firstBeatCheck = true;
                                
                                labelTimer.setText("Tap and hold! 1");
                                
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("1.png"));
                                imgMusicalScale.setImage(consoleImage); 
                                
                                Media media;
                                MediaPlayer mediaplayer;
                                
                                // Get audio file location
                                URL mediaUrl = getClass().getResource("Beep.mp3");
                                String mediaStringUrl = mediaUrl.toExternalForm();



                                // Add audio to the player
                                media = new Media(mediaStringUrl);  
                                mediaplayer = new MediaPlayer(media); 



                                // Play audio
                                mediaplayer.play();      
                                
                                
                            }
                        });
                    }
                }, 5000);

                
                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Tap and hold! 2");
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("2.png"));
                                imgMusicalScale.setImage(consoleImage); 
                                
                                
                                
                                Media media;
                                MediaPlayer mediaplayer;
                                
                                // Get audio file location
                                URL mediaUrl = getClass().getResource("Beep.mp3");
                                String mediaStringUrl = mediaUrl.toExternalForm();



                                // Add audio to the player
                                media = new Media(mediaStringUrl);  
                                mediaplayer = new MediaPlayer(media); 



                                // Play audio
                                mediaplayer.play();    
                            }
                        });
                    }
                }, 6000);

                
                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Tap and hold! 3");
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("3.png"));
                                imgMusicalScale.setImage(consoleImage); 
                                
                                
                                Media media;
                                MediaPlayer mediaplayer;
                                
                                // Get audio file location
                                URL mediaUrl = getClass().getResource("Beep.mp3");
                                String mediaStringUrl = mediaUrl.toExternalForm();



                                // Add audio to the player
                                media = new Media(mediaStringUrl);  
                                mediaplayer = new MediaPlayer(media); 



                                // Play audio
                                mediaplayer.play();    
                            }
                        });
                    }
                }, 7000);

                
                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                secondBeatCheck = true;
                                
                                labelTimer.setText("Tap and hold! 4");
                                
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("4.png"));
                                imgMusicalScale.setImage(consoleImage); 
                                
                                Media media;
                                MediaPlayer mediaplayer;
                                
                                // Get audio file location
                                URL mediaUrl = getClass().getResource("Beep.mp3");
                                String mediaStringUrl = mediaUrl.toExternalForm();



                                // Add audio to the player
                                media = new Media(mediaStringUrl);  
                                mediaplayer = new MediaPlayer(media); 



                                // Play audio
                                mediaplayer.play();    
                            }
                        });
                    }
                }, 8000);
                
                
                // ------------------------------------------------------------------------
                
               

                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                thirdBeatCheck = true;
                                
                                labelTimer.setText("Tap and hold! 1");
                                
                                
                                
                                
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("1.png"));
                                imgMusicalScale.setImage(consoleImage); 
                                
                                Media media;
                                MediaPlayer mediaplayer;
                                
                                // Get audio file location
                                URL mediaUrl = getClass().getResource("Beep.mp3");
                                String mediaStringUrl = mediaUrl.toExternalForm();



                                // Add audio to the player
                                media = new Media(mediaStringUrl);  
                                mediaplayer = new MediaPlayer(media); 



                                // Play audio
                                mediaplayer.play();    
                            }
                        });
                    }
                }, 9000);
                
                

                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Tap and hold! 2");
                                
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("2.png"));
                                imgMusicalScale.setImage(consoleImage); 
                                
                                Media media;
                                MediaPlayer mediaplayer;
                                
                                // Get audio file location
                                URL mediaUrl = getClass().getResource("Beep.mp3");
                                String mediaStringUrl = mediaUrl.toExternalForm();



                                // Add audio to the player
                                media = new Media(mediaStringUrl);  
                                mediaplayer = new MediaPlayer(media); 



                                // Play audio
                                mediaplayer.play();    
                            }
                        });
                    }
                }, 10000);
                
                

                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Tap and hold! 3");
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("3.png"));
                                imgMusicalScale.setImage(consoleImage); 
                                
                                Media media;
                                MediaPlayer mediaplayer;
                                
                                // Get audio file location
                                URL mediaUrl = getClass().getResource("Beep.mp3");
                                String mediaStringUrl = mediaUrl.toExternalForm();



                                // Add audio to the player
                                media = new Media(mediaStringUrl);  
                                mediaplayer = new MediaPlayer(media); 



                                // Play audio
                                mediaplayer.play();    
                            }
                        });
                    }
                }, 11000);

                
                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                fourthBeatCheck = true;
                                
                                labelTimer.setText("Tap and hold! 4");
                                
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("4.png"));
                                imgMusicalScale.setImage(consoleImage); 
                                
                                Media media;
                                MediaPlayer mediaplayer;
                                
                                // Get audio file location
                                URL mediaUrl = getClass().getResource("Beep.mp3");
                                String mediaStringUrl = mediaUrl.toExternalForm();



                                // Add audio to the player
                                media = new Media(mediaStringUrl);  
                                mediaplayer = new MediaPlayer(media); 



                                // Play audio
                                mediaplayer.play();    
                            }
                        });
                    }
                }, 12000);
                
            }
        });
        
        
        btnHold.setOnMousePressed((event) -> {
            
            secondBeatCheck = false;
            fourthBeatCheck = false;
            
            if(firstBeatCheck || thirdBeatCheck){
                
                count++;
                
            } else {
                
                count=0;
                
            }
            
            // Get audio file location
            URL mediaUrl = getClass().getResource("Moo.mp3");
            String mediaStringUrl = mediaUrl.toExternalForm();



            // Add audio to the player
            media = new Media(mediaStringUrl);  
            mediaplayer = new MediaPlayer(media); 

            mediaplayer.setCycleCount(MediaPlayer.INDEFINITE);

            // Play audio
            mediaplayer.play();  

        });
        
             
        btnHold.setOnMouseReleased((event) -> {
            /*
            check2=false;

            if(check1){

                count++;

                if(count == 4){
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setContentText("Win");
                  alert.showAndWait();                                      
                }


            } else {

              if(count != 4){
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setContentText("Loser");
                  alert.showAndWait();                                    
                }

            }

            */
            
            firstBeatCheck = false;
            thirdBeatCheck = false;
            
            
            if(secondBeatCheck || fourthBeatCheck){
                
                count++;  
             
                if(count == 4){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("You Win");
                    alert.showAndWait();   
                }
                
            } else {
                    count = -99;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("You Lose");
                    alert.showAndWait();                   
            }
            
            
            /*
            if(!secondBeatCheck || !fourthBeatCheck){

                
            System.out.println("presss" + count);
            } else {
                count++;
            System.out.println("presxxxxx" + count);
                
            }
*/
            
              // Play audio
              mediaplayer.stop();

        });
        
        
        
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