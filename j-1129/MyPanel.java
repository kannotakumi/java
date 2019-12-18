import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel // **** JFrameではない!! ****
{
    private int r;
    private int g;
    private int b;
    public MyPanel()
    {
        setBackground(Color.white); // 背景を白に設定
        setPreferredSize(new Dimension(640, 480)); // 大きさを640x480に設定
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
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // まずJPanelのデフォルトの描画処理(背景色でクリア)を行い,
	g.setColor(new Color(this.r,this.g,this.b));
        g.fillOval(200, 200, 256, 128);
            
    }
}
