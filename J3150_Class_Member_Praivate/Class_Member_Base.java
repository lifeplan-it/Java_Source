// Class_Member_Base.java
class Class_Member_Base {
   public static void main(String[] args)   {
     Standard_out_print Obj1 = new Standard_out_print();	// オブジェクト化
     Obj1.str = "HelloJAVA";		// メンバ変数にアクセス   
     Obj1.Standard_out_print ();		//メソッドにアクセス
   }
}

// Standard_out_print.java
class Standard_out_print {
    String str;			// メンバ変数の定義

    public void Standard_out_print() {	  // メソッドの定義
         System.out.println( str );
   }
}

