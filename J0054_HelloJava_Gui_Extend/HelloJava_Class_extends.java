// HelloJava_Class_extends.java

import java.awt.*;
import java.awt.event.*;

//　メインクラス
class HelloJava_Class_extends {
  public static void main(String[] args) {
        // クラス      HelloGui　をオブジェクト化
        HelloJava_class obj = new HelloJava_class();
  }
}

// サブクラス　　HelloGui
// スーパークラス　Frame　クラスを拡張しています。
class HelloJava_class extends Frame {
   // コンストラクタ
   public HelloJava_class()  {

        // タイトルを表示
        this.setTitle("Frame Demo");

        // 位置とサイズの属性を設定
        this.setBounds(200, 200, 480, 240);

        // 表示/非表示　を表示に設定
        this.setVisible(true);

        // Label メソッドをオブジェクト化
        //  表示文字を"Hello JAVA"に設定
        Label  lb = new Label("Hello JAVA");

        // Label オブジェクトをFrameに追加
        add(lb);

        // マウスイベントを追加
        addWindowListener(new GuiWindowListener());
   }

   // Windows アダプタ
   class GuiWindowListener extends WindowAdapter  {
      // マウスイベント　Windows の閉じるボタンが押された時の処理
      public void windowClosing(WindowEvent e) {
         // 終了
         System.exit(0);
      }
   }
}

