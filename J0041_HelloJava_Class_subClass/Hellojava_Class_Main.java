// Hellojava_Class_Main.java
// メインクラス　（メインメソッドがある）
class Hellojava_Class_Main
{
  // メインメソッド
  public static void main(String[] args)
  {
    // サブクラス(Hellojava_Class_subClass)をインスタンス化
    // 事前に、サブクラス(Hellojava_Class_subclass.class)が必要
    Hellojava_Class_sub Obj1 = new Hellojava_Class_sub() ;
    // サブクラスのメソッドを実行
    Obj1.Standard_out();
  }
}
