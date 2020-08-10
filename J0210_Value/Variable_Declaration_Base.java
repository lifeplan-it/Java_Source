
// Java 変数宣言
// 　型	変数名  ; 
// 変数初期化
// 　型	変数名 = 値 ;

// boolean	true or false
// char	16Bit Unicode文字	\u0000～\uFFFF
// byte	  8Bit整数	-128～127
// byte	16Bit整数	-32768～32767
// int	32Bit整数	-2147483648～2147483647
// long	64Bit整数	-9223372036854775808～9223372036854775807
// float	32Bit単精度浮動小数点数
// double	64Bit倍精度浮動小数点数
// 変数var1の内容：111
// 変数var2の内容：111
// 変数Var_d1の内容：123.45
// 変数Var_d2の内容：456.7
// 変数str1の内容：文字列１
// 変数str2の内容：文字列2
// 変数Cha1の内容：a
// 変数Cha2の内容：b
// https://ja.wikipedia.org/wiki/Unicode%E4%B8%80%E8%A6%A7_0000-0FFF

// Variable_Declaration_Base.java
class Variable_Declaration_Base {
    public static void main(String[] args) {

	Variable_Declaration_Int ();
	Variable_Declaration_Double();
	Variable_Declaration_String();
	Variable_Declaration_Char ();
  }

   public static void Variable_Declaration_Int () {
	// 整数の変数宣言
	int	Var1  ; 
 	Var1 = 111 ;
	System.out.print("変数var1の内容："  );
	System.out.println( Var1 );

	int	Var2 = 111 ;
	System.out.print("変数var2の内容："  );
	System.out.println( Var2 );
   }

   public static void Variable_Declaration_String () {
	// 文字列の変数宣言
	String	Str1 ;
	Str1 = "文字列１" ;

	System.out.print   ( "変数str1の内容："  );
	System.out.println( Str1 );

	String	Str2 = "文字列2" ;
	System.out.print   ( "変数str2の内容："  );
	System.out.println( Str2 );
   }

   public static void Variable_Declaration_Double () {
	//文字列の変数宣言
	double	Var_d1  ;
	Var_d1  = 123.45 ;

	System.out.print   ( "変数Var_d1の内容："  );
	System.out.println( Var_d1 );

	double	Var_d2  = 456.7 ;
	System.out.print   ( "変数Var_d2の内容："  );
	System.out.println( Var_d2   );
   }

   public static void Variable_Declaration_Char () {
	// Charの変数宣言
	char	Cha1  ; 
 	Cha1 = '\u0061';	
	System.out.print("変数Cha1の内容："  );
	System.out.println( Cha1 );

	char	Cha2 = 0x0062 ;	
	System.out.print("変数Cha2の内容："  );
	System.out.println( Cha2 );
   }
}
