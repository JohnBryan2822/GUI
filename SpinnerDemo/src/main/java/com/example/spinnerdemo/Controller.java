package com.example.spinnerdemo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Spinner<Integer> numberSpinner;

    SpinnerValueFactory<Integer> svf
            = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1);

    @FXML
    private Text text;

    @FXML
    void getNumber(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        numberSpinner.setValueFactory(svf);
    }
}
