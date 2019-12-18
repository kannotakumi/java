import javax.swing.*;
import java.awt.*;
public class kadai2 extends JFrame{
        private JLabel label1;
        private JButton button1;
        private JButton button2;

        public kadai2(){
                super();
                this.label1 = new JLabel("hello");
                this.button1 = new JButton("push!");
                this.button2 = new JButton("don't push");
                JPanel panel1 = new JPanel();
		BorderLayout border1 = new BorderLayout();
                panel1.setLayout(border1);
                panel1.add(this.label1,BorderLayout.SOUTH);
                panel1.add(this.button1,BorderLayout.WEST);
                panel1.add(this.button2,BorderLayout.EAST);
                getContentPane().add(panel1);
        }
        public static void main(String[] args){
                kadai2 a = new kadai2();

                a.setSize(800,800);
                a.setLocation(100,100);
                a.setVisible(true);
        }
}

