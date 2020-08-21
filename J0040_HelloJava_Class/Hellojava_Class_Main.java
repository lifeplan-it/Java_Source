/*
#ソースファイル
　　
*/

// Hellojava_Class_Main.java
// メインクラス
class Hellojava_Class_Main {
  // メインメソッド
   public static void main(String[] args)
   {
      // メソッド呼び出し
      Hellojava_Class_method() ;
   }

   // サブクラスのインスタンス化を行う
   public static void Hellojava_Class_method()
   {
     // Hellojava_Class_subをインスタンス化
     Hellojava_Class_sub Obj1 = new Hellojava_Class_sub() ;
     // サブクラスのメソッド呼び出し
     Obj1.Standard_out();
  }
}

// Hellojava_Class_sub.java
// サブクラス
class Hellojava_Class_sub
{
  // メソッドの定義
  public void Standard_out()
  {
    System.out.println("HelloJAVA");
  }
}
