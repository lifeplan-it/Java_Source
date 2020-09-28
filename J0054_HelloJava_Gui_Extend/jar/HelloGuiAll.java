//HelloGuiAll.java
import java.awt.*;
import java.awt.event.*;

class HelloGuiAll {
  public static void main(String[] args) {
        HelloGui sm = new HelloGui();
  }
}

class HelloGui extends Frame {

   private Label lb;

   public HelloGui()  {
      super("ƒTƒ“ƒvƒ‹");

      addWindowListener(new GuiWindowListener());
	setBounds(200, 200, 100, 80);
	setSize(480, 240);
	setVisible(true);

      lb = new Label("Hello JAVA");
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

