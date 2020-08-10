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
    Swing_Label_Main frame = new Swing_Label_Main("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  Swing_Label_Main (String title){

    getContentPane().setLayout(null);
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JLabel label1 = new JLabel("DEFAULT");
    label1.setPreferredSize(new Dimension(130,80));
    label1.setBorder(new LineBorder(Color.blue, 2, true));

    p.add(label1);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}