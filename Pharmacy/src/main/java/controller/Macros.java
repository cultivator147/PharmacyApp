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

public class Macros {
    @FXML
    ImageView imgBack;
    @FXML
    PieChart pieChart;

    public static void showWindow(ActionEvent event) throws IOException {
        Parent home1 = FXMLLoader.load(HomeController.class.getResource("/views/Macros.fxml"));
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
        PieChart.Data slice1 = new PieChart.Data("Cacbonhydrates", 50);
        PieChart.Data slice2 = new PieChart.Data("Fat", 20);
        PieChart.Data slice3 = new PieChart.Data("Protein", 30);
        pieChart.setLegendVisible(true);
        pieChart.setLegendSide(Side.BOTTOM);
        pieChart.getData().addAll(slice1,slice2,slice3);

//        slice1.getNode().setStyle("-fx-pie-color: #008CBA;");
//        slice2.getNode().setStyle("-fx-pie-color: #00A6AA;");
//        slice3.getNode().setStyle("-fx-pie-color: #90C3D4;");
//        slice4.getNode().setStyle("-fx-pie-color: #F88379;");

    }
    public void showNutrients(ActionEvent event)throws IOException{
        Nutrients.showWindow(event);
    }
    public void showCalories(ActionEvent event)throws IOException{
        NutritrionRegimen.showWindow(event);
    }
}
