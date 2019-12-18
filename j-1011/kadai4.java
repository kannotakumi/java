import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class kadai4 extends JFrame implements ActionListener{

	private JLabel label1;
	private JLabel ti;
	private JButton button1;
	private JButton button2;
	private JLabel end1;
	private JLabel end2;
	private JPanel panel;
	public kadai4(){
		super();
		this.panel = new JPanel();
		panel.setLayout(null);
		this.button1 = new JButton("Download");
		button1.setBounds(40,170,100,50);
		this.button2 = new JButton("Cancel");
		button2.setBounds(300,170,100,50);
		this.label1 = new JLabel("choice!");
		label1.setBounds(175,0,100,50);

		this.ti = new JLabel("kushirokosen.zip");
		ti.setBounds(160, 50, 200, 50);

		panel.add(label1);
		panel.add(ti);
		panel.add(button1);
		panel.add(button2);
		
		getContentPane().add(panel);

		this.button1.addActionListener(this);
		this.button2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e){
		panel.removeAll();
		if (e.getSource() == this.button1){
			this.end1 = new JLabel("end Download!");
			end1.setBounds(175,175,100,100);
			panel.add(end1);
			panel.revalidate();
						
		}
		else if (e.getSource() == this.button2){
			this.end2 = new JLabel("That is a terrible shame.");
			end2.setBounds(175,175,200,100);
			panel.add(end2);
			panel.revalidate();
		}
		panel.repaint();
	}
	
	public static void main(String[] args){
		kadai4 a = new kadai4();
		a.setBounds(950,400,400,400);
		a.setVisible(true);
	}


}
