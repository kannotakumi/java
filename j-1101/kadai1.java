import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class kadai1 extends JFrame implements ActionListener{
	private JCheckBox cb1, cb2;
	private JButton judge;

	public kadai1(){
		super();
		this.cb1 = new JCheckBox("数学が得意");
		this.cb2 = new JCheckBox("英語が得意", true);
		this.judge = new JButton("判定");
		BorderLayout bord1 = new BorderLayout();
		FlowLayout flow1 = new FlowLayout();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.setLayout(flow1);
		panel1.add(this.cb1);
		panel1.add(this.cb2);
		panel2.add(panel1,BorderLayout.CENTER);
		panel2.add(this.judge,BorderLayout.SOUTH);

		getContentPane().add(panel2);

		this.judge.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
	if (e.getSource() == this.judge){
		if (this.cb1.isSelected() && this.cb2.isSelected()){
			System.out.println("素晴らしい！ その調子でどんどん伸ばしましょう。");
		}
		else if(this.cb2.isSelected()){
			System.out.println("合格　でも数学も大事です。");
		}
		else if(this.cb1.isSelected()){
			System.out.println("合格　でも英語も大事です。");
		}	

	}
}


	public static void main(String[] args){
		kadai1 a = new kadai1();

		a.setBounds(800,800,1000,1000);
		a.setVisible(true);
	}
}
