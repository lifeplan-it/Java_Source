//Javaฯ้พ
// @^	ฯผ;
// ฯ๚ป
// @^	ฯผ=l;
//
// boolean true or false
// char     16bit Unicodeถ
// byte       8bit ฎ
// byte     16bit ฎ
// int        32bit ฎ
// long     64bit ฎ
// float     32bit Pธxฎฌ_
// double 64bit {ธxฎฌ_
//
// Variable_Declaration_Base.java
class Variable_Declaration_Base {
  public static void main(String[] args) {
    Variable_Declaration_String();
    Variable_Declaration_Int ();
    Variable_Declaration_Double();
  }

  // ถ๑ฬ้พ@
  public static void Variable_Declaration_String () {
     String	Str1 ;

     Str1 = "ถ๑P" ;
     System.out.println( Str1 );

     String	Str2 = "ถ๑Q" ;
     System.out.println( Str2 );
  }

  //ฎฬ้พ
  public static void Variable_Declaration_Int () {
     int Var1  ;

     Var1 = 222 ;
     System.out.println( Var1 );

     int Var2 = 111 ;
     System.out.println( Var2 );
   }

  // double 64Bit{ธxฎฌ_
  public static void Variable_Declaration_Double () {
     double	Var_d1  ;

     Var_d1  = 123.45 ;
     System.out.println( Var_d1 );

     double	Var_d2  = 456.7 ;
     System.out.println( Var_d2   );
  }
}
