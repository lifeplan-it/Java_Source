// Java static変数(Static Variable)
// static変数を使ってメソッド間で値を共有する事ができます。
// Static変数は、クラス宣言とメソッドの間で宣言をします。
// 修飾子にstaticを使用します。
// Static変数は、クラス内全てのメソッドからアクセスができます。
// Method_Static_Variable.java
class Method_Static_Variable {
    public  static  String  Str  ;	// static 変数宣言
    public  static  int        Var ;	// static 変数宣言
    public static void main(String[] args) {
	Variable_Init ();	 	// 変数を初期化する。
	Variable_Int_Print () ;	// 整数を出力する。
	Variable_Str_Print ();	// 文字列を出力する。
    }
    public static void Variable_Init () {
	Str  = "文字列" ;	// Static変数を初期化
	Var = 999 ;	// Static変数を初期化
    }

    public static void Variable_Int_Print () {
	System.out.print( "変数varの内容："  );
	System.out.println( Var );
    }

    public static void Variable_Str_Print () {
	System.out.print   ( "変数strの内容："  );
	System.out.println( Str );
    }
}
