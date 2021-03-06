/*
# Java メソッド作成
　プログラミングの基礎勉強用のソースコードです。
    メソッドの使い方のサンプルです。
# 解説
## メソッドについて
  メソッドは、他のメソッドやメインメソッドから呼び出す事ができます。
  メソッドを呼び出すと、処理がメソッドに移り処理が終わると
  呼び出された次の行に移ります。

# 処理内容
  メインメソッドから、メソッド(HelloJava_Print)を呼び出しています。
  メソッド(HelloJava_Print)は、標準出力に文字を出力する処理を行います。
  メソッド(HelloJava_Print)の処理が終わると処理は呼び出されたメソッドに戻ります。

# ソースファイル
  HelloJava_Method.java

# メインクラス
　HelloJava_Method

# メソッド
##  HelloJava_Print()
    標準出力に文字列を出力
*/
// HelloJava_Method.java
// メインクラス
class HelloJava_Method {
    // メインメソッド
    public static void main(String[] args)
    {
        // 標準出力に文字列を出力
        HelloJava_Print () ;
    }
    // メソッド:HelloJava_Method
    public static void HelloJava_Print ()
    {
        // 処理：文字の出力
        System.out.println("HelloJAVA");
    }
}
