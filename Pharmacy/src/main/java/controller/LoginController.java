package controller;

import javafx.event.ActionEvent;

import java.io.IOException;

public class LoginController {
    public void login(ActionEvent event) throws IOException {
        HomeController.showWindow(event);
    }
}
