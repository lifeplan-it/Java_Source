// Class_Encapsulation_Private.java
class Class_Encapsulation_Base  {
   public static void main(String[] args)   {
 　  Private_out_print Obj1 
	= new Private_out_print();

	// エラーになる	
	// Obj1.Local_str = “Hello”;
	// Obj1.Local_out_print ( );

	Obj1.Public_str = "Public変数の値" ;
	
	String str = "引数の値" ;
	Obj1.Standard_out_print( str );
   }
}

// Private_out_print.java
class Private_out_print {
	// ローカル変数
	private String Local_str;

	// メンバ変数
  public  String Public_str;

  public void Standard_out_print( String s ) {
	System.out.println( "引数 s ：" + s );
	Local_str = s ; // 引数をローカル変数に渡す
	Local_out_print( ) ;  // ローカルで呼び出し可能
  }

  private void Local_out_print( ) {
	System.out.println( "private str ：" + Local_str );
	System.out.println( "public  str ：" + Public_str );
  }
}