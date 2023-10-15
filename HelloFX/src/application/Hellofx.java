package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Hellofx extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root, Color.BLACK);
		stage.setScene(scene);
		
		// Setting icon to our window
		Image icon = new Image("icon.jpg");
		stage.getIcons().add(icon);
		
		// setting title to the window
		stage.setTitle("My First App");
		
		// Setting Width and Height
		stage.setWidth(450);
		stage.setHeight(450);
		
		// if false we cannot change the size of the window
		stage.setResizable(false);
		
		// window will appear 100px from the left
		// and 100px from the top
//		stage.setX(100);
//		stage.setY(100);
		
		// setting full screen mode
		stage.setFullScreen(true);
		// setting hint message to exit full screen mode
		stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
		// setting key combination to exit full screen mode
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));		
		
		stage.show();
	}
	
}
