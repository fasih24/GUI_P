import java.awt.Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class demo extends Application{
	Button button=new Button();
			
	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
	arg0.setTitle("this is a screen");
	button.setName("button");
		StackPane stackPane=new StackPane();
		//stackPane.getChildren().new.button.add(button);
		  Scene scene = new Scene(stackPane,400,400);
		  
		     Stage stage = new Stage();
		     arg0.setScene(scene);
		     arg0.show();
	}

}
