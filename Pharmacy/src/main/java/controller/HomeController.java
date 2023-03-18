package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML
    ImageView imgUser;
    @FXML
    ImageView imgNews;
    @FXML
    ImageView imgNutrition;
    @FXML
    ImageView imgDaily;
    @FXML
    ImageView imgBooking;
    @FXML
    ImageView imgService;
    @FXML
    ImageView imgHealth;
    @FXML
    ImageView imgRelatives;
    @FXML
    ImageView imgOtherService;
    public static void showWindow(ActionEvent event)  throws IOException {
        Parent home1 = FXMLLoader.load(HomeController.class.getResource("/views/Home.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(home1));
        stage.show();
    }
    public static void showWindow(MouseEvent event)  throws IOException {
        Parent home1 = FXMLLoader.load(HomeController.class.getResource("/views/Home.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(home1));
        stage.show();
    }

    public void initialize(){
        imgUser.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    PersonalInformation.showWindow(mouseEvent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        imgNews.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    NewsController.showWindow(mouseEvent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        imgNutrition.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    NutritrionRegimen.showWindow(mouseEvent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        imgBooking.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Booking.showWindow(mouseEvent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        imgHealth.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Health.showWindow(mouseEvent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        imgRelatives.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Ralatives.showWindow(mouseEvent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        imgOtherService.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    OtherService.showWindow(mouseEvent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }


}
