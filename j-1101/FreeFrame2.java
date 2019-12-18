import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FreeFrame2 extends JFrame implements ActionListener{
	private JRadioButton at,mj,es;
	private JLabel label1,label2,koro;
	private ImageIcon ene,make;
	private JButton go;
	private JCheckBox ene1,ene2;
	private int hp1 = 50;
	private int hp2 = 50;
	private int atk = 10;
	private int maj = 20;
	private JPanel panel1,panel2,panel3,panel4;

	public FreeFrame2(){
		super();
		this.at = new JRadioButton("殴る");
		this.mj = new JRadioButton("魔法");
		this.es = new JRadioButton("逃走");
		this.go = new JButton("決定");
		this.ene = new ImageIcon("./yaruo.jpg");
		this.ene1 = new JCheckBox("敵１");
		this.ene2 = new JCheckBox("敵２");
		this.label1 = new JLabel(this.ene);
		this.label2 = new JLabel(this.ene);
		ButtonGroup group = new ButtonGroup();

		group.add(this.at);
		group.add(this.mj);
		group.add(this.es);

		BorderLayout bord1 = new BorderLayout();
		FlowLayout flow1 = new FlowLayout();
		this.panel1 = new JPanel();
		this.panel2 = new JPanel();
		this.panel3 = new JPanel();
		this.panel4 = new JPanel();

		panel1.setLayout(null);
		panel2.setLayout(flow1);
		panel4.setLayout(flow1);

		panel3.add(this.label1);
		panel3.add(this.label2);

		panel2.add(this.at);
		panel2.add(this.mj);
		panel2.add(this.es);
		panel2.add(this.go);

		panel4.add(this.ene1);
		panel4.add(this.ene2);

		panel3.setBounds(375,0,300,200);
		panel2.setBounds(375,350,300,200);
		panel4.setBounds(275,300,500,300);


		panel1.add(this.panel2);
		panel1.add(this.panel3);
		panel1.add(this.panel4);
		getContentPane().add(this.panel1);
		this.go.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == this.go){
			if(this.at.isSelected()){
				if(this.ene1.isSelected() && this.ene2.isSelected()){
					hp1 = hp1 - (atk/2);
					hp2 = hp2 - (atk/2);
					System.out.println(hp1);
					Sc static void main (String[] args){
                kadai2 a = new kadai2();
                a.setBounds(800,800,1000,1000);
                a.setVisible(true);

        }

}
ystem.out.println(hp2);
				}
				else if(this.ene1.isSelected()){
					hp1 = hp1 - atk;
					System.out.println(hp1);
					System.out.println(hp2);

				}
				else if(this.ene2.isSelected()){
					hp2 = hp2 - atk;
					System.out.println(hp1);
					System.out.println(hp2);

				}
			}
			else if(this.mj.isSelected()){
				if(this.ene1.isSelected() && this.ene2.isSelected()){
					System.out.println("魔法は一体しか選択できない。");	
				}
				else if(this.ene1.isSelected()){
					hp1 = hp1 - maj;
					System.out.println(hp1);
					System.out.println(hp2);

				}
				else if(this.ene2.isSelected()){
					hp2 = hp2 - maj;
					System.out.println(hp1);
					System.out.println(hp2);

				}

			}
			else if (this.es.isSelected()){
			panel1.removeAll();
			this.make = new ImageIcon("./koro.jpg");
			this.koro = new JLabel(this.make);
			koro.setBounds(500,500,600,600);
			panel1.add(koro);
			panel1.revalidate();
			panel1.repaint(); 		
			}	
		}
		if(hp1 <= 0 && hp2 <= 0){
		System.out.println("やる夫は撃滅されました");
		}
			


	}
	public static void main (String[] args){
		FreeFrame2 a = new FreeFrame2();
		a.setBounds(0,0,1000,1200);
		a.setVisible(true);
	}
} 
