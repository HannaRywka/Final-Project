/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicalgameapplication;

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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/*
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
    private ComboBox cbMenu;
   
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
    private Media media;
    
    @FXML
    private MediaPlayer mediaplayer;
       
    @FXML
    private void choiceBoxSelectConsole() {
      
        // Combox Box event handler
        cbMenu.setOnAction(new EventHandler() {           
            @Override
            public void handle(Event event) {
               
                    Parent root = null;
                // Add info from the selected Company into to the Scene
                if (cbMenu.getValue().equals("Resume")) {
                    try {
                        root = FXMLLoader.load(getClass().getResource("Game.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);
                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();
                }                 
                if(cbMenu.getValue().equals("Restart")) {
                    try {
                        root = FXMLLoader.load(getClass().getResource("Game.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);
                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();
                } 
                if(cbMenu.getValue().equals("My Profile")){
                    try {
                        root = FXMLLoader.load(getClass().getResource("Profile.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);
                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();
                } 
                if(cbMenu.getValue().equals("Settings")){
                    try {
                        root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);
                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();
                } 
                if(cbMenu.getValue().equals("Change User")){
                    try {
                        root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);
                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();
                }     

            }
        });
    }
    
    
    /*
    @FXML
    private void callNoteSound(ActionEvent event) throws IOException {
        System.out.println("disturbed");
    }
*/
   


/*
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
            // Attributes
        Timer timerMoveToMainMenu = new java.util.Timer();
        
        cbMenu.getItems().addAll("Resume", "Restart", "My Profile", "Settings", "Change User");
        
        
        imgMusicalNote.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {

                labelAnimalSpeak.setText("Moooo");

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
                                
                                
                                check1=true;
                                
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
                                
                                check1=false;
                                
                                labelTimer.setText("Tap and hold! 2");
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("2.jpg"));
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
                                consoleImage = new Image(getClass().getResourceAsStream("3.jpg"));
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
                                
                                check1=true;
                                
                                labelTimer.setText("Tap and hold! 4");
                                
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("4.jpg"));
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
                                
                                
                                check1=false;
                                
                                labelTimer.setText("Get ready: 1");
                                
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream(""));
                                imgMusicalScale.setImage(consoleImage); 
                            }
                        });
                    }
                }, 9000);
                
                

                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Get ready: 2");
                            }
                        });
                    }
                }, 10000);
                
                

                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Get ready: 3");
                            }
                        });
                    }
                }, 11000);

                
                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Get ready: 4");
                            }
                        });
                    }
                }, 12000);

                
                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                check1=true;
                                
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
                }, 13000);

                
                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                check1=false;
                                
                                labelTimer.setText("Tap and hold! 2");
                                
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("2.jpg"));
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
                }, 14000);

                
                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                labelTimer.setText("Tap and hold! 3");
                                
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("3.jpg"));
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
                }, 15000);

                
                // Timer used to close Splash Screen and open Main Menu
                timerMoveToMainMenu.schedule(new TimerTask() {
                    public void run() {
                         Platform.runLater(new Runnable() {
                            public void run() {
                                
                                check1=true;
                                
                                labelTimer.setText("Tap and hold! 4");
                                
                                
                                
                                Image consoleImage;
                                consoleImage = new Image(getClass().getResourceAsStream("4.jpg"));
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
                }, 16000);
                
            }
        });
        
        
        cbMenu.setOnAction(new EventHandler() {           
            @Override
            public void handle(Event event) {

                    Parent root = null;
                // Add info from the selected Company into to the Scene
                if (cbMenu.getValue().equals("Resume")) {
                    try {
                        root = FXMLLoader.load(getClass().getResource("Game.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);
                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();
                }                 
                if(cbMenu.getValue().equals("Restart")) {
                    try {
                        root = FXMLLoader.load(getClass().getResource("Game.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);
                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();
                } 
                if(cbMenu.getValue().equals("My Profile")){
                    try {
                        root = FXMLLoader.load(getClass().getResource("Profile.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);
                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();
                } 
                if(cbMenu.getValue().equals("Settings")){
                    try {
                        root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);
                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();
                } 
                
                if(cbMenu.getValue().equals("Change User")){
                    try {
                        root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);
                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();
                }     

            }
        });
        
        
        btnHold.setOnMousePressed((event) -> {
            
            
                                check2=true;
                                
                                
                                
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
            System.out.println("released");
            
                              check2=false;

                              if(check1){
                                  
                                  count++;
                                  
                                  if(count == 2){
                                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                    alert.setContentText("Win");
                                    alert.showAndWait();                                      
                                  }
                                  
                                  
                              } else {
                                  
                                if(count != 2){
                                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                    alert.setContentText("Loser");
                                    alert.showAndWait();                                    
                                  }
                                  
                              }

                                // Play audio
                                mediaplayer.stop();

        });
        
    }    
    
}
*/