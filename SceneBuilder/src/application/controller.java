package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

public class controller {

	@FXML
	private Circle c;
	public Button button,button1,button2;
	int count =0;
	int count2=0;
//	public void buttonAction()
//	{
//		System.out.println(count++);
//	}
	public void button1Action()
	{
		c.setCenterX(count =count +10);
	}
	public void button2Action()
	{
		c.setCenterY(count2+=10);
	}

}
