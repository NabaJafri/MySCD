package application;
	
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Main extends Application {
Stage window;
Scene scene1;
String msg="";
@Override
public void start(Stage primaryStage) {

window = primaryStage;
//Checkbox:
//	CheckBox b1 = new CheckBox("Pizza");
//	CheckBox b2 = new CheckBox("Burger");
//	CheckBox b3 = new CheckBox("Fries");
//	b1.setSelected(true);
//	Button button1 = new Button(" Enter ");
//	button1.setOnAction(e->{
//		if(b1.isSelected())
//		{
//			msg += b1.getText();
//		}
//		if(b2.isSelected())
//		{
//			msg += b2.getText();
//		}
//		if(b3.isSelected())
//		{
//			msg += b3.getText();
//		}
//		System.out.println("You have selected : \n"+msg);
//		
//	});
//	VBox root = new VBox();
//	root.setPadding(new Insets(70,70,70,70));
//	
//	root.getChildren().addAll(b1,b2,b3,button1);
//	scene1= new Scene(root,500,500);
	
//ChoiceBox
//ChoiceBox<String> cb = new ChoiceBox<>();
//cb.getItems().addAll("a","b","c","d");
//
//cb.setValue("a");
//Button b1 = new Button("ENTER");
//b1.setOnAction(e ->{
//	System.out.println(cb.getValue());
//});
//
//VBox root = new VBox();
//root.setPadding(new Insets(20,20,20,20));
//root.getChildren().addAll(cb,b1);

//Radio Button

ToggleGroup tg= new ToggleGroup();
RadioButton r1 = new RadioButton("Ice Cream");
RadioButton r2 = new RadioButton("Apple");
RadioButton r3 = new RadioButton("Burger");
Button b1 = new Button("Enter");
//b1.setOnAction(e -> {
//	if(r1.isSelected())
//	{
//		System.out.println(r1.getText());
//	}
//	if(r2.isSelected())
//	{
//		System.out.println(r2.getText());
//	}
//	if(r3.isSelected())
//	{
//		System.out.println(r3.getText());
//	}
//});
b1.setOnMouseClicked(e->{
	if(r1.isSelected())
		{
			System.out.println(r1.getText());
		}
		if(r2.isSelected())
		{
			System.out.println(r2.getText());
		}
		if(r3.isSelected())
		{
			System.out.println(r3.getText());
		}
});
r1.setToggleGroup(tg);
r2.setToggleGroup(tg);
r3.setToggleGroup(tg);

VBox root = new VBox();
root.setPadding(new Insets(20,20,20,20));
root.getChildren().addAll(r1,r2,r3,b1);
scene1= new Scene(root,500,500);
window.setScene(scene1);
window.setTitle("Check Data");
window.show();

}

public static void main(String[] args) {
launch(args);
}
}

//login and add details and display them
//public class Main extends Application {
//Stage window;
//Scene scene1,scene2;
//@Override
//public void start(Stage primaryStage) {
//
//window = primaryStage;
//
//Label l1 = new Label("Enter Username:");
//TextField t1 = new TextField();
//
//Label l2 = new Label("Enter Password:");
//TextField t2 = new TextField();
//
//Button b1 = new Button ("Enter");
//b1.setOnAction(e-> {
//	if(String.valueOf(t1.getText()).matches(String.valueOf(t2.getText())))
//	{
//		System.out.println("Both are same");
//		window.setScene(scene2);
//	}
//	else
//	{
//		System.out.println("Both are not same");
//	}
//});
//
//GridPane root = new GridPane();
//root.setPadding(new Insets(20,20,20,20));
//GridPane.setConstraints(l1, 0, 0);
//GridPane.setConstraints(t1, 1, 0);
//GridPane.setConstraints(l2, 0, 1);
//GridPane.setConstraints(t2, 1, 1);
//GridPane.setConstraints(b1, 1, 2);
//
//root.getChildren().addAll(l1,t1,l2,t2,b1);
//scene1 = new Scene(root,500,500);
//
////For scene 2
//List<String> username= new ArrayList<>();
//List<String> password= new ArrayList<>();
//
//Label l11 = new Label("Enter Username:");
//TextField t11 = new TextField();
//
//Label l22 = new Label("Enter Password:");
//TextField t22 = new TextField();
//
//Button b2 = new Button ("Add");
//b2.setOnAction(e->{
//	username.add(String.valueOf(t11.getText()));
//	password.add(String.valueOf(t22.getText()));
//	System.out.println("Values added!");
//});
//Button b3 = new Button ("Display");
//
//b3.setOnAction(e->{
//	
//	System.out.println("Username:"+username);
//	System.out.println("Password:"+password);
//});
//
//GridPane root2 = new GridPane();
//root2.setPadding(new Insets(20,20,20,20));
//GridPane.setConstraints(l11, 0, 0);
//GridPane.setConstraints(t11, 1, 0);
//GridPane.setConstraints(l22, 0, 1);
//GridPane.setConstraints(t22, 1, 1);
//GridPane.setConstraints(b2, 1, 4);
//GridPane.setConstraints(b3, 1, 7);
//
//root2.getChildren().addAll(l11,t11,l22,t22,b2,b3);
//scene2 = new Scene(root2,500,500);
//
//window.setScene(scene1);
//window.setTitle("Check Data");
//window.show();
//
//}
//
//public static void main(String[] args) {
//launch(args);
//}
//}

