import javax.swing.*;
import java.io.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JFileChooserTest5 extends JFrame implements ActionListener{
 private static boolean checkBeforeReadfile(File file){
  
    if (file.exists()){
      if (file.isFile() && file.canRead()){
        return true;
      }
    }
    return false;
  }
  JTextArea textarea;

  public static void main(String[] args){
    JFileChooserTest5 frame = new JFileChooserTest5();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JFileChooserTest5(){
    JButton button = new JButton("file select");
    button.addActionListener(this);

    JPanel buttonPanel = new JPanel();
    buttonPanel.add(button);

    textarea = new JTextArea();
    textarea.setLineWrap(true);

    JScrollPane scrollpane = new JScrollPane(textarea);
    scrollpane.setPreferredSize(new Dimension(120, 120));

    JPanel textPanel = new JPanel();
    textPanel.add(scrollpane);

    getContentPane().add(textPanel, BorderLayout.CENTER);
    getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e){
    JFileChooser filechooser = new JFileChooser();

    int selected = filechooser.showOpenDialog(this);
    if (selected == JFileChooser.APPROVE_OPTION){
      File file = filechooser.getSelectedFile();

      textarea.setText("");

      try{
        if (checkBeforeReadfile(file)){
          BufferedReader br 
            = new BufferedReader(new FileReader(file));

          String str;
          while((str = br.readLine()) != null){
            textarea.append(str);
            textarea.append("¥n");
          }

          br.close();
        }else{
          System.out.println("ファイルが見つからないか開けません");
        }
      }catch(FileNotFoundException err){
        System.out.println(err);
      }catch(IOException err){
        System.out.println(err);
      }
    }
  }
   
