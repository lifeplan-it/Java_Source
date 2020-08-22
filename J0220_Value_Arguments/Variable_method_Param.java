// Variable_method_Param.java
// 引数：メソッド間の値の受け渡しを行います。
class Variable_method_Param {
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
