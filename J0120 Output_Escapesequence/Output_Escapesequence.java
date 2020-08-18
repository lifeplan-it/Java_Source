// Output_Escapesequence.java
// エスケープシーケンス
// ¥b	バックスペース
// ¥t	水平タブ
// ¥n	改行
// ¥r	復帰
// ¥f	改ページ
// ¥'	シングルクオーテーション
// ¥"	ダブルクオーテーション
// ¥¥	¥文字
// ¥ooo	8進数の文字コードが表す文字
// ¥uhhhh	16進数の文字コードが表す文字

class Output_Escapesequence
{
  public static void main(String[] args)  {
	// リテラルの出力
	Output_Print_Literal ();
	Output_Print_Add () ;
	Output_Print_Esc () ;
	Output_Print_Str () ;
	Output_Print_Esc () ;
	Output_Print_Tab ();
   }

   private static void Output_Print_Literal ()   {
	// リテラルの出力
      	System.out.println("ようこそJavaへ!");
   }

   private static void Output_Print_AddStr () {
	// リテラルの結合
	System.out.println("文字を" + "+" + "で" + "連結する");
    }
 
   private static void Output_Print_NoLf () {
	// 改行しないで出力する
	System.out.print("printは");
	System.out.print("改行");
	System.out.print("しない");
	System.out.println("");
    }

    private static void Output_Print_Esc () {
	// 改行文字（\n）
	System.out.println("行を\n強制的に\n改行");
    }

    private static void Output_Print_Tab () {
	// TAB字（\t）
	System.out.print("TAB\t");
	System.out.print("で\t");
	System.out.print("間隔を\t");
	System.out.print("空ける\t");
	System.out.println("");
    }

}