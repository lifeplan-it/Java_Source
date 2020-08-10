// Hellojava_Class_Base.java
class Hellojava_Class_Base {		// メインクラス
   public static void main(String[] args)   {	// メインメソッド
      Hellojava_Class_method()  ;　	// メソッド呼び出し
   }

   public static void Hellojava_Class_method()   {	// メソッド
      Hellojava_Class_sub Obj1 = new Hellojava_Class_sub() ; 	// Hellojava_Class_subをオブジェクト化
      Obj1.str = "HelloJava";  		// メンバ変数に値を代入
      Obj1.Standard_out();  		// メソッドの実行
  }
}

// Hellojava_Class_sub.java
class Hellojava_Class_sub {		// サブクラス
    String str ;			// メンバ変数の定義
    public Hellojava_Class_sub () {	// コンストラクタ
	// (何もしない）
    }
    public void Standard_out() {		// メソッドの定義
         System.out.println( str );		// 処理
   }
}


