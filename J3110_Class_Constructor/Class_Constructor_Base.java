// Class_Constructor_Base.java
// メインメソッド
class Class_Constructor_Base  {
   public static void main(String[] args)    {
	// オブジェクト作成
        Class_Constructor_Sub Obj1
	 = new Class_Constructor_Sub();

        Obj1.str = "メイン";
        Obj1.Standard_out();
   }
}

// Class_Constructor_Sub.java
class Class_Constructor_Sub  {
	// フィールド
	public String str;	

	// コンストラクタ（クラス名と同じメソッド名）
	public Class_Constructor_Sub ()   {
		str = "C/C++:JAVA";
		System.out.println( "コンストラクタ：" + str );
	}
	
	public void Standard_out()   {
		System.out.println("メソッド出力　：" + str);
	}	
}
