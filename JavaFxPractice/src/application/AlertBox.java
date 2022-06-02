package application;
	
import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


//Switch windows
public class AlertBox extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Stage window = primaryStage;
		
		Button b1 = new Button("Click me");
		b1.setOnAction(e->{
//		 Main.display("new window");
		});
		StackPane root=new StackPane();
		root.getChildren().add(b1);
		Scene s1= new Scene(root,500,500);
		
		window.setMinWidth(500);
		window.setMinHeight(500);
		window.setScene(s1);
		window.setTitle("window");
		window.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

