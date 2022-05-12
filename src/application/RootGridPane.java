package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class RootGridPane extends GridPane {

	private Button btButton1, btLaden, btBeenden;
	private Button btButton4, btButton5, btButton6, btButtonSieben, btButtonAcht;
	private Button btBack, btBack2;
	private Label lbErsetzt;
	private FlowPane fpRechtsUnten;

	public RootGridPane() {
		initComponents();
		addComponents();
		addHandler();
	}

	public void initComponents() {
		btButton1 = new Button("Button1");
		btButton1.setPrefSize(100, 100);
		btButton1.setAlignment(Pos.BOTTOM_RIGHT);

		btLaden = new Button("Laden-Button");
		btLaden.setPrefSize(200, 200);
		btLaden.setAlignment(Pos.TOP_CENTER);

		btBeenden = new Button("Beenden-Button");
		btBeenden.setPrefSize(200, 200);
		btBeenden.setAlignment(Pos.BOTTOM_LEFT);

		btButton4 = new Button("Button4");
		btButton5 = new Button("Button5");
		btButton6 = new Button("Button6");
		btButtonSieben = new Button("ButtonSieben");
		btButtonAcht = new Button("ButtonAcht");

		fpRechtsUnten = new FlowPane();
		fpRechtsUnten.setPrefSize(200, 200);
		fpRechtsUnten.getChildren().addAll(btButton4, btButton5, btButton6, btButtonSieben, btButtonAcht);
		fpRechtsUnten.setAlignment(Pos.CENTER_LEFT);
		fpRechtsUnten.setPadding(new Insets(10));
		fpRechtsUnten.setVgap(10);
		fpRechtsUnten.setHgap(10);

		GridPane.setHalignment(btButton1, HPos.CENTER);
		GridPane.setValignment(btButton1, VPos.BOTTOM);

	}

	public void addComponents() {
		add(btButton1, 0, 0);
		add(btLaden, 1, 0);
		add(btBeenden, 0, 1);
		add(fpRechtsUnten, 1, 1);
	}

	private void addHandler() {

		btBack = new Button("Back");
		btBack2 = new Button("Back");
		lbErsetzt = new Label("Ersetzt!");

		btButton1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				getChildren().remove(btButton1);
				getChildren().add(btBack2);
				Main.showAlert("Bin " + btButton1.getText());
			}
		});

		btBack2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				getChildren().remove(btBack2);
				getChildren().add(btButton1);
			}
		});

		btBack.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				fpRechtsUnten.getChildren().setAll(btButton4, btButton5, btButton6, btButtonSieben, btButtonAcht);
			}
		});

		btButton4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				fpRechtsUnten.getChildren().setAll(btBack);
			}
		});

		btLaden.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				Main.showAlert("Loading in progress...");
			}
		});

		btBeenden.setOnAction(event -> beenden());
	}

	private void beenden() {
		Platform.exit();
	}

}
