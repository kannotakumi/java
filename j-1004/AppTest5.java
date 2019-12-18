import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AppTest5 extends JFrame implements ActionListener{
	private JButton button1;
	private JButton button2;
	private JLabel Answer;
	private JLabel toi;
	public AppTest5(){
		super();
                this.button1 = new JButton("　○　");
		this.button2 = new JButton(" ☓ ");
		this.Answer = new JLabel();
		this.toi = new JLabel("AT-15の正面装甲は２０３mmである");
                getContentPane().add(this.button1,BorderLayout.WEST);
		getContentPane().add(this.button2,BorderLayout.EAST);
		getContentPane().add(this.toi,BorderLayout.NORTH);
		getContentPane().add(this.Answer,BorderLayout.CENTER);

		this.button1.addActionListener(this);
		this.button2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == this.button1){
		
		Answer.setText("正解");
		}
		else if (e.getSource() == this.button2){
		Answer.setText("不正解");
		}
	}
	public static void main(String[] args){
                AppTest5 a = new AppTest5();

                a.setSize(800,800);
                a.setLocation(100,100);
                a.setVisible(true);

        }


}
