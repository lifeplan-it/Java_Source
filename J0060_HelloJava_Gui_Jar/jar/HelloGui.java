// FileName : HelloJava_Class.java
// WindowsにFrameを表示するサンプルプログラム
// HelloGuiMain.java より呼び出しされています。
// （単独では動きません）

import java.awt.*;
import java.awt.event.*;

public class HelloJava_Class extends Frame {
　// Label クラスを格納する変数
   private Label lb;

　// 
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
