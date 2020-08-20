/*
# Java 標準出力
# 解説
　標準出力とは、そのシステムで決めてる出力装置です。
  パソコンでは、コンソールを標準にしています。

# 基本構文
   標準出力（改行付き）
   System.out.println ;

   標準出力（改行無し）
   System.out.print ;

# サンプルプログラム
## ソースファイル
  Output_print_Base.java
## クラス
  Output_print_Base
### 数　値のリテラル出力をするメソッド
    void Output_Numerical ()
### 文字列のリテラル出力をするメソッド
    void Output_String_lf ()
### 改行しないで文字列のリテラルの出力をするメソッド
    void Output_String
### 文字列のリテラルを結合して出力するメソッド
    void Output_Add
*/

// メインクラス
class Output_print {
  // メインメソッド
  public static void main(String[] args)
  {
    // 数　値のリテラル出力をするメソッド
    Output_Numerical();
    // 文字列のリテラル出力をするメソッド
    Output_String_lf ();
    // 改行しないで文字列のリテラル出力をするメソッド
    Output_String ();
    // 文字列のリテラルを結合して出力するメソッド
    Output_Add () ;
  }

  // 数　値のリテラル出力をするメソッド
  private static void Output_Numerical ()
  {
    System.out.println("");
    System.out.println("数値を出力を出力するメソッド");

    System.out.println( 123 );
  }

  // 文字列のリテラル出力をするメソッド
  private static void Output_String_lf ()
  {
    System.out.println("");
    System.out.println("文字列のリテラル出力をするメソッド");

    System.out.println("ようこそ");
    System.out.println("Javaへ!");
  }

  // 改行しないで文字列のリテラル出力をするメソッド
  private static void Output_String ()
  {
    System.out.println("");
    System.out.println("改行しないで文字列のリテラル出力をするメソッド");

    System.out.print("printは");
	  System.out.print("改行");
	  System.out.print("しない");
	  System.out.println("");
  }

  // 文字列のリテラルを結合して出力するメソッド
  private static void Output_Add ()
  {
    System.out.println("");
    System.out.println("文字列を結合してリテラル出力をするメソッド");

	  System.out.println("文字を" + "+" + "で" + "連結する");
  }
}
