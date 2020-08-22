// Loacl変数：メソッド内で定義される変数
// ローカル変数はそのメソッド内だけで有効になります。
//
// ソースファイル名
//     Method_Local_Variable.java
// メインクラス名
//    Method_Local_Variable   
// 整数のローカル変数宣言メソッド
//       Variable_Int_Print () ;
// 文字列のローカル変数宣言メソッド
//       Variable_Str_Print ();
// Method_Local_Variable.java
class Method_Local_Variable {
    public static void main(String[] args) {
       // 整数のローカル変数宣言メソッド
       Variable_Int_Print () ;
       // 文字列のローカル変数宣言メソッド
       Variable_Str_Print ();
  }

  public static void Variable_Int_Print () {
    // ローカル変数（整数）の変数初期化
     int Var = 111  ;
     System.out.print( "変数varの内容："  );
     System.out.println( Var );
  }

   public static void Variable_Str_Print () {
      // ローカル変数（文字列）の変数宣言
      String	Str ;
      Str = "メインメソッド終了" ;
      System.out.print   ( "変数strの内容："  );
      System.out.println( Str );
   }
}
