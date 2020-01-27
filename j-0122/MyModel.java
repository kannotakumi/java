public class MyModel {
	private int seat;
	private int wid,len,studentnumber;
        private MyView mv;
        private String[] sex;
        private String[] name;
        private int[] number;


	
	public MyModel(){
		this.seat = 0;
	}
	
	public void setSeat(int wid,int len){
		this.seat = wid*len;
	}
	public int reSeat(){
		return this.seat;
	}

	}
