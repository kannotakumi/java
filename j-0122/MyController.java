import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.Timer;
import java.net.*;
public class MyController extends JApplet implements ActionListener{
	
	private MyView mv;
	private JTextField name;
	private JTextField sex;
	private JTextField number;
	private JTextField tseatwid,tseatlen;
	private JLabel lseatwid, lseatlen;
	private JCheckBox num,se,na;
	private JButton ok;
	private JButton ok2;
	//private JPanel seat,attendanece;	

	public void init(){
	this.mv = new MyView();
	JPanel mainp = new JPanel();
	JPanel student = new JPanel();
	//this.attendance = new JPanel();
	JPanel info = new JPanel();
	JPanel input = new JPanel();

	this.lseatwid = new JLabel("席の縦の長さは？");
	this.lseatlen = new JLabel("席の横の長さは？");
	
	this.tseatwid = new JTextField(3);
	this.tseatlen = new JTextField(3);

	this.nam = new JCheckBox("出席番号");
	this.se = new JCheckBox("性別");
	this.na = new JCheckBox("名前");
	this.ok = new JButton("決定");
	this.ok2 = new JButton("生徒数決定");
 
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
	getContentPane().add(mainp);
	this.ok.addActionListener(this);
	this.ok2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == this.ok){
			if(this.num.isSelected() && this.se.isSelected() && this.na.isSelected()){
				if(!(this.number.getText().equals("")) && !(this.sex.getText().equals("")) && this.name.getText().equals("")){
				
				}
			}
			}
		else if (e.getSource() == this.ok2){
			if(!(this.tseatwid.getText().equals("")) && !(this.tseatwid.getText().equals(""))){
				this.mv.setseat(Integer.parseInt(this.tseatwid.getText()), Integer.parseInt(this.tseatlen.getText()));
				
				this.tseatwid.setText("生徒数は" + this.mv.reseat() + "です");
			
			}
		}
	}
	
	public static void main(String[] args){
		MyController a = new MyController();
	}

}
