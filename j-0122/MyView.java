import javax.swing.*;
import java.awt.*;

public class MyView extends JPanel{

	private MyController mc;
	private MyModel mm;
	private int wid,len,total;
	private Image desk,girl,boy;

	public MyView(MyController MC){
		this.mc = MC;
		//	this.x = 100;
		//	this.y = 100;
		this.mm = this.mc.getMc();
		setBackground(Color.white);
		setPreferredSize(new Dimension(800,800));

	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int x = 100;
		int y = 100;
		int sx = 300;
		int sy = 300;
		/*this.len = this.mm.getLen();
		  this.wid = this.mm.getWid();
		  this.total = this.mm.getSeat();
		  this.desk = this.mm.getDesk();
		  this.girl = this.mm.getGirl();
		  this.boy = this.mm.getBoy();*/

		//	System.out.println(this.desk);

		//	System.out.println("縦:" + this.mm.getLen() + ",横:" + this.mm.getWid() + ",合計人数:" + this.mm.getSeat());
		if (this.mm.setContInit() == 1){	
			for(int i = 0; i < this.mm.getLen(); i++ ){
				for(int j = 0; j < this.mm.getWid(); j++){
					g.drawImage(this.mm.getDesk(),x,y,this);
					x += 100;
				}
				y += 100;
				x = 100;
			}
		}
		else if (this.mm.setContInit() == 2){
			this.mm.getRseat();
		
		}
		else if (this.mm.setContInit() == 3){
			String sex[], name[], number[]; 
			sex = this.mm.setRsex();
			name = this.mm.setRname();
			number = this.mm.setRnumber();
			int t = 0;
			for(int i = 0;i < this.mm.getLen(); i++){
				for(int j = 0;j < this.mm.getWid(); j++){
				if(sex[t].equals("man")){
					g.drawImage(this.mm.getBoy(),x,y,this);
					g.drawString(number[t] + ":" + sex[t] + ":" + name[t],x, y + 100);
					x += 150;
					t++;
				}
				else if (sex[t].equals("woman")){
					g.drawImage(this.mm.getGirl(),x,y,this);
					g.drawString(number[t] + ":" + sex[t] + ":" + name[t],x, y + 100);
					x += 150;
					t++;
				}
			}
				y += 100;
				x = 100;

			}

		}	
	}	

}
