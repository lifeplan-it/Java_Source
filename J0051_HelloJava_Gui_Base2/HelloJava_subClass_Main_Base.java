// HelloJava_subClass_Main_Base.java
// 概要
//      HelloJava_subClass_Baseで作成したサブクラスを使用する
// 目的
//      クラスファイルが流用かできる事の確認をする。
// 　　クラスに対して引数（str ）でデータを渡せる事を確認する。
 
import java.awt.*;		// GUI用ライブラリの定義
import java.awt.event.*;	// GUI用イベントライブラリの定義

class HelloJava_subClass_Main_Base  {	// メインクラス
  public static void main(String[] args) {		// メインメソッド
        HelloJava_subClass_Base obj = new HelloJava_subClass_Base(); // クラスのオブジェクト化        
        String str = "Hello JAVA!!" ;		// 引数の初期化
        obj.HelloJava_subClass_method( str ) ;	//  オブジェクト化したクラスの実行
  }
}
