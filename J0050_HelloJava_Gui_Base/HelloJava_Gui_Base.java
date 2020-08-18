// HelloJava_Gui_Base.java
// 概要
// 　　Frameに文字を出力するプログラム

// GUI用ライブラリの利用の定義
import java.awt.*;
// GUI用イベントライブラリの定義
import java.awt.event.*;

// メインクラス
class HelloJava_Gui_Base
{
  // メインメソッド
  public static void main(String[] args)
  {
	HelloJava_Gui_Method () ;
  }

  // 処理メソッド
  public static void HelloJava_Gui_Method ()
  {
      // クラスのオブジェクト化        
      HelloJava_Gui_subClass obj = new HelloJava_Gui_subClass ();
      // 引数の初期化
      String str = "Hello JAVA!!" ;
      //  オブジェクト化したメソッドの実行
      obj.HelloJava_Gui_subClass_method ( str ) ;
  }
}

// ライブラリのクラスを使ったサブクラスの作成
// HelloJava_Gui_subClass.java
// クラスの定義
// Frameクラスを継承している。
class HelloJava_Gui_subClass extends Frame
{
  // インスタンス変数の定義
  private Label lb;
  // コンストラクタの定義
  public void HelloJava_Gui_subClass ( )
  {
     // このクラスでは何もしない
     // this.super　( "Hello JAVA" ) ;
  }

 // メインクラスから呼び出されるメソッド
  public void HelloJava_Gui_subClass_method (String str )
  {
      setTitle ( "Hello JAVA" );			// タイトル定義
      setBounds(200, 200, 100, 80);		// Frameのサイズの定義
      setSize(480, 240);			// Frameのサイズの定義
      setLayout(null) ; 				// レイアウトマネージャーの定義
      setVisible(true);				// 表示の指定

      lb = new Label( str );			// ラベルの定義（引数　str ）を使用
      lb.setBounds(10, 40, 250,  20);		// ラベルの位置定義
      lb.setForeground(Color.BLUE);		// 文字の色
      lb.setFont(new Font("Serif", Font.BOLD, 24));	// 表示Fontの設定

      add(lb);				// FrameにLabelを追加
      addWindowListener(new GuiWindowListener());	// イベントリスナの定義
  }

   // イベントの処理
   class GuiWindowListener extends WindowAdapter
   {
      // Close イベントの取得
      public void windowClosing(WindowEvent e)
      {
         System.exit(0);				// 終了
      }
   }
}
