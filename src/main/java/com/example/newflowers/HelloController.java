package com.example.newflowers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    Label first;

    @FXML
    Label second;

    @FXML
    Label third;

    @FXML
    Button masha;

    @FXML
    Button tanya;

    @FXML
    Button day;

    public void actionOfMasha()
    {
        String s=second.getText();
        second.setText(third.getText());
        third.setText(s);
    }

    public void actionOfTanya()
    {
        String s1 =second.getText();
        second.setText(first.getText());
        first.setText(s1);
    }

    public void actionOfDay()
    {
        String s=second.getText();
        second.setText(third.getText());
        third.setText(s);

        String s1 =second.getText();
        second.setText(first.getText());
        first.setText(s1);
    }



}




    //@FXML
    //private Label welcomeText;

    //@FXML
    //protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
    //}

