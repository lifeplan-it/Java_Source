// Hellojava_Class_Base.java
// メインクラス
class Hellojava_Class_Base
{
  public static void main(String[] args)
  {
    // Hellojava_Class_subをインスタンス化
    Hellojava_Class_sub Obj1 = new Hellojava_Class_sub() ;
   // メンバ変数に値を代入
    Obj1.str = "HelloJava";
    // メソッドの実行
    Obj1.Standard_out();
  }
}

// Hellojava_Class_sub.java
// サブクラス
class Hellojava_Class_sub {
  // メンバ変数の定義
  String str;
  // メンバ変数の定義
  public void Standard_out()
  {
    // メソッドの定義
    System.out.println( str );
  }
}
