package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Controller implements Initializable{

	public void moveUp() {
		System.out.println("Movin' up!");
	}
	
	public void moveDown() {
		System.out.println("Movin' down!");
	}
	
	public void moveLeft() {
		System.out.println("Movin' left!");
	}
	
	public void moveRight() {
		System.out.println("Movin' right");
	}

	@FXML
	private ImageView myImage;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// Translate
		/*
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(myImage);
		translate.setDuration(Duration.millis(1000));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setByX(250);
		translate.setByY(-250);
		translate.setAutoReverse(true);
		translate.play();
		*/
		
		// Rotate
		/*
		RotateTransition rotate = new RotateTransition();
		rotate.setNode(myImage);
		rotate.setDuration(Duration.millis(1000));
		rotate.setCycleCount(TranslateTransition.INDEFINITE);
		rotate.setInterpolator(Interpolator.LINEAR);
		rotate.setByAngle(360);
		rotate.setAxis(Rotate.X_AXIS);
		rotate.play();
		*/
		
		// Fade
		/*
		FadeTransition fade = new FadeTransition();
		fade.setNode(myImage);
		fade.setDuration(Duration.millis(1000));
		fade.setCycleCount(TranslateTransition.INDEFINITE);
		fade.setInterpolator(Interpolator.LINEAR);
		fade.setFromValue(1);
		fade.setToValue(0);
		fade.play();
		*/
		
		// Scale
		ScaleTransition scale = new ScaleTransition();
		scale.setNode(myImage);
		scale.setDuration(Duration.millis(1000));
		scale.setCycleCount(TranslateTransition.INDEFINITE);
		scale.setInterpolator(Interpolator.LINEAR);
		scale.setByX(1.5);
		scale.setByY(1.5);
		scale.setAutoReverse(true);
		scale.play();
		
	}
	
	
}












