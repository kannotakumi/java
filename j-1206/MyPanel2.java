import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MyPanel2 extends JPanel implements MouseMotionListener,MouseListener{
	private int saveX,saveY;
	private int r,g,b;
	private float bs;
	public MyPanel2(){
		setBackground(Color.white);
		setPreferredSize(new Dimension(640,480));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	public void setR(int r){
		this.r = r;
	}
	public void setG(int g){
		this.g = g;
	}
	public void setB(int b){
		this.b = b;
	}
	public void mousePressed(MouseEvent e)
	{
		this.saveX = e.getX();
		this.saveY = e.getY();	
		/*Graphics g = this.getGraphics();
		g.drawOval(x,y,20,20);
		g.dispose();
		System.out.println(x);
		System.out.println(y);*/
		
	}
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseMoved(MouseEvent e){}
	public void mouseDragged(MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		Graphics g = this.getGraphics();
		g.setColor(new Color(this.r,this.g,this.b));
		g.drawLine(saveX,saveY,x,y);
		this.saveX = x;
		this.saveY = y;
		g.dispose();
		
	
	}

} 
