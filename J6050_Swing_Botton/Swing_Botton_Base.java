// Swing_Botton_Base.java

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

class Sample extends JFrame{
  public static void main(String args[]){

  }

  Sample(String title){
    JButton btn = new JButton("MyButton");

    Container contentPane = getContentPane();
    contentPane.add(btn, BorderLayout.CENTER);
  }
}