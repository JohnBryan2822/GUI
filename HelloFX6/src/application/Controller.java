package application;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller implements Initializable{
	
	@FXML
	private DatePicker myDatePicker;
	@FXML
	private Label myLabel;
	
	public void getDate(ActionEvent e) {
		LocalDate myDate = myDatePicker.getValue();
		String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		myLabel.setText(myFormattedDate);
	}
	
	@FXML
	private ColorPicker myColorPicker;
	@FXML
	private Pane myPane;
	
	public void changeColor(ActionEvent e) {
		Color myColor = myColorPicker.getValue();
		myPane.setBackground(new Background(new BackgroundFill(myColor, null, null)));
	}
	
	@FXML
	private Label choiceBoxLabel;
	@FXML
	private ChoiceBox<String> myChoiceBox;
	
	private String[] food = {"Pizza", "Sushi", "Ramen"};

//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		myChoiceBox.getItems().addAll(food);
//		myChoiceBox.setOnAction(this::getFood);
//	}
	public void getFood(ActionEvent e) {
		String myFood = myChoiceBox.getValue();
		choiceBoxLabel.setText(myFood);
	}
	
	@FXML
	private Label sliderLabel;
	@FXML
	private Slider mySlider;
	
	int myTemperature;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myTemperature = (int)mySlider.getValue();
		sliderLabel.setText(Integer.toString(myTemperature));
		
		mySlider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				myTemperature = (int)mySlider.getValue();
				sliderLabel.setText(Integer.toString(myTemperature));
			}
		});
	}
	
	
	
}












