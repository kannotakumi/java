import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MyJSlider extends JFrame implements ChangeListener{
	private JSlider s1;
	private JTextField tf1;

	public MyJSlider(){
	super();
	this.s1 = new JSlider();
	this.tf1 = new JTextField(5);
	
	JPanel p1 = new JPanel();

	BorderLayout bord1 = new BorderLayout();
	p1.setLayout(bord1);
	
	p1.add(this.s1, BorderLayout.CENTER);
	p1.add(this.tf1, BorderLayout.SOUTH);
	
	this.tf1.setText("値:" + this.s1.getValue());
	getContentPane().add(p1);
	this.s1.addChangeListener(this);
	}
	public void stateChanged(ChangeEvent e){
		if (e.getSource() == this.s1){
			this.tf1.setText("値:" + this.s1.getValue());
		}
	
	}



	public static void main (String[] args){
		MyJSlider a = new MyJSlider();
		a.setBounds(200,200,400,400);
		a.setVisible(true);
	}


}
