import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application{
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Group root = new Group();
        
        Parent pRoot = FXMLLoader.load(getClass().getResource("Scenes/login.fxml"));
        Scene scene = new Scene(pRoot);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Page");

        // Look 
        primaryStage.setX(300);
        primaryStage.setY(200);
        primaryStage.setWidth(600);
        primaryStage.setHeight(400);

        // Exit
        // primaryStage.setFullScreen(true);
        // primaryStage.setFullScreenExitHint("Press Q to escape.");
        // primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        primaryStage.show();
    }
    public static void main(String[] args) {
       launch(args);
    }
}
