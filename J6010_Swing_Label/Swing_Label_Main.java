// Swing_Label_Main.java

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;

class Swing_Label_Main extends JFrame{
  public static void main(String args[]){
    Swing_Label_Main frame = new Swing_Label_Main("タイトル");
    frame.setVisible(true);
  }

  Swing_Label_Main (String title){
    setTitle(title);
    setBounds(100, 100, 480, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    p.setLayout(null);

    JLabel label1 = new JLabel("ラベル出力");
    label1.setPreferredSize(new Dimension(130,80));
    label1.setBorder(new LineBorder(Color.blue, 2, true));
    label1.setBounds(30, 30, 250, 30);
    p.add(label1);

    Container contentPane = getContentPane();
    contentPane.add(p );
  }
}