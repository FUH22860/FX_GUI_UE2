package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;

public class Main extends Application {
	public void start(Stage primaryStage) {
		try {
			RootGridPane root = new RootGridPane(); // BorderPane machen und wahrscheinlich FlowPane
			// BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("GUI Übung 2");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
