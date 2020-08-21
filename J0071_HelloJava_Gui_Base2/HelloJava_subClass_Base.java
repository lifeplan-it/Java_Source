// HelloJava_subClass_Base.java
// 概要
// 　　Frameに文字を出力するプログラム
// 　　HelloJava_Class_Main より呼び出しされています。
// 　　（単独では動きません）
// 目的
//      親のクラスでオブジェクト化されるクラスの作成を学びます。
//      クラスの拡張のイメージを学びます。

import java.awt.*;		// GUI用ライブラリの利用の定義
import java.awt.event.*;	// GUI用イベントライブラリの定義

public class HelloJava_subClass_Base extends Frame {	// クラスの定義
						// Frameクラスを継承している。
  private Label lb;					// インスタンス変数の定義
  public void HelloJava_subClass_Base ( )  {		// コンストラクタの定義
	// this.super　( "Hello JAVA" ) ;			// このクラスでは何もしない
  }

  public void HelloJava_subClass_method (String str )  {	// メインクラスから呼び出されるクラス定義
    this.setTitle ( "Hello JAVA" );			// タイトル定義
    addWindowListener(new GuiWindowListener());		// イベントリスナの定義

    this.setBounds(200, 200, 100, 80);			// Frameのサイズの定義
    this.setSize(480, 240);				// Frameのサイズの定義
    this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // レイアウトマネージャーの定義
    this.setVisible(true);				// 表示の指定

    lb = new Label( str );				// ラベルの定義（引数　str ）を使用
    lb.setForeground(Color.BLUE);			// 文字の色
    lb.setFont(new Font("Serif", Font.BOLD, 24));		// 表示Fontの設定

    this.add(lb);					// FrameにLabelを追加
  }

   class GuiWindowListener extends WindowAdapter  {	// イベントの処理
      public void windowClosing(WindowEvent e) {		// Close イベントの取得
         System.exit(0);					// 終了
      }
   }
}
