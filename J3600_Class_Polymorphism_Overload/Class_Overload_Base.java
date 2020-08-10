// Class_Overload_Base.java
//オーバーロードの使い方
class Class_Overload_Base {
  public static void main(String[] args) {

	Class_PrintOut Cpo = new  Class_PrintOut() ;

	Cpo.Variable_PrintOut();
	Cpo.Variable_PrintOut("文字列の引数");
	Cpo.Variable_PrintOut( 111 );
	Cpo.Variable_PrintOut("文字列の引数２", 222 );
   }
}

// Class_PrintOut.java
class Class_PrintOut {
  public static void Variable_PrintOut () {
	System.out.println("引数なし" );
  }

  public static void Variable_PrintOut (String S ) {
	System.out.println("引数が文字列：" + S );
  }

  public static void Variable_PrintOut (int i ) {
	System.out.println("引数が整数：" + i );
  }

  public static void Variable_PrintOut(String S,int i) {
	System.out.println("引数が文字列：" + S );
	System.out.println("引数が整数：" + i );
  }

}
