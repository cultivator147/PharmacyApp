package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public void login(ActionEvent event) throws IOException {
        HomeController.showWindow(event);
    }
    public static void showWindow(MouseEvent event)  throws IOException {
        Parent home1 = FXMLLoader.load(HomeController.class.getResource("/views/Login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(home1));
        stage.show();
    }
}
