import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MyPanel extends JPanel implements MouseListener{
	public MyPanel(){
		setBackground(Color.white);
		setPreferredSize(new Dimension(640,480));
		this.addMouseListener(this);
	}
	public void mousePressed(MouseEvent e)
	{
		int x = e.getX();
		int y = e.getY();
		Graphics g = this.getGraphics();
		g.drawOval(x,y,20,20);
		g.dispose();
		System.out.println(x);
		System.out.println(y);
		
	}
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseMoved(MouseEvent e){}
	public void mouseDragged(MouseEvent e){}

} 
