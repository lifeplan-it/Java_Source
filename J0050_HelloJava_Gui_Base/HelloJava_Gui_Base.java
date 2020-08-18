// HelloJava_Gui_Main.java
// 概要
// 　　Frameに文字を出力するプログラム

// メインクラス
class HelloJava_Gui_Main
{
  // メインメソッド
  public static void main(String[] args)
  {
     // メソッド            
     HelloJava_Gui_Method () ;
  }

  // メソッド
  public static void HelloJava_Gui_Method ()
  {
      // クラスのインスタンス化        
      HelloJava_Gui_subClass obj = new HelloJava_Gui_subClass ();
      // 引数の初期化
      String str = "Hello JAVA!!" ;
      //  オブジェクト化したメソッドの実行
      obj.HelloJava_Gui_subClass_method ( str ) ;
  }
}
// GUI用ライブラリの利用の定義
import java.awt.*;
// GUI用イベントライブラリの定義
import java.awt.event.*;

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
    // タイトル定義
    setTitle ( "Hello JAVA" );
    // Frameのサイズの定義
    setBounds(200, 200, 100, 80);
    // Frameのサイズの定義
    setSize(480, 240);
    // レイアウトマネージャーの定義
    setLayout(null) ; 
    // 表示の指定
    setVisible(true);

    // ラベルの定義（引数　str ）を使用
    lb = new Label( str );
    // ラベルの位置定義
    lb.setBounds(10, 40, 250,  20);
    // 文字の色
    lb.setForeground(Color.BLUE);
    // 表示Fontの設定
    lb.setFont(new Font("Serif", Font.BOLD, 24));

    // FrameにLabelを追加
    add(lb);
    // イベントリスナの定義
    addWindowListener(new GuiWindowListener());
  }

   // イベントの処理
   class GuiWindowListener extends WindowAdapter
   {
      // Close イベントの取得
      public void windowClosing(WindowEvent e)
      {
         // 終了
         System.exit(0);
      }
   }
}

