// Hellojava_Class_Constructor.java
// 概要
// コンストラクタを使ったHello Java
//
// メインクラス
class Hellojava_Class_Constructor {
  // メインメソッド
  public static void main ( String[] args )
  {
    // メソッド呼び出し
    Hellojava_Class_method()  ;
  }

  // メソッド
  public static void Hellojava_Class_method()
  {
    // サブクラス Hellojava_Class_Subをインスタンス化
    new Hellojava_Class_Sub () ;
  }
}

// Hellojava_Class_Sub.java
// サブクラス
class Hellojava_Class_Sub {
  // コンストラクタ：インスタンス化されると同時に実行される
  public Hellojava_Class_Sub ()
  {
    System.out.println( "Hello Java" );
  }
}
