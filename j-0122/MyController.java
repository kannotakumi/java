import javax.sqing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.net.*;
public class MyController extends JApplet implements ActionListener{
	
	private MyView mv;
	private Timer timer;
	private JTextField name;
	private JTextField sex;
	private JTextField seat;
	private JRadioButton st,se,na;
	private JButton ok;
	private JPanel seat,attendanece;	

	public void init(){
	this.timer = new Timer(800,this);
	this.mv = new MyView();
	JPanel main = new JPanel();
	//this.seat = new JPanel();
	//this.attendance = new JPanel();
	JPanel info = new JPanel();
	this.st = new JRadioButton("出席番号");
	this.se = new JRadioButton("性別");
	this.na = new JRadioButton("名前");
	this.ok = new Button("決定"); 
	this.seat = new JTextField(5);
	this.sex = new JTextField(1);
	this.name = new JTextField(20);

	BorderLayout bord1 = new BorderLayout();
	GridLayout grid1 = new Gridlayout(2,3);

	main.setlayout(bord1);
	info.setLayout(grid1);
	main.add(info,)
	
	}
	public static void main(String[] args){
		MyController a = new MyController();
	}

	}
