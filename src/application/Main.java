package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
		System.out.println(Main.class.getResource("/fxml/Login.fxml"));
	}
	
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(Main.class.getResource("/fxml/Login.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			stage.setResizable(false);
		} catch (Exception exception) {
			exception.printStackTrace();
		}


	}
}
