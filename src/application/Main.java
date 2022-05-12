package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Main extends Application {
	public void start(Stage primaryStage) {
		try {
			RootGridPane root = new RootGridPane();
			Scene scene = new Scene(root, 400, 400);

			primaryStage.setTitle("Erstes Fenster");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public static void showAlert(String message) {
		Alert alert = new Alert(AlertType.INFORMATION, message);
		alert.setHeaderText(null);
		alert.setTitle(null);
		alert.showAndWait();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
