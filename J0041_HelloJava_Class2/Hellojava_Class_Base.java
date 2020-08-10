// Hellojava_Class_Base.java
class Hellojava_Class_Base {
   public static void main(String[] args)   {
      Hellojava_Class_sub Obj1 = new Hellojava_Class_sub() ; 	// Hellojava_Class_subをオブジェクト化
      Obj1.str = "HelloJava";  		// メンバ変数に値を代入
      Obj1.Standard_out();  		// メソッドの実行
   }
}

// Hellojava_Class_sub.java
class Hellojava_Class_sub {
    String str;			// メンバ変数の定義
    public void Standard_out() {		// メソッドの定義
         System.out.println( str );
   }
}


