import javax.swing.*;
import java.awt.*;

public class MyPanel3 extends JPanel{
	private int ex,ey,mx,my,i,distance,angle;
	private Image[] earth_array;
	private Image[] moon_array;
	

	public MyPanel3(){
		this.i = 0;
		this.distance = 150;
		this.angle = 0;
		setBackground(Color.white);
		setPreferredSize(new Dimension(640,480));
	}
	
	public void setEarth_array(Image[] earth_array){
		this.earth_array = new Image[3];
		for (int i = 0; i < 3; i++){
		this.earth_array[i] = earth_array[i]; 
		}
	}
	public void setMoon_array(Image[] moon_array){
		this.moon_array = new Image[1];
		this.moon_array[0] = moon_array[0];
		}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
				double rad = Math.toRadians(angle);
		this.ex = 200;
		this.ey = 200;
		this.mx = (int)(Math.cos(rad) * distance) + ex;
		this.my = (int)(Math.sin(rad) * distance) + ey;
		g.drawImage(this.earth_array[i],this.ex,this.ey,this);
		g.drawImage(this.moon_array[0],this.mx,this.my,this);
		if (i == 2 ){
		i = 0;
		}else {
		i++;
		}
		angle += 10;			
		System.out.println("i=" + i +"mx=" + mx + ",my=" + my);
	}

}
