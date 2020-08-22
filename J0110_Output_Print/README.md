# Java 標準出力の方法
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
