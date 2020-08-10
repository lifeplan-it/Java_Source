// awtFrame_Text_Extend.java
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

        super("サンプル");
	
	//Frame001の初期値の定義
	//setTitle("My Window Application");
	//setBackground(Color.cyan);
	//setBounds(200, 200, 100, 80);
	//setSize(480, 240);
	//setVisible(true);

	TextField t1 = new TextField("Hello World!!",60);
	t1.setForeground(Color.BLUE);
	t1.setFont(new Font("Serif", Font.BOLD, 24));
	t1.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(t1);

	//TextField t2 = new TextField(" scond ",60);
        //add(t2);
	
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
public class awtFrame_Text_Extend {
    public static void main(String [] args) {
	//awtライブラリのFrameをオブジェクト化
        awtFrame_Frame001 af = new awtFrame_Frame001();

    }
}

