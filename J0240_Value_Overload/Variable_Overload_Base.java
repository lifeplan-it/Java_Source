// Method_Overload_Base.java
//オーバーロードの使い方
// メソッド名が同じでも
// 引数の型と順番が一致している
// メソッドが呼び出されます

class Method_Overload_Base {
  public static void main(String[] args) {
	// 引数がないメソッド
	Variable_PrintOut();
	// 引数が文字列
	Variable_PrintOut("文字列の引数");
	// 引き数が整数
	Variable_PrintOut( 111 );
	// 引数が文字列と整数
	Variable_PrintOut("文字列の引数２", 222 );
   }

  public static void Variable_PrintOut () {
	System.out.println("引数なし" );
  }

  public static void Variable_PrintOut (String S ) {
	System.out.println("引数文字列：" + S );
  }

  public static void Variable_PrintOut (int i ) {
	System.out.println("引数整数：" + i );
  }

  public static void Variable_PrintOut(String S,int i) {
	System.out.println("引数文字列：" + S );
	System.out.println("引数整数：" + i );
  }
}
