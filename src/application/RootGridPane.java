package application;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

public class RootGridPane extends GridPane {

//	Button btButton1;
//	Button btLaden;
//	Button btSpeichern;

	private RadioButton radbtLeft, radbtCenter, radbtRight;

	public RootGridPane() {
		initComponents();
		addComponents();
	}

	public void initComponents() {
		
		radbtLeft = new RadioButton("");
			radbtLeft.setPadding(new Insets(10));
		
		
		radbtCenter = new RadioButton("");
			radbtCenter.setPadding(new Insets(10));
			
		
		radbtRight = new RadioButton("");
			radbtRight.setPadding(new Insets(10));
			
	}

	public void addComponents() {

		add(radbtLeft, 0, 0);
		add(radbtCenter, 0, 0);
		add(radbtRight, 0, 0);

	}
}
