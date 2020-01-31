import javax.swing.*;
import java.awt.*;

public class MyView extends JPanel{
	
	private MyController mc;
	private MyModel mm;
	private JPanel Jseat;
	private GridLayout grid1;

	public MyView(){
		this.mc = new MyController();
		this.mm = new MyModel();
		this.Jseat = new JPanel();
		setBackground(Color.white);
		setPreferredSize(new Dimension(800,800));
		
	}
	public int setTotal(int total){
		int t = total;
		return t;
	}
	public void getPanel(int len,int wid,JLabel desk){
		this.grid1 = new GridLayout(len,wid);	
		this.Jseat.setLayout(grid1);
		int i = 0;
		while(i <= setTotal(this.mm.setSeat())){
			this.Jseat.add(desk);
			i++;
		}
	}
	public JPanel setPanel(){
		return this.Jseat;
		}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		System.out.println("画面が更新されました");
		
		
			
	}
}
