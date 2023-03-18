package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class NutritrionRegimen {
    @FXML
    ImageView imgBack;
    @FXML
    PieChart pieChart;

    public static void showWindow(MouseEvent event) throws IOException {
        Parent home1 = FXMLLoader.load(HomeController.class.getResource("/views/NutritionRegimen.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(home1));
        stage.show();
    }
    public static void showWindow(ActionEvent event) throws IOException {
        Parent home1 = FXMLLoader.load(HomeController.class.getResource("/views/NutritionRegimen.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(home1));
        stage.show();
    }
    public void initialize(){
        imgBack.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    HomeController.showWindow(mouseEvent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        PieChart.Data slice1 = new PieChart.Data("Breakfast", 30);
        PieChart.Data slice2 = new PieChart.Data("Launch", 17);
        PieChart.Data slice3 = new PieChart.Data("Dinner", 47);
        PieChart.Data slice4 = new PieChart.Data("Snacks", 20);
        pieChart.setLegendVisible(false);
        pieChart.getData().addAll(slice1,slice2,slice3,slice4);

    }
    public void showMacros(ActionEvent event) throws IOException {
        Macros.showWindow(event);
    }
    public void showNutrients(ActionEvent event)throws IOException{
        Nutrients.showWindow(event);
    }
}
