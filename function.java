package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class function implements Initializable {
	
	@FXML
	private TextField t;
	 @FXML 
	 private ListView<String> lv;
	 
	 private ObservableList l=FXCollections.observableArrayList();
	 
	 

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
	}
	public void addition()
	{
		l.add(t.getText());
		t.setText("");
		lv.setItems(l);
		
	}
	

}
