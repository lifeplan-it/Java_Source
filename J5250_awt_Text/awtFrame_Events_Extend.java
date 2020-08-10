// awtFrame_Events_Extend.java
// Frame の表示
// https://docs.oracle.com/javase/jp/8/docs/api/java/awt/Window.html
// public void setBounds(int x,int y,int width,int height)
// 	このコンポーネントを移動し、サイズ変更します。
// 	左上隅の新しい位置はxとyによって指定され
//	新しいサイズはwidthとheightによって指定されます。
// setSize(int width, int height)
//	幅がwidthで、高さがheightになるように
//	このコンポーネントのサイズを変更します。
// setVisible(boolean b)
//	パラメータbの値に応じて
//	このWindowを表示または非表示にします。
//
// 終了は　Ctrl + c
//

// awt ライブラリのインポート
import java.awt.*;
import java.awt.event.*;

// Frame_Events　クラスを作成
class awtFrame_Frame001 extends Frame {

   awtFrame_Frame001() {
	// awtのFramをオブジェクト化
	// Frame f1 = new Frame();

	//Frame001の初期値の定義
	setBounds(200, 200, 100, 80);
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
public class awtFrame_Events_Extend {
    public static void main(String [] args) {
	//awtライブラリのFrameをオブジェクト化
        awtFrame_Frame001 af = new awtFrame_Frame001();

	af.setBackground(Color.cyan);
	af.setBounds(200, 500, 100, 80);
	af.setSize(480, 240);
	af.setVisible(true);

    }
}

