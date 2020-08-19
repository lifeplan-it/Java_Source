//Java変数宣言
// 　型	変数名;
// 変数初期化
// 　型	変数名=値;
//
// boolean true or false
// char     16bit Unicode文字
// byte       8bit 整数
// byte     16bit 整数
// int        32bit 整数
// long     64bit 整数
// float     32bit 単精度浮動小数点数
// double 64bit 倍精度浮動小数点数
// 
// ###################################
//サンプルコード
// Variable_Declaration_Base.java
//
//メインクラス
//     Variable_Declaration_Base
//
// 文字列宣言のサンプルメソッド
//     void Variable_Declaration_String()
//
// 整数宣言のサンプルメソッド
//     void Variable_Declaration_Int ()
//
// 倍精度浮動小数点宣言のサンプルメソッド
//     void Variable_Declaration_Double()

// Variable_Declaration_Base.java
class Variable_Declaration_Base {
  public static void main(String[] args) {
    // 文字列宣言のサンプルメソッド
    Variable_Declaration_String();
    // 整数宣言のサンプルメソッド
    Variable_Declaration_Int ();
    // 倍精度浮動小数点宣言のサンプルメソッド
    Variable_Declaration_Double();
  }

  // 文字列の宣言　
  public static void Variable_Declaration_String () {
     String	Str1 ;

     Str1 = "文字列１" ;
     System.out.println( Str1 );

     String	Str2 = "文字列２" ;
     System.out.println( Str2 );
  }

  //整数の宣言
  public static void Variable_Declaration_Int () {
     int Var1  ;

     Var1 = 222 ;
     System.out.println( Var1 );

     int Var2 = 111 ;
     System.out.println( Var2 );
   }

  // double 64Bit倍精度浮動小数点数
  public static void Variable_Declaration_Double () {
     double	Var_d1  ;

     Var_d1  = 123.45 ;
     System.out.println( Var_d1 );

     double	Var_d2  = 456.7 ;
     System.out.println( Var_d2   );
  }
}
