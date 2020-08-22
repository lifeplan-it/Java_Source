// Awt_application_frame.java
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

// SubFrame001　クラスを作成
class SubFrame001 extends Frame {
   // Frame001のコンストラクタ(初期値)
   SubFrame001() {
	// Frame001の初期値の定義
	super("SubFrame001");
	//this.setTitle("SubFrame002");
	this.setBounds(200, 200, 100, 80);
	this.setSize(480, 240);
	this.setVisible(true);
    }
}

//メインクラス
public class Awt_Application_Frame {
    public static void main(String [] args) {
	//awtライブラリのFrameをオブジェクト化
        SubFrame001 af = new SubFrame001();
    }
}

