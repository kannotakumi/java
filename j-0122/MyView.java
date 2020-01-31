import javax.swing.*;
import java.awt.*;

public class MyView extends JPanel{
	
	private MyController mc;
	private MyModel mm;
	private int wid,len,total;
	private Image desk,girl,boy;

	public MyView(MyController MC){
		this.mc = MC;
		this.mm = this.mc.getMc();
		setBackground(Color.white);
		setPreferredSize(new Dimension(800,800));
		
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.len = this.mm.getLen();
	      	this.wid = this.mm.getWid();
		this.total = this.mm.getSeat();
		this.desk = this.mm.getDesk();
		this.girl = this.mm.getGirl();
		this.boy = this.mm.getBoy();

	
		System.out.println("縦:" + this.len + ",横:" + this.wid + ",合計人数:" + this.total);
		
		
			
	}
}
