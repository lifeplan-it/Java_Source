// Java 配列変数の宣言
//
// 基本構文 
// 配列変数の宣言
// 型名[]	配列変数名;
// 配列変数名 = new 型名[要素数] ;
//
// 省略型
// 型名[]	配列変数名 = new 型名[要素数] ;
//
// リスト型
// 型名[]	配列変数名 = { 値１, 値２, 値３,・・・} ;
//
// Value_Array_Base.java
class Value_Array_Base {
  public static void main(String[] args)   {
	Value_Array_int ();
	Value_Array_String () ;
	Value_Array_List () ;
  }
 
  public static void Value_Array_int ()   {
	int Var1[] ;
	Var1 = new int [3] ;
	// int Var1[]  = new int [3] ;

	Var1[0] =  3 ;
	Var1[1] =  2 ;
	Var1[2] =  1 ;
	
	System.out.println( "配列の長さ：" + Var1.length );
	System.out.println( "配列0番目：" + Var1[0] );
	System.out.println( "配列1番目：" + Var1[1] );
	System.out.println( "配列2番目：" + Var1[2] );
  }
 
  public static void Value_Array_String ()   {
	String[] Line1 = new String[8];

	 Line1[0] = "   **   ";
	 Line1[1] = "  *  *  ";
	 Line1[2] = " *    * ";
	 Line1[3] = "********";
	 Line1[4] = "*      *";
	 Line1[5] = "*      *";
	 Line1[6] = "*      *";
	 Line1[7] = "*      *";
	System.out.println( "配列の長さ：" + Line1.length );
	System.out.println( Line1[0] );
	System.out.println( Line1[1] );
	System.out.println( Line1[2] );
	System.out.println( Line1[3] );
	System.out.println( Line1[4] );
	System.out.println( Line1[5] );
	System.out.println( Line1[6] );
	System.out.println( Line1[7] );
   }

  public static void Value_Array_List ()   {
	String[] Japn1 = { "北海道" , "本州" , "四国", "九州", "沖縄"  } ;
	System.out.println( "配列の長さ：" + Japn1.length );
	System.out.println( Japn1[0] );
	System.out.println( Japn1[1] );
	System.out.println( Japn1[2] );
	System.out.println( Japn1[3] );
	System.out.println( Japn1[4] );
   }
}
