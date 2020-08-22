// Class_Encapsulation_Base.java
class Class_Encapsulation_Base  {
   public static void main(String[] args)   {
 	Private_out_print Obj1 = new Private_out_print();
  	// Obj1.Local_str = "Hello" ;　ローカル変数にはアクセスできない
	Obj1.Public_str = "Public変数の値" ;

	String str = "引数の値" ;
	Obj1.Standard_out_print( str );
	Obj1.Local_out_print ( );
   }
}

// Private_out_print.java
class Private_out_print {
    private String Local_str;	// ローカル変数
    public   String Public_str;	// メンバ変数
    public void Standard_out_print( String s ) {
	System.out.println( "引数 s ：" + s );
	Local_str = s ; 	// 引数をローカル変数に渡す
    }
    public void Local_out_print( ) {
         	System.out.println( "private str ：" + Local_str );
	System.out.println( "public  str ：" + Public_str );
    }

}

