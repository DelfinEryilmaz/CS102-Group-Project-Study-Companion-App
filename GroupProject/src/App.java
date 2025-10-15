import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception
    {
        Stage stage = new Stage();
        Box pane = new Pane();
        
        Button settings = new Button("Settings");
        Button exit = new Button("Exit App");

        Scene scene = new Scene(pane, 300, 300);

        pane.getChildren().addAll(settings, exit);
        stage.setTitle("CS102 Term Project Application");
        stage.setScene(scene);
        stage.show();
        
    }

    @Override
    public void start(Stage arg0) throws Exception {

        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
}
