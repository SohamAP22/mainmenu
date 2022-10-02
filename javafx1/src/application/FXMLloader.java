package application;

import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class FXMLloader {
	@FXML
	public Pane view;
	
	public Pane getPage(String filename) {
		try {
			URL fileUrl = MainMenu.class.getResource("/fxml/"+ filename + ".fxml");
			if(fileUrl == null) {
				throw new java.io.FileNotFoundException("fxml file can't be found");
			}
			new FXMLLoader();
			view =  FXMLLoader.load(fileUrl);
		}catch(Exception e) {
			System.out.println("no page" + filename + "please check fxmlloader.");
		}
		return view ;

	}
	

	public static Parent load(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}
}

