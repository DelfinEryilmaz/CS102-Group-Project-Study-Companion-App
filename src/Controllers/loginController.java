package Controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class loginController {

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private void initialize() {
        System.out.println("Login controller loaded!");
    }

    @FXML
    private void login() {
        System.out.println("logined");
    }

    @FXML
    private void register(ActionEvent event) throws IOException {
        System.out.println("registered");
        Parent root = FXMLLoader.load(getClass().getResource("/Scenes/register.fxml"));
        System.out.println(getClass().getResource("/Scenes/register.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
