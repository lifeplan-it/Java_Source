// FileName : HelloJava_Class_Main.java
// WindowsにFrameを表示するサンプルプログラム
// 既にコンパイルされたクラスをインスタンス化します。
// インスタンス化するクラス： HelloJava_Class 

import java.awt.*;
import java.awt.event.*;

// メインクラスの定義
class HelloJava_Class_Main {
// メインメソッドの定義
  public static void main(String[] args) {

     String str = "Hello JAVA!!" ;

     Frame Frame1 = new Frame() ; 
     Frame1.setTitle("Frame_method");
     Frame1.setBounds(100, 100, 320, 240 );

     Label Label1 = new Label( str );
     
     Frame1.add( Label1 );
     Frame1.setVisible(true);

   }
}