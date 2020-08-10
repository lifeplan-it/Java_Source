// FileName : HelloJava_Class.java
// Windows��Frame��\������T���v���v���O����
// HelloGuiMain.java ���Ăяo������Ă��܂��B
// �i�P�Ƃł͓����܂���j

import java.awt.*;
import java.awt.event.*;

public class HelloJava_Class extends Frame {
�@// Label �N���X���i�[����ϐ�
   private Label lb;

�@// 
   public HelloJava_Class(String str )  {
      super("Hello JAVA");
      addWindowListener(new GuiWindowListener());
	setBounds(200, 200, 100, 80);
	setSize(480, 240);
	setVisible(true);

      lb = new Label( str );
      add(lb);
      setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      lb.setForeground(Color.BLUE);
      lb.setFont(new Font("Serif", Font.BOLD, 24));
   }

   class GuiWindowListener extends WindowAdapter  {
      public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
   }
}
