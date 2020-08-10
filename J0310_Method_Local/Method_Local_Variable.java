// Method_Local_Variable.java
// Loacl変数：メソッド内で定義される変数
class Method_Local_Variable {
    public static void main(String[] args) {
	Variable_Int_Print () ;	// メソッド呼び出し
	Variable_Str_Print ();	// メソッド呼び出し
  }

   public static void Variable_Int_Print () {
	int Var = 111  ;	// ローカル変数（整数）の変数初期化
	System.out.print( "変数varの内容："  );
	System.out.println( Var );
   }

   public static void Variable_Str_Print () {
	String	Str ;	// ローカル変数（文字列）の変数宣言
	Str = "メインメソッド終了" ;
	System.out.print   ( "変数strの内容："  );
	System.out.println( Str );
   }
}
