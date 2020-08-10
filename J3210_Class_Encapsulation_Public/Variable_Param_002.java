//Variable_Param_002.java
//引数の使い方

// メソッド名：Variable_Param_002
class Variable_Param_002 {

   // メインメソッド
   public static void main(String[] args) {

	//変数の宣言
	String	Str ;
	int	Var ;

	//変数への代入
	Str = "ようこそJavaへ!" ;

	// メソッド（Variable_String）を呼び出し
	Variable_String(Str);

	//変数への代入
	Var = 111 ;

	// メソッド（Variable_Int）を呼び出し
	Variable_Int(Var);

	//変数への代入
	Str = "終了" ;

	// メソッド（Variable_String）を呼び出し
	Variable_String(Str);


   }

   // メソッド名：Variable_String
   public static void Variable_String (String s) {

	System.out.println("変数 s の内容：" + s );

   }

   // メソッド名：Variable_Int
   public static void Variable_Int (int i) {

	System.out.println("整数 i の内容：" + i );

   }

}
