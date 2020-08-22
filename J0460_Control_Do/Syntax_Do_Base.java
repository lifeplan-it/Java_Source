// Syntax_Do_Base.java
// クラス定義　
class Syntax_Do_Base {
  // メインメソッド定義
  public static void main(String[] args)  {
	// Do文のサンプルプログラムの呼び出し
	Syntax_Do_Demo ();
  }

  // Do文のサンプルプログラム
  public static void Syntax_Do_Demo ()  {
      int i  = 0 ;  // 初期化
      do {
	i++ ;
	System.out.println ( i ) ;
      } 
      while ( i < 5 ) ;  
   }
}
