// Class_Member_Base.java
class Class_Member_Base {
   public static void main(String[] args)   {
	// オブジェクト化
	Standard_out_print Obj1 
		= new Standard_out_print();

	// メンバ変数にアクセス
	Obj1.str = "HelloJAVA";

	//メソッドにアクセス
	Obj1.Standard_out_print ();
   }
}

// Standard_out_print.java
class Standard_out_print {
	// メンバ変数の定義
	String str;
	// メソッドの定義
	public void Standard_out_print() {
		System.out.println( str );
	}
}

