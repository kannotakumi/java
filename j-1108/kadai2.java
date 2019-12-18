import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class kadai2 extends JFrame implements ActionListener{
	
	private JButton b1;
	private JTextField f1;
	private JTextArea a1;
	
	public kadai2(){
	super();
	this.b1 = new JButton("読み込み");
	this.f1 = new JTextField(20);
	this.a1 = new JTextArea(20,30);

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	BorderLayout bord1 = new BorderLayout();
	FlowLayout flow1 = new FlowLayout();
	panel1.setLayout(null);
	panel2.setLayout(bord1);
	panel3.setLayout(flow1);
	panel2.setBounds(150,100,350,300);
	panel3.setBounds(150,450,200,200);
	panel3.add(this.b1);
	panel2.add(this.f1,BorderLayout.NORTH);
	panel2.add(this.a1,BorderLayout.CENTER);
	
	panel1.add(panel2);
	panel1.add(panel3);
	getContentPane().add(panel1);
	this.b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		String all = "";
		String s2 = "";
		if (e.getSource() == this.b1){
			try {
			String s = this.f1.getText();
			FileReader fr = new FileReader(s);
			BufferedReader br = new BufferedReader(fr);
			String buf;
			while ((buf = br.readLine()) != null)
			{
			all += buf;
			all += System.getProperty("line.separator");
			}
			this.a1.setText(all);
			br.close();
			fr.close();
			}
			catch (IOException a){
				System.out.println("error");
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args){
		kadai2 a = new kadai2();
		a.setBounds(0,0,800,800);
		a.setVisible(true);
	}
}
