//awtFrameTestMain.java

import java.awt.*;
import java.awt.event.*;

class awtFrameTestMain {
  public static void main(String[] args) {
        Frame1 sm = new Frame1();
  }
}

class Frame1 extends Frame {
   
   private Label lb;

   public Frame1()  {
      super("ÉtÉåÅ[ÉÄ");

      addWindowListener(new GuiWindowListener());

	setBounds(200, 200, 100, 80);
	setSize(480, 240);
	setVisible(true);

        TextField t1 = new TextField("Hello World!!");
        add(t1);
  
   }

   class GuiWindowListener extends WindowAdapter  {
      public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
   }
}
