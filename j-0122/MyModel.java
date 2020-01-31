import javax.swing.*;
import java.awt.*;
import java.net.*;
public class MyModel {
	private MyController mc;
	private int total_seat;
	private int wid,len,studentnumber;
        private MyView mv;
        private String[] sex_array;
        private String[] name_array;
        private int[] number_array;
	private int name,seat,number;
	private ImageIcon desk,boy,girl;

	public MyModel(){
		this.mc = new MyController();
		this.total_seat = 0;
		this.name = 0;
		this.seat = 0;
		this.number = 0;
		URL url1 = MyModel.class.getResource("desk.png");
		URL url2 = MyModel.class.getResource("boy.png");
		URL url3 = MyModel.class.getResource("girl.png");

		this.desk = new ImageIcon(url1);
		this.girl = new ImageIcon(url2);
		this.boy = new ImageIcon(url3);	
	}
	
	public void getSeat(){
		this.total_seat = wid*len;
		this.sex_array = new String[this.total_seat];
		this.number_array = new int[this.total_seat];
		this.name_array = new String[this.total_seat];
	}
	public void getLen(int len){
		this.len = len;
	}
	public void getWid(int wid){
		this.wid = wid;
	}
	public int setLen(){
		return this.len;
	}
	public int setWid(){
		return this.wid;
	}
	public int setSeat(){
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
	public String errorName(){
		String str = "これ以上は入力できません";
		
		return str;
		 
	}
	public JLabel setdesk(){
		JLabel ldesk = new JLabel(this.desk);
		return ldesk;
		}

	}
