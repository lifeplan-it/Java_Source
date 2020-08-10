// Swing_Botton.java
import javax.swing.*;
import java.awt.BorderLayout;

public class NullLayoutTest1 extends JFrame{

  public static void main(String[] args){
    NullLayoutTest1 frame = new NullLayoutTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  NullLayoutTest1(){
    JPanel p = new JPanel();
    p.setLayout(null);

    JButton button1 = new JButton("Google");
    button1.setBounds(10, 10, 80, 30);

    JButton button2 = new JButton("Yahoo!");
    button2.setBounds(30, 30, 80, 30);

    JButton button3 = new JButton("MSN");
    button3.setBounds(50, 50, 80, 30);

    p.add(button1);
    p.add(button2);
    p.add(button3);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}
