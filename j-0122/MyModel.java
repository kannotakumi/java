import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.util.Random;
public class MyModel{
	private MyController mc;
	private MyView mv;
	private int total_seat;
	private int wid,len,studentnumber;
        private String[] sex_array;
        private String[] name_array;
        private String[] number_array;
	private String[] Rsex_array;
	private String[] Rname_array;
	private String[] Rnumber_array;
	private int name,seat,number,sex;
	private Image desk,boy,girl;
	private URL url1,url2,url3;
	private int cont;

	public  MyModel(){
		this.name = 0;
		this.seat = 0;
		this.number = 0;
		this.sex = 0;
		this.cont = 0;
		/*this.len = 0;
		this.wid = 0;
		this.total_seat = 0;*/
		Toolkit tk = Toolkit.getDefaultToolkit();
		/*this.url1 = MyModel.class.getResource("desk.png");

		this.desk =  super.getImage(url1);

		this.url2 = MyModel.class.getResource("boy.png");
		this.url3 = MyModel.class.getResource("girl.png");
		*/
		//this.mc.getDesk(desk);

		this.desk = tk.getImage("desk.png");
		//this.mv.setDesk(this.desk);
		this.girl = tk.getImage("girl.png");
		//this.mc.getGirl(girl);
		this.boy = tk.getImage("boy.png");
		//this.mc.getBoy(boy);	
		System.out.println(this.desk);
	}
	public Image getDesk(){
		
				//System.out.println(this.desk);
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
		//System.out.println(this.len);
	}
	public void setWid(int wid){
		this.wid = wid;

	}
	public int getLen(){
		//System.out.println(this.len);
		return this.len;
	}
	public int getWid(){
		//System.out.println(this.wid);
		return this.wid;
	}
	public void getSeat(){
		int len = this.len;
		int wid = this.wid;
		this.total_seat = len*wid;
		this.sex_array = new String[this.total_seat];
		this.number_array = new String[this.total_seat];
		this.name_array = new String[this.total_seat];
		this.Rname_array = new String [this.total_seat];
		this.Rnumber_array = new String [this.total_seat];
		this.Rsex_array = new String [this.total_seat];

		//System.out.println(this.total_seat);

	}
	public int getTotal_seat(){
		return this.total_seat;
	}
	public void getName(String name){
			
		this.name_array[this.name] = name;
	//	System.out.println(this.name_array[this.name]);
		if(this.name == this.total_seat - 1){
			/*for(int i = 0; i <= this.name; i++){
			System.out.println(this.name_array[i]);
			}*/
			System.out.println(error());
		}
		else {	
			this.name++;
		}	
	}
	public void getSex(String sex){
		this.sex_array[this.sex] = sex;
	       	if(this.sex == this.total_seat -1){
		//	System.out.println(this.sex_array[this.sex]);
			System.out.println(error());

		}	
		else {
			this.sex++;
		}
	}
	public void getNumber(String number){
		this.number_array[this.number] = number;
		if(this.number == this.total_seat -1){
			System.out.println(error());
		}
		else {
			this.number++;
		}
	}
	/*public void getRandom(){
		long seed = System.currentTimeMillis();
		Random rnd = new Random(seed);
		int irnd = rnd.nextInt(this.total_seat);
		System.out.println(irnd);
		return irnd;

	}*/
	public String error(){
		String str = "これ以上は入力できません";
		
		return str;
		 
	}
	public void getContInit(){
		this.cont = 1;
	}
	public void getContShuf(){
		this.cont = 2;
	}
	/*public void getContName(){
		this.cont =3;
	}*/
	public int setContInit(){
		//System.out.println(this.cont);
		return this.cont;
	}
	public void getContReseat(){
		this.cont = 3;
	}
	/*public int setContShuf(){
		System.out.println(this.cont);
		return this.cont;
	}*/
	public void getRseat(){
		for(int i = 0; i < this.total_seat;i++){
		Random rnd = new Random();
		int irnd = rnd.nextInt(100000) % (this.total_seat);
		//System.out.println(irnd);
		if(!(this.number_array[irnd].equals("")) && !(this.name_array[irnd].equals("")) && !(this.sex_array[irnd].equals(""))){
		this.Rname_array[i] = this.name_array[irnd];
		this.Rsex_array[i] = this.sex_array[irnd];
		this.Rnumber_array[i] = this.number_array[irnd];

		this.name_array[irnd] = "";
		this.sex_array[irnd] = "";
		this.number_array[irnd] = "";
		System.out.println(this.Rname_array[i] + ":" + this.Rsex_array[i] + ":" + this.Rnumber_array[i]);
		
		}
		else if (this.number_array[irnd].equals("") && this.name_array[irnd].equals("") && this.sex_array[irnd].equals("")){

		System.out.println("席:" + i);
		System.out.println("乱数" + irnd);
		i--;
		}
		}

	} 
	public String[] setRsex(){
		return this.Rsex_array;
	}
	public String[] setRname(){
		return this.Rname_array;
	}
	public String[] setRnumber(){
		return this.Rname_array;
	}
}
		
