package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("page1.fxml"));
        primaryStage.setTitle("Plant_V_Zombies");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
        func2(primaryStage);

    }

    public void func2( Stage stage2 ) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("page2.fxml"));
        stage2.setTitle("Game Page");
        stage2.setScene(new Scene(root, 600,400));
        stage2.show();


        }


    public static void main(String[] args) {
        launch(args);
	System.out.println("Hello!");
    }
}
