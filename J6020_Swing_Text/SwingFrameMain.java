//SwingFrameMain.java

import java.awt.*;
import javax.swing.*;

class SwingFrame extends JFrame {
  SwingFrame() {
	getContentPane().setLayout(new FlowLayout());

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	setBounds(300, 400, 100, 80);
	setTitle("JFrameTest");
	setSize(320, 180);
	setVisible(true);

  }
}

class SwingFrameMain {
  public static void main(String [] args) {
	new SwingFrame();
  }
}
