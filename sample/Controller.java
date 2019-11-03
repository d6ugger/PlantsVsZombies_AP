package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.animation.TranslateTransition;
import javafx.scene.input.MouseButton;
import javafx.util.Duration;
import javafx.application.Application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXMLLoader;

public class Controller implements Initializable {

    @FXML
    private Button mower_row2;
    @FXML
    private Button zomb ;

    @FXML
    private Button b_start;
    @FXML
    private Button menubutton;
    @FXML
    private Button b_exit;
    @FXML
    private Button b_lvl;
    @FXML
    private Button b_back;
    @FXML
    public void back2Menu()  {
        b_back.setOnMouseClicked((event) -> {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("page1.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Main.window.setScene(new Scene(root, 600, 400));
            Main.window.show();
            System.out.println(" Button Clicked ! ");
        });
    }
    @FXML
    public void startGame()  {
        b_start.setOnMouseClicked((event) -> {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("page2.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Main.window.setScene(new Scene(root, 600, 400));
            Main.window.show();
            System.out.println(" Button Clicked ! ");
        });
    }
    @FXML
    public void pause()  {
        menubutton.setOnMouseClicked((event) -> {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("game_menu.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Main.window.setScene(new Scene(root, 600, 400));
            Main.window.show();
            System.out.println(" Button Clicked ! ");
        });
    }
    @FXML
    public void chLvl()  {
        b_lvl.setOnMouseClicked((event) -> {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("choose_level.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Main.window.setScene(new Scene(root, 600, 400));
            Main.window.show();
            System.out.println(" Button Clicked ! ");
        });
    }
    @FXML
    public void exit(){
        b_exit.setOnMouseClicked((e) -> {
            System.exit(0);
        });
    }
//    }

//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//       // FXMLLoader.load(getClass().getResource("page2.fxml"));
////        Parent root = FXMLLoader.load(getClass().getResource("page2.fxml"));
////        Scene scene = b_start.getScene();
////        root.translateYProperty().set(scene.getHeight());
//        System.out.println("You clicked me ");
//
//    }

//
    @Override
    public void initialize(URL url , ResourceBundle rb)
   {
       TranslateTransition transit1 = new TranslateTransition();
        transit1.setDuration(Duration.seconds(8));
        transit1.setNode(mower_row2);
        transit1.setToX(550);

        TranslateTransition transit2 = new TranslateTransition();
        transit2.setDuration(Duration.seconds(20));
        transit2.setNode(zomb);
        transit2.setToX(-450);

//        b_start.setOnAction((event)-> {
//                    System.out.println(" Button Clicked ! ");
//                });

//           b_start.setOnAction(this::handleButtonAction);


        transit1.play();
        transit2.play();
    }
}
