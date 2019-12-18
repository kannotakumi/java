import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class kadai2 extends JFrame implements ActionListener{
	private JRadioButton rb1, rb2, rb3;
	private JButton kettei;

	public kadai2(){
		super();
		this.rb1 = new JRadioButton("大学編入学");
		this.rb2 = new JRadioButton("専攻科進学", true);
		this.rb3 = new JRadioButton("就職");
		ButtonGroup group = new ButtonGroup();
		group.add(this.rb1);
		group.add(this.rb2);
		group.add(this.rb3);
		this.kettei = new JButton("決定");
		BorderLayout bord1 = new BorderLayout();
		FlowLayout flow1 = new FlowLayout();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.setLayout(bord1);
		panel2.setLayout(flow1);
		panel2.add(this.rb1);
		panel2.add(this.rb2);
		panel2.add(this.rb3);
		panel1.add(panel2,BorderLayout.NORTH);
		panel1.add(kettei,BorderLayout.CENTER);
		getContentPane().add(panel1);
		this.kettei.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
	if (e.getSource() == this.kettei){
		if (this.rb1.isSelected()){
			System.out.println("では数学の応用など頑張り、学年上位を目指そう。");
		}
		else if (this.rb2.isSelected()){
			System.out.println("ではまず赤点をなくして高得点を狙いましょう。");
		}
		else if (this.rb3.isSelected()){
			System.out.println("資格勉強や専門を頑張りましょう。");
		}

	}

	}
	public static void main (String[] args){
		kadai2 a = new kadai2();
		a.setBounds(800,800,1000,1000);
		a.setVisible(true);

	}

}
