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
