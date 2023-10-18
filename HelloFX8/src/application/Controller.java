package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable{
	
	@FXML
	private TreeView treeView;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
//		TreeItem<String> rootItem = new TreeItem<>("Files", new ImageView(new Image("pathToImage")));
		TreeItem<String> rootItem = new TreeItem<>("Files");
		
		TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
		TreeItem<String> branchItem2 = new TreeItem<>("Videos");
		TreeItem<String> branchItem3 = new TreeItem<>("Musics");
		
		TreeItem<String> leafItem1 = new TreeItem<>("Pictures");
		TreeItem<String> leafItem2 = new TreeItem<>("Videos");
		TreeItem<String> leafItem3 = new TreeItem<>("Musics");
		TreeItem<String> leafItem4 = new TreeItem<>("Pictures");
		TreeItem<String> leafItem5 = new TreeItem<>("Videos");
		TreeItem<String> leafItem6 = new TreeItem<>("Musics");
		
		branchItem1.getChildren().addAll(leafItem1, leafItem2);
		branchItem2.getChildren().addAll(leafItem3, leafItem4);
		branchItem3.getChildren().addAll(leafItem5, leafItem6);
		
		rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);
		
		// it will hide the root item
		treeView.setShowRoot(false);
		
		treeView.setRoot(rootItem);
	}
	
	public void selectItem() {
		TreeItem<String> item = (TreeItem<String>) treeView.getSelectionModel().getSelectedItem();
		if(item != null) {
			System.out.println(item.getValue());
		}
	}
	
}












