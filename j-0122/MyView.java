import javax.swing.*;
import java.awt.*;

public class MyView extends JPanel{
	
	private MyController mc;

	public MyView(){
		this.mc = new MyController();
		setBackground(Color.white);
		setPreferredSize(new Dimension(800,800));
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
			
	}
}
