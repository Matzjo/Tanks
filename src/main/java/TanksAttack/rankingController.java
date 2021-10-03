package TanksAttack;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

public class rankingController {

	@FXML

	Label ranking;

	public void initialize() {
		
		ranking();
		
	}
	
	private void ranking() {
		
		String info = String.format(null, null)
		
		ranking.setText(info);
	}
	

}
