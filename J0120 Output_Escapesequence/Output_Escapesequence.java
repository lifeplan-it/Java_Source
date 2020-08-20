/*
# Java エスケープシーケンス出力
# 解説
 英数以外の文字を出力したい時に使用します。

# 主なエスケープシーケンス
|記述|略号|内容|
|:----:|:---|:-----:|
| \b | BS |  バックスペース(Back Space) |
| \t | TAB |	水平タブ(TAB) |
| \n | LF  | 改行(Line Feed) |
| \r | CR  | 文頭に戻す(Carriage Return) |
| \f | CLS | 改ページ(Page Feed) |
| \' | '   | シングルクオーテーション(Single Quotation) |
| \" | "   | ダブルクオーテーション(Double Quotation) |
| \\ | \   | バックスラッシュ(Back Slash) |

# ソースファイル
  Output_Escapesequence.java
# クラス
　Output_Escapesequence　　
# メソッド
## 改行（\n）を出力するメソッド
      void Output_LF ()
## TAB（\t）を出力するメソッド
      void Output_TAB ()
## '（\'）を出力するメソッド
      void Output_SQuotation ()
## "（\"）を出力するメソッド
      void Output_WQuotation ()
## \ \\ を出力するメソッド
      void Output_BackSlash ()
*/

class Output_Escapesequence {
  public static void main(String[] args)  {
      // 改行（\n）を出力するメソッド
      Output_LF () ;
      // TAB（\t）を出力するメソッド
      Output_TAB ();
      // '（\'）を出力するメソッド
      Output_SQuotation () ;
      // "（\"）を出力するメソッド
      Output_WQuotation () ;
      // \ \\ を出力するメソッド
      Output_BackSlash () ;
  }

  // 改行（\n）を出力するメソッド
  private static void Output_LF () {
    System.out.println("");
    System.out.println("行を強制的に改行する");
    System.out.println("行を\n強制的に\n改行する");
  }

  // TAB（\t）を出力するメソッド
  private static void Output_TAB () {
    System.out.println("");
    System.out.println("TABで間隔を空ける");
    System.out.println("TAB \t で \t間隔を\t 空ける\t");
  }

  // '（\'）を出力するメソッド
  private static void Output_SQuotation () {
    System.out.println("");
    System.out.println("シングルコーテションで「文字」を囲む");
    System.out.println("シングルコーテションで\'文字\'を囲む");
  }

  // "（\"）を出力するメソッド
  private static void Output_WQuotation () {
    System.out.println("");
    System.out.println("ダブルコーテションで「文字」を囲む");
    System.out.println("ダブルコーテションで\"文字\"を囲む");
  }

 // \ \\ を出力するメソッド
  private static void Output_BackSlash () {
    System.out.println("");
    System.out.println("バックスラッシュを出力する");
    System.out.println("バックスラッシュ（\\） を出力する");
  }
}
