package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
	
	@FXML
	private Label radioLabel;
	@FXML
	private RadioButton rButton1, rButton2, rButton3;
	
	public void getFood(ActionEvent e) {
		if(rButton1.isSelected()) {
			radioLabel.setText(rButton1.getText());
		} else if(rButton2.isSelected()) {
			radioLabel.setText(rButton2.getText());
		} else if(rButton3.isSelected()) {
			radioLabel.setText(rButton3.getText());
		}
	}
	
	@FXML
	private CheckBox myCheckbox;
	@FXML
	private ImageView myImageView;
	@FXML
	private Label myLabel;
	
	Image myImage1 = new Image(getClass().getResourceAsStream("images.jpg"));
	Image myImage2 = new Image(getClass().getResourceAsStream("ne_12.jpg"));
	
	public void change(ActionEvent e) {
		if(myCheckbox.isSelected()) {
			myLabel.setText("ON");
			myImageView.setImage(myImage2);
		} else {
			myLabel.setText("OFF");
			myImageView.setImage(myImage1);
		}
	}
}