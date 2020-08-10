// Awt_Frame_Method.java
// awt クラスライブラリをインポートします。
import java.awt.* ;

// メインクラスを作成します。
public class Awt_Frame_Method {
  // メインメソッドを作成します。
  public static void main (String [] arge) {
	// オブジェクトを作るメソッドを呼び出します。
	mainFrame ();
  }

  // オブジェクトを作るメソッドを作ります。
  public static void mainFrame(){
	// awt ライブラリの中のFrameクラスをオブジェクト化します。
	Frame f = new Frame( "mainFrame" ) ;
	// Frame の表示位置を指定します。
	f.setBounds( 200, 200, 480, 240);
	// Frame の幅と高さを決めます。
	f.setSize ( 480, 240 ) ;
	// Frame を表示する設定をONにします。
	f.setVisible ( true ) ;
  }
}








