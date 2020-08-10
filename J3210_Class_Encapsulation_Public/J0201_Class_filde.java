// J0201_class_filde.java
// クラスの定義
class Class_system_out {
  // フィールド名　str の定義
  String str;

 // メソッド名　Standard_out　の定義
 public void Standard_out()  {
  // 標準出力に　str を出力
	System.out.println( str );
  }
}

// クラス名　J0200_class_filde の定義
class J0200_class_filde {
   // メソッド名　main()　の定義
   public static void main(String[] args)  {
	// オブジェクトを作成
	Class_Example1 Cs1 = new Class_system_out();

	// Class のフィールド str に値を代入する
	Cs1.str = "Hello";

	// Class のメソッド　Standard_out　を呼び出す
	Cs1.Standard_out();

   }
}
