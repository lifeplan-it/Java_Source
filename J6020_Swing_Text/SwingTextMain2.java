//SwingTextMain2.java

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.BorderLayout;

class SwingTextMain2 {
  public static void main(String args[]){
    new SwingText();
  }
}

class SwingText extends JFrame{
  SwingText frame = new SwingText("タイトル");
  frame.setVisible(true);

  SwingText (String title){
    setTitle(title);
    setBounds(200, 200, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextField text1 = new JTextField("東京都千代田区神田", 20);
    text1.setHorizontalAlignment(JTextField.LEFT);

    JTextField text2 = new JTextField("東京都千代田区神田", 20);
    text2.setHorizontalAlignment(JTextField.CENTER);

    JTextField text3 = new JTextField("東京都千代田区神田", 20);
    text3.setHorizontalAlignment(JTextField.RIGHT);

    p.add(text1);
    p.add(text2);
    p.add(text3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}