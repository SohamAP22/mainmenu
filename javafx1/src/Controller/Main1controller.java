package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.FXMLloader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Main1controller implements Initializable {

	@FXML
	private Label label;
	@FXML
private BorderPane mainPane;

@FXML
private void handleButton0tAction(ActionEvent event) {
	FXMLloader object = new FXMLloader();
	Pane view = (Pane) object.getPage("/Main");
	mainPane.setCenter(view);
}

@FXML
private void handleButton1tAction(ActionEvent event) {
	FXMLloader object = new FXMLloader();
	Pane view = object.getPage("/Profile");
	mainPane.setCenter(view);
}

@FXML
private void handleButton2Action(ActionEvent event) {
	FXMLloader object = new FXMLloader();
	Pane view = object.getPage("Breakfast");
	mainPane.setCenter(view);
}
@FXML
private void handleButton3Action(ActionEvent event) {
	FXMLloader object = new FXMLloader();
	Pane view = object.getPage("Lunch");
	mainPane.setCenter(view);
}
@FXML
private void handleButton4Action(ActionEvent event) {
	FXMLloader object = new FXMLloader();
	Pane view = object.getPage("Dinner");
	mainPane.setCenter(view);
}
@FXML
private void handleButton5Action(ActionEvent event) {
	FXMLloader object = new FXMLloader();
	Pane view = object.getPage("Result");
	mainPane.setCenter(view);
}

public void initialize(URL url, ResourceBundle rb) {
	// TODO Auto-generated method stub
	
}

}
