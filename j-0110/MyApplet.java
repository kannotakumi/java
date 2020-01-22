import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.net.*;
public class MyApplet extends JApplet implements ActionListener{
	private MyPanel3 mp;
	private Timer timer;

	public void init(){
	this.timer = new Timer(500,this);
	this.timer.start();
	this.mp = new MyPanel3();
	JPanel p1 = new JPanel();
	BorderLayout bord1 = new BorderLayout();
	Image[] earth_array = new Image[3];
	Image[] moon_array = new Image[1];

	for (int i = 0; i < 3; i++){
		URL earth_url = MyApplet.class.getResource("earth" + i + ".jpg");
		Image earth = super.getImage(earth_url);
		earth_array[i] = earth;
	}
	URL moon_url = MyApplet.class.getResource("moon.jpg");
	Image moon = super.getImage(moon_url);
	moon_array[0] = moon;

	this.mp.setEarth_array(earth_array);
	this.mp.setMoon_array(moon_array);
	p1.setLayout(bord1);
	p1.add(this.mp,BorderLayout.CENTER);
	getContentPane().add(p1);
	}
	public void actionPerformed(ActionEvent e){
		this.mp.repaint();
	}

	public static void main(String[] args){
		MyApplet a = new MyApplet();
	//	a.setBounds(300,300,500,500);
	//	a.setVisible(true);
	}

}
