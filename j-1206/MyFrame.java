import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
	private MyPanel mp;
	public MyFrame(){
		this.mp = new MyPanel();
		JPanel p1 = new JPanel();
		BorderLayout bord1 = new BorderLayout();
		p1.add(this.mp,BorderLayout.CENTER);
		getContentPane().add(p1);	
	}
	public static void main(String[] args){
		MyFrame a = new MyFrame();
		a.setBounds(300,300,500,500);
		a.setVisible(true);
	}
}
