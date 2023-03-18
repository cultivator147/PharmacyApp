package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class NewsController {
    @FXML
    ImageView imgeBack;

    public static void showWindow(MouseEvent event) throws IOException {
        Parent home1 = FXMLLoader.load(HomeController.class.getResource("/views/News.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(home1));
        stage.show();
    }
    public void initialize(){
        imgeBack.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    HomeController.showWindow(mouseEvent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
