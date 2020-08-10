// Output_print_Base.java

class Output_print_Base  {
  public static void main(String[] args)  {
	Output_Print_String ();
	Output_Print_Str () ;
	Output_Print_Add () ;
	Output_Print_Esc () ;
	Output_Print_Tab ();
   }

   private static void Output_Print_String () {
	// リテラルの出力
      	System.out.println("ようこそJavaへ!");
   }

    private static void Output_Print_Str () {
	// 改行しないで出力する
	System.out.print("printは");
	System.out.print("改行");
	System.out.print("しない");
	System.out.println("");
    }

    private static void Output_Print_Add () {
	// リテラルの結合
	System.out.println("文字を" + "+" + "で" + "連結する");
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