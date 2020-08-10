// HelloJava_Method_Base.java
// 概要
// 　　文字列を出力するメソッドを作成する事例です。
// 　　メソッドによって処理を整理しています
// 目的
// 　　プログラミングの初心者が構造化・モジュール化の
// 　　概要をイメージする為のサンプルです。
//       後に、Class メンバを理解する基礎です。

// HelloJava_Method_Base.java
// メインクラス
class HelloJava_Method_Base {
  // メインメソッド
  public static void main(String[] args) {
      HelloJava_Method_Str () ;			
      HelloJava_Method_Int  () ;
  }
  // メソッド名　HelloJava_Method_Str 
  private static void HelloJava_Method_Str  () {
	// 処理：文字の出力
	System.out.println(“HelloJAVA”);
   }
  //メソッド名　HelloJava_Method_Int
  public static void HelloJava_Method_Int  () {
	// 処理：数値の出力
	System.out.println( 111 );
  }
}

