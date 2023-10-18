package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));
			Parent root = loader.load();
			
			Controller controller = loader.getController();
			Scene scene = new Scene(root);
			
			scene.setOnKeyPressed(e -> {
					switch(e.getCode()) {
					case UP:
						controller.moveUp();
						break;
					case DOWN:
						controller.moveDown();
						break;
					case LEFT:
						controller.moveLeft();
						break;
					case RIGHT:
						controller.moveRight();
						break;
					default:
						break;
					}
				});
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}