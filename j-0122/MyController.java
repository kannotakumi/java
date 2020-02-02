import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.Timer;
import java.net.*;
public class MyController extends JApplet implements ActionListener{
	
	private MyView mv;
	private MyModel mm;
	private JTextField name;
	private JTextField sex;
	private JTextField number;
	private JTextField tseatwid,tseatlen;
	private JLabel lseatwid, lseatlen;
	private JLabel num,se,na;
	private JButton ok;
	private JButton ok2;
	private JButton shuffle;
	private JButton reseat;
	private String[] Ssex,Sname,Snumber;
	//iint total = 0;
	private JPanel Jseat;
	private JLabel Lseat,lboy,lgarl;
       private Image desk,girl,boy;
	private boolean shuf;      
	//private Image[] Iseat,Istudent;
	//private JPanel seat,attendanece;	

	public void init(){
	this.mm = new MyModel();
	this.mv = new MyView(this);
	this.Jseat = new JPanel();
	JPanel mainp = new JPanel();
	JPanel student = new JPanel();
	//this.attendance = new JPanel();
	JPanel info = new JPanel();
	JPanel input = new JPanel();

	this.lseatwid = new JLabel("席の縦の長さは？");
	this.lseatlen = new JLabel("席の横の長さは？");
	
	this.tseatwid = new JTextField(3);
	this.tseatlen = new JTextField(3);

	this.num = new JLabel("出席番号");
	this.se = new JLabel("性別");
	this.na = new JLabel("名前");
	this.ok = new JButton("決定");
	this.ok2 = new JButton("生徒数決定");
	this.shuffle = new JButton("席替え開始");
	this.reseat = new JButton("再描画");
 
	this.number = new JTextField(5);
	this.sex = new JTextField(1);
	this.name = new JTextField(20);

	
	BorderLayout bord1 = new BorderLayout();
	GridLayout grid1 = new GridLayout(2,3);
	GridLayout grid2 = new GridLayout(1,2);
	GridLayout grid3 = new GridLayout(2,2);
	FlowLayout flow1 = new FlowLayout();

	mainp.setLayout(bord1);

	info.setLayout(grid1);
	student.setLayout(grid2);
	input.setLayout(grid3);
	
	info.add(this.num);
	info.add(this.se);
	info.add(this.na);
	info.add(this.number);
	info.add(this.sex);
	info.add(this.name);

	student.add(this.lseatwid);
	student.add(this.lseatlen);
	student.add(this.tseatwid);
	student.add(this.tseatlen);
	
	input.add(info);
	input.add(this.ok);
	input.add(student);
	input.add(this.ok2);
	
	mainp.add(input,BorderLayout.SOUTH);
	mainp.add(this.mv,BorderLayout.CENTER);
	mainp.add(this.shuffle,BorderLayout.NORTH);
	mainp.add(this.reseat,BorderLayout.EAST);
	getContentPane().add(mainp);
	this.ok.addActionListener(this);
	this.ok2.addActionListener(this);
	this.shuffle.addActionListener(this);
	this.reseat.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == this.ok){
		//this.mm.getContName();	
			if(!(this.number.getText().equals("")) && !(this.sex.getText().equals("")) && !(this.name.getText().equals(""))){

					this.mm.getName(this.name.getText());
					this.mm.getSex(this.sex.getText());
					this.mm.getNumber(this.number.getText());
				}		
			}
		else if (e.getSource() == this.ok2){
				
			this.mm.getContInit();
			if(!(this.tseatwid.getText().equals("")) && !(this.tseatwid.getText().equals(""))){
				this.mm.setLen(Integer.parseInt(this.tseatlen.getText()));
				this.mm.setWid(Integer.parseInt(this.tseatwid.getText()));
				this.mm.getSeat();
				//int total = this.mm.setSeat();
				//int wid = this.mm.setWid();
				//int len = this.mm.setLen();
				//this.mv.getPanel(len,wid,this.mm.setdesk());

				//GridLayout grid4 = new GridLayout(len,wid);
				//this.Jseat.setLayout(grid4);		
				//this.tseatwid.setText("生徒数は" + total + "です");
				//while(i <= total ){	
				//this.Jseat.add(this.mm.setdesk());
				//i++;				
				//}
			}
		}
		else if (e.getSource() == this.shuffle){
			this.mm.getContShuf();
		}		
		else if (e.getSource() == this.reseat){
			this.mm.getContReseat();
		}
	this.mv.repaint();
	}
	public MyModel getMc()
	{
		return this.mm;
	}
	
	public static void main(String[] args){
		MyController a = new MyController();
	}

}
