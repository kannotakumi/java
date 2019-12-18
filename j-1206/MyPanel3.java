import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.image.*;

public class MyPanel3 extends JPanel implements MouseMotionListener,MouseListener{
	private int saveX,saveY;
	private BufferedImage bi;
	private int r,g,b;
	public MyPanel3(){
		setBackground(Color.white);
		setPreferredSize(new Dimension(640,480));
		this.bi = new BufferedImage(640,480,BufferedImage.TYPE_INT_ARGB);
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
		Graphics g = bi.getGraphics();
		this.repaint();
		/*g.drawOval(x,y,20,20);
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
		Graphics g = bi.getGraphics();
		g.setColor(new Color(this.r,this.g,this.b));
		g.drawLine(saveX,saveY,x,y);
		this.saveX = x;
		this.saveY = y;
		g.dispose();
		this.repaint();
		
		
	
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(this.bi,0,0,this);
	}

} 