//Check valid data :
//public class Main extends Application {
//Stage window;
//Scene scene1;
//@Override
//public void start(Stage primaryStage) {
//
//window = primaryStage;
//
//Label l1 = new Label("Enter Username:");
//TextField t1 = new TextField();
//
//Label l2 = new Label("Enter Password:");
//TextField t2 = new TextField();
//
//Button b1 = new Button ("Enter");
//b1.setOnAction(e-> {
//	checksame(t1.getText(),t2.getText());
//});
//
//GridPane root = new GridPane();
//root.setPadding(new Insets(20,20,20,20));
//GridPane.setConstraints(l1, 0, 0);
//GridPane.setConstraints(t1, 1, 0);
//GridPane.setConstraints(l2, 0, 1);
//GridPane.setConstraints(t2, 1, 1);
//GridPane.setConstraints(b1, 1, 2);
//
//root.getChildren().addAll(l1,t1,l2,t2,b1);
//scene1 = new Scene(root,500,500);
//window.setScene(scene1);
//window.setTitle("Check Data");
//window.show();
//
//}
//public void checksame(String username,String pass)
//{
//	if(String.valueOf(username).matches(String.valueOf(pass)))
//	{
//		System.out.println("Both are same");
//	}
//	else
//	{
//		System.out.println("Both are not same");
//	}
//}
//public static void main(String[] args) {
//launch(args);
//}
//}


//Switch windows
//public class Main {
//	
//	static public void display(String title) {
//		Stage window = new Stage();
//		window.initModality(Modality.APPLICATION_MODAL);
//		window.setMinWidth(500);
//		window.setMinHeight(500);
//		
//		Button b1 = new Button("Click me to close window!");
//		b1.setOnAction(e->{window.close();});
//		StackPane root=new StackPane();
//		root.getChildren().add(b1);
//		Scene s1= new Scene(root,500,500);
//		
//		window.setScene(s1);
//		window.setTitle(title);
//		window.showAndWait();
//	}
//	
//	public static void main(String[] args) {
//		
//	}
//}


//		Switch Scenes :
//public class Main extends Application {
//	Stage window;
//	Scene scene1,scene2;
//	@Override
//	public void start(Stage primaryStage) {
//		
//		window = primaryStage;
//		
//		Label l1 = new Label("This is scene 1");
//		Button b1 = new Button("This is scene 1 button");
//		VBox root1 = new VBox();
//		root1.getChildren().addAll(l1,b1);
//		scene1=new Scene(root1,500,500);
//		b1.setOnAction(e->{
//			window.setScene(scene2);
//		});
//		
//		Label l2 = new Label("This is scene 2");
//		Button b2 = new Button("This is scene 2 button");
//		HBox root2 = new HBox();
//		root2.getChildren().addAll(l2,b2);
//		scene2=new Scene(root2,500,500);
//		b2.setOnAction(e->{
//			window.setScene(scene2);
//		});
//		
//		window.setScene(scene1);
//		window.setTitle("switch scenes");
//		window.show();
//
//	}
//	
//	public static void main(String[] args) {
//		launch(args);
//	}
//}
