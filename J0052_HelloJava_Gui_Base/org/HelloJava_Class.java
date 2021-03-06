// FileName : HelloJava_subClass.java
// WindowsにFrameを表示するサンプルプログラム
// HelloJava_Class_Main より呼び出しされています。
// （単独では動きません）

import java.awt.*;
import java.awt.event.*;

//  クラス定義
// クラス名：  HelloJava_subClass
public class HelloJava_Class extends Frame {
  // Label クラスを格納する変数
  private Label lb;

  // HelloJava_Class_Main から呼び出されるメソッド
  // メソッド名： HelloJava_subClass_method

  public void HelloJava_Class ( )  {
	// コンストラクタ
	// this.super　( "Hello JAVA" ) ;
  }

  public void HelloJava_Class_method (String str )  {
    this.setTitle ( "Hello JAVA" );
    // マウスクリックされた時のイベント
    addWindowListener(new GuiWindowListener());

    //Frameのタイトルを初期化
    this.setTitle ( "Hello JAVA" );
    //Frameを表示する位置の設定
     this.setBounds(200, 200, 100, 80);
    //Frameのサイズ
     this.setSize(480, 240);
    //FrameのレイアウトをCENTERに設定
     this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    //Frameを表示
     this.setVisible(true);

    // Label をインスタンス化
    lb = new Label( str );

    // 文字の色を設定
    lb.setForeground(Color.BLUE);
    // 文字のフォントを設定
    lb.setFont(new Font("Serif", Font.BOLD, 24));

    // Label オブジェクトをFrame に追加
    this.add(lb);
 
   // 文字の色を設定
   lb.setForeground(Color.BLUE);
   // 文字のフォントを設定
   lb.setFont(new Font("Serif", Font.BOLD, 24));
   }

   class GuiWindowListener extends WindowAdapter  {
      // Windowsの閉じるボタンを押した時のイベント
      public void windowClosing(WindowEvent e) {
         // 終了
         System.exit(0);
      }
   }
}
