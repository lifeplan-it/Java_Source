// HelloJava_Gui_Main.java
// 概要
// 　　Frameに文字を出力するプログラム

import java.awt.*;		// GUI用ライブラリの利用の定義
import java.awt.event.*;	// GUI用イベントライブラリの定義

class HelloJava_Gui_Main  {	// メインクラス
  public static void main(String[] args) {			// メインメソッド
	HelloJava_Gui_Method () ;
  }
  public static void HelloJava_Gui_Method () {		// GUI用メソッド
  	HelloJava_Gui_subClass obj 
	     = new HelloJava_Gui_subClass ();		// クラスのオブジェクト化        

	String str = "Hello JAVA!!" ;			// 引数の初期化
	obj.HelloJava_Gui_subClass_method ( str ) ;	//  オブジェクト化したクラスの実行
  }
}
// HelloJava_Gui_subClass.java
class HelloJava_Gui_subClass extends Frame {		// クラスの定義
						// Frameクラスを継承している。
  private Label lb;					// インスタンス変数の定義
  public void HelloJava_Gui_subClass ( )  {		// コンストラクタの定義
	// this.super　( "Hello JAVA" ) ;			// このクラスでは何もしない
  }

  public void HelloJava_Gui_subClass_method (String str )  { // メインクラスから呼び出されるメソッド

	setTitle ( "Hello JAVA" );			// タイトル定義
	setBounds(200, 200, 100, 80);			// Frameのサイズの定義
	setSize(480, 240);				// Frameのサイズの定義
	setLayout(null) ; 				// レイアウトマネージャーの定義
	setVisible(true);				// 表示の指定

	lb = new Label( str );			// ラベルの定義（引数　str ）を使用
	lb.setBounds(10, 50, 250,  20);		// ラベルの位置定義
	lb.setForeground(Color.BLUE);		// 文字の色
	lb.setFont(new Font("Serif", Font.BOLD, 24));	// 表示Fontの設定

	add(lb);					// FrameにLabelを追加
	addWindowListener(new GuiWindowListener());	// イベントリスナの定義
  }

   class GuiWindowListener extends WindowAdapter  {	// イベントの処理
      public void windowClosing(WindowEvent e) {		// Close イベントの取得
         System.exit(0);					// 終了
      }
   }
}
