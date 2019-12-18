import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class MyFrame3 extends JFrame implements ChangeListener{
	private MyPanel3 mp;
	private JSlider s1,s2,s3;
        private JTextField t1,t2,t3,t4;
	public MyFrame3(){
		this.mp = new MyPanel3();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
                this.s1 = new JSlider(0,255,0);
                this.s2 = new JSlider(0,255,0);
                this.s3 = new JSlider(0,255,0);
                this.t1 = new JTextField("赤",5);
                this.t2 = new JTextField("緑",5);
                this.t3 = new JTextField("青",5);

		BorderLayout bord1 = new BorderLayout();
		GridLayout grid1 = new GridLayout(3,2);
		
		p1.setLayout(bord1);
                p2.setLayout(grid1);

                p1.add(p2,BorderLayout.SOUTH);
                p1.add(this.mp,BorderLayout.CENTER);
                p2.add(this.s1);
                p2.add(this.t1);
                p2.add(this.s2);
                p2.add(this.t2);
                p2.add(this.s3);
                p2.add(this.t3);

                getContentPane().add(p1);
                this.s1.addChangeListener(this);
                this.s2.addChangeListener(this);
                this.s3.addChangeListener(this);

	}
	public void stateChanged(ChangeEvent e){
        if (e.getSource() == this.s1){
                int r = this.s1.getValue();
                this.t1.setText("赤" + r );
                this.mp.setR(r);
                }
        else if (e.getSource() == this.s2){
                int g = this.s2.getValue();
                this.t2.setText("緑" + g);
                this.mp.setG(g);
                }
        else if (e.getSource() == this.s3){
                int b = this.s3.getValue();
                this.t3.setText("青" + b);
                this.mp.setB(b);
                }
        this.mp.repaint();
    }

	public static void main(String[] args){
		MyFrame3 a = new MyFrame3();
		a.setBounds(300,300,500,500);
		a.setVisible(true);
	}
}
