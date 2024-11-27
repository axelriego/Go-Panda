package com.example.driver_menu;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DriverMenuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}