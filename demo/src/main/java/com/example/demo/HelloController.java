package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblMessage;
    @FXML
    private Button btnClick;

    @FXML
    protected void clickedButton() {
        lblMessage.setText("Hello world");
    }
}