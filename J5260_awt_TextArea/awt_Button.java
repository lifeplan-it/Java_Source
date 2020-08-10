//awt_Button.java

import java.awt.*;
import java.awt.event.*;

class awt_Button {
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

       Button b1 = new Button("OK");
        add(b1);
        show();
  
   }

   ButtonTest() {
        super("ButtonTest");
        setSize(200, 100);
        setLayout(new FlowLayout());
        Button b1 = new Button("OK");
        add(b1);
        show();
   	 }
   }

   class GuiWindowListener extends WindowAdapter  {
      public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
   }
}
