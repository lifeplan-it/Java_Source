// Java 戻り値(return value)
// 戻り値(return value)を使ってメソッドから値を受け取る事がでます。
// 戻り値のあるメソッドは（型）を定義します。
// 戻り値のないメソッドは（void）を定義します。
// 戻り値の型とメソッド宣言の型は一致している必要があります。

// Method_Return_Variable.java
class Method_Return_Variable {
   public static void main(String[] args) {
	String	In_Str = "Null" ; 	// メソッドに渡す引数初期化
	int	In_Var = 000  ;	// メソッドに渡す引数初期化

	String Out_Str  = Variable_String( In_Str );
	int Out_Var = Variable_Int( In_Var );

	System.out.println("変数 Out_Str の内容：" + Out_Str );	
	System.out.println("変数 Out_Var の内容：" + Out_Var );
   }

   public static String Variable_String ( String s ) {
	s = "戻り値" ;		//ローカル変数の初期化
	return s ;			//戻り値の設定
   }

   public static int Variable_Int ( int i ) {
	i = 9999 ;			//ローカル変数の初期化
	return i ;			//戻り値の設定
   }
}
