// awtFrame_Label_Panel.java
// Frame の表示
// https://www.javadrive.jp/tutorial/nulllayout/index1.html
//

// awt ライブラリのインポート
import java.awt.*;
import java.awt.event.*;

// Frame_Events　クラスを作成
public class awtFrame_Frame001 extends Frame {

   awtFrame_Frame001() {

	super("サンプル");
	Panel p = new Panel();
	setLayout(null);

	//setTitle("My Window Application");
	//setBackground(Color.cyan);
	//setBounds(200, 200, 100, 80);

	Label lb = new Label("ようこそ。");

	lb.setForeground(Color.BLUE);
	lb.setFont(new Font("Serif", Font.BOLD, 24));
	lb.setBounds(100, 100, 80, 30);
	add(lb);

	//TextField t1 = new TextField("Hello World!!");
	//TextField t1 = new TextField("Hello World!!");
	//t1.setBounds(100, 100, 80, 30);
	//add(t1)

	setSize(480, 240);
	setVisible(true);

	addWindowListener(new GuiWindowListener());

    }


}

class GuiWindowListener extends WindowAdapter  {
   public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
}

//メインクラス
public class awtFrame_Label_Panel {
    public static void main(String [] args) {
	//awtライブラリのFrameをオブジェクト化
        awtFrame_Frame001 af = new awtFrame_Frame001();

    }
}

