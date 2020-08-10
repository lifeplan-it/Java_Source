// Swing_Botton_Base1.java

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

class Swing_Botton_Base1 extends JFrame{
  public static void main(String args[]){
 
  }

  Swing_Botton_Base1  (String title){
    JButton btn = new JButton("MyButton");

    Container contentPane = getContentPane();
    contentPane.add(btn, BorderLayout.CENTER);
  }
}