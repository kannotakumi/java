import javax.swing.*;
import java.awt.*;
import java.net.*;
public class MyModel extends JApplet{
	private MyController mc;
	private MyView mv;
	private int total_seat;
	private int wid,len,studentnumber;
        private String[] sex_array;
        private String[] name_array;
        private int[] number_array;
	private int name,seat,number;
	private Image desk,boy,girl;
	private URL url1,url2,url3;

	public void init(){
		//this.mv = new MyView();
		this.name = 0;
		this.seat = 0;
		this.number = 0;
		/*this.len = 0;
		this.wid = 0;
		this.total_seat = 0;*/
		this.url1 = MyModel.class.getResource("desk.png");
		this.url2 = MyModel.class.getResource("boy.png");
		this.url3 = MyModel.class.getResource("girl.png");

		this.desk =  super.getImage(url1);
		//this.mc.getDesk(desk);
		this.girl =  super.getImage(url3);
		//this.mc.getGirl(girl);
		this.boy = super.getImage(url2);
		//this.mc.getBoy(boy);	
	}
	public Image getDesk(){
		return this.desk;
	}
	public Image getGirl(){
		return this.girl;
	}
	public Image getBoy(){
		return this.boy;
	}
	
	public void setLen(int len){
		this.len = len;
		System.out.println(this.len);
	}
	public void setWid(int wid){
		this.wid = wid;
		System.out.println(this.wid);
	}
	public int getLen(){
		System.out.println(this.len);
		return this.len;
	}
	public int getWid(){
		System.out.println(this.wid);
		return this.wid;
	}
	public int getSeat(){
		int len = this.len;
		int wid = this.wid;
		this.total_seat = len*wid;
	/*	this.sex_array = new String[this.total_seat];
		this.number_array = new int[this.total_seat];
		this.name_array = new String[this.total_seat];*/
		System.out.println(this.total_seat);
		return this.total_seat;

	}
	public void getName(String name){
		
		this.name_array[this.name] = name;
	//	System.out.println(this.name_array[this.name]);
		if(this.name == this.total_seat - 1){
			errorName();
		}
		else {	
		this.name ++;
		}	
	}
	public void getSex(String :)
	public String errorName(){
		String str = "これ以上は入力できません";
		
		return str;
		 
	}
}
		
