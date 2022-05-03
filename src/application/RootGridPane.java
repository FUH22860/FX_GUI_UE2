package application;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class RootGridPane extends GridPane {

//	Button btButton1;
//	Button btLaden;
//	Button btSpeichern;

	private Button btButton1, btLaden, btSpeichern;
	private Button btButton4, btButton5, btButton6, btButtonSieben, btButtonAcht;
	private FlowPane fpRechtsUnten;

	public RootGridPane() {
		initComponents();
		addComponents();
	}

	public void initComponents() {

		btButton1 = new Button("Button1");
			btButton1.setPrefSize(100, 100);
			btButton1.setAlignment(Pos.BOTTOM_RIGHT);
			
		btLaden = new Button("Laden-Button");
			btLaden.setPrefSize(200, 200);
			btLaden.setAlignment(Pos.TOP_CENTER);
			
		btSpeichern = new Button("Speichern-Button");
			btSpeichern.setPrefSize(200, 200);
			btSpeichern.setAlignment(Pos.BOTTOM_LEFT);

		btButton4 = new Button("Button vier");
		btButton5 = new Button("Button5");
		btButton6 = new Button("Button 6");
		btButtonSieben = new Button("Button sieben");
		btButtonAcht = new Button("Button acht");

		fpRechtsUnten = new FlowPane();
			fpRechtsUnten.setPrefSize(200, 200);
			fpRechtsUnten.setAlignment(Pos.CENTER_LEFT);
			fpRechtsUnten.setPadding(new Insets(10));
			fpRechtsUnten.setHgap(10);
			fpRechtsUnten.setVgap(10);
			
		GridPane.setHalignment(btButton1, HPos.CENTER);
		GridPane.setValignment(btButton1, VPos.BOTTOM);
	}

	public void addComponents() {

		add(btButton1, 0, 0);
		add(btLaden, 1, 0);
		add(btSpeichern, 0, 1);
		add(fpRechtsUnten, 1, 1);

		fpRechtsUnten.getChildren().addAll(btButton4, btButton5, btButton6, btButtonSieben, btButtonAcht);

	}
}
