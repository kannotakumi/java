import javax.swing.*;
import java.awt.*;

public class ComplexFrame extends JFrame {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JLabel label1;
	private JLabel label2;
	
	public ComplexFrame(){
		super();
		this.label1 = new JLabel("greeting");
		this.label2 = new JLabel("type");
		this.button1 = new JButton("hello");
		this.button2 = new JButton("привет там");
		this.button4 = new JButton("こんにちわ");
		FlowLayout flow1 = new FlowLayout();
		BorderLayout border1 = new BorderLayout();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.setLayout(flow1);
		panel1.add(label1);
		panel1.add(button4);

		panel2.setLayout(border1);
		panel2.add(panel1,BorderLayout.NORTH);
		panel2.add(label2,BorderLayout.SOUTH);
		panel2.add(button1,BorderLayout.EAST);
		panel2.add(button2,BorderLayout.WEST);
		
		getContentPane().add(panel2);
	}

	public static void main(String[] args){
		ComplexFrame a = new ComplexFrame();
		a.setSize(1000,1000);
		a.setLocation(100,100);
		a.setVisible(true);			
	

}
}
