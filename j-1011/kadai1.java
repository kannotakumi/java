import javax.swing.*;
import java.awt.*;
public class kadai1 extends JFrame{
	private JLabel label1;
	private JButton button1;
	private JButton button2;

	public kadai1(){
		super();
		this.label1 = new JLabel("hello");
		this.button1 = new JButton("push!");
		this.button2 = new JButton("don't push");
		JPanel panel1 = new JPanel();
		FlowLayout flow1 = new FlowLayout();
		panel1.setLayout(flow1);
		panel1.add(this.label1);
		panel1.add(this.button1);
		panel1.add(this.button2);		
		getContentPane().add(panel1);
	}
	public static void main(String[] args){
		kadai1 a = new kadai1();
		
		a.setSize(800,800);
		a.setLocation(100,100);
		a.setVisible(true);
	}
}
