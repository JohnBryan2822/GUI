package application;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Controller implements Initializable{
	
	@FXML
	private ProgressBar myProgressBar;
	@FXML
	private Button progressBarButton;
	@FXML
	private Label progressBarLabel;
	
	// The BigDecimal class gives its user complete control over rounding behavior
	BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));

//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		myProgressBar.setStyle("-fx-accent: #00FF00;");
//	}
	public void increaseProgress() {
		if(progress.doubleValue() < 1) {
			progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
			myProgressBar.setProgress(progress.doubleValue());
			progressBarLabel.setText(Integer.toString((int)Math.round(progress.doubleValue() * 100)) + "%" );
		}
	}

	@FXML
	private Spinner<Integer> mySpinner;
	@FXML
	private Label spinnerLabel;
	int currentValue;
	
	@FXML
	private ListView<String> myListView;
	@FXML
	private Label listViewLabel;
	String[] food = {"Pizza", "Sushi", "Ramen"};
	String currentFood;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		SpinnerValueFactory<Integer> valueFactory = 
				new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
		
		valueFactory.setValue(1);
		
		mySpinner.setValueFactory(valueFactory);
		
		currentValue = mySpinner.getValue();
		
		spinnerLabel.setText(Integer.toString(currentValue));
		
		mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {
			@Override
			public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
				currentValue = mySpinner.getValue();
				spinnerLabel.setText(Integer.toString(currentValue));
			}
		});
		
		myListView.getItems().addAll(food);
		myListView
			.getSelectionModel()
			.selectedItemProperty()
			.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					currentFood = myListView.getSelectionModel().getSelectedItem();
					listViewLabel.setText(currentFood);
				}
			});
		
	}	
}












