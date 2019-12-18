import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class kadai5 extends JFrame implements ActionListener{

	private JButton button1;
	private JLabel ti;
	private JPanel panel;
	private CardLayout layout;

	public kadai5(){
		super();
		panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		layout = new CardLayout();
		panel.setLayout(layout);
		panel.add(panel1);
		panel.add(panel2);
		this.button1 = new JButton("あいさつ");
		this.ti = new JLabel("hello");

		panel1.add(this.button1);
		panel2.add(this.ti);
		
		this.button1.addActionListener(this);
		getContentPane().add(panel,BorderLayout.CENTER);
	
	}
	public void actionPerformed(ActionEvent e){
	if (e.getSource() == this.button1){
		layout.next(this.panel);
	}
	
	}

	public static void main(String[] args){
	
		kadai5 a = new kadai5();
		a.setSize(800,800);
		a.setLocation(100,100);
		a.setVisible(true);
	}



}
