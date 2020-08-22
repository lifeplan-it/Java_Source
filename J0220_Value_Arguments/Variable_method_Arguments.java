// Java 引数（Arguments）
// 引数（Arguments）を使って値を引き渡すことができます。
// メソッドに定義する時の引数を仮引数(parameter)と言います。
// メソッドに値を渡す引数を実引数(Argument)と言います。

// Variable_method_Arguments.java
// 引数：メソッド間の値の受け渡しを行います。
class Variable_method_Arguments {
   public static void main(String[] args) {
	String	Str  = "HelloJAVA!" ; 
	int	Var = 111 ;		//変数への代入

	Variable_String( Str );		// メソッド呼び出し
	Variable_Int( Var );
   }

   public static void Variable_String ( String Str ) {
	System.out.println("変数 s の内容：" + Str );
   }

   public static void Variable_Int (int i) {
	System.out.println("整数 i の内容：" + i );
   }
}
