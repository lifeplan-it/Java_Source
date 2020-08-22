// Java ArrayList の使い方
// 
// ArrayList の宣言
// ArrayList<型> 配列変数名 = new ArrayList< 型 > ();
//
// ArrayList データの追加
//    配列変数名.add( 値 );
//    配列変数名.add( id, 値 );
//
// ArrayList データの更新
//    配列変数名.set( id, 値 );
//
// ArrayList データの削除
//    配列変数名.remove( id, 値 );
//
// メインクラス
// Variable_ArryList_Base.java
// 追加処理のサンプルメソッド
//    void Variable_ArryList_Add ( ArrayList<String> list );
//
//変更処理のサンプルメソッド
//    void Variable_ArryList_Set ( ArrayList<String> list ) ;
//
// 削除処理のサンプルメソッド
//    Void Variable_ArryList_Remove( ArrayList<String> list );
//
// Array List ライブラリの読み込み
import java.util.ArrayList;
// メインクラス
public class Variable_ArryList_Base  {
  // メインメソッド
  public static void main(String[] args) {
    // ArrayList変数の初期化
    ArrayList<String> list = new ArrayList<String>();
    
    // Listの初期化　　
    list.add("りんご");
    list.add("みかん");
    list.add("もも");

    // 初期データの表示
    System.out.println("初期データの表示");
    System.out.println("要素[0]:" + list.get(0));
    System.out.println("要素[0]:" + list.get(0));
    System.out.println("要素[1]:" + list.get(1));
    System.out.println("要素[2]:" + list.get(2));
    System.out.println("初期化" + list);
    
    // 追加処理のサンプルメソッド
    Variable_ArryList_Add ( list );

    //変更処理のサンプルメソッド
    Variable_ArryList_Set ( list ) ;

    // 削除処理のサンプルメソッド
    Variable_ArryList_Remove( list );
  }

  public static void Variable_ArryList_Add (ArrayList<String> list) {
     System.out.println("");
     System.out.println("追加");
     System.out.println("全要素:" + list);
     System.out.println("追加（ブドウ）");
     // ブドウの追加
     list.add(1,"ブドウ");

     // 追加後の確認
     System.out.println("追加後：" + list);
 }
  public static void Variable_ArryList_Set (ArrayList<String> list) {
     System.out.println("");
     System.out.println("更新処理");
     System.out.println("全要素:" + list);
     System.out.println("更新（ぶどう）");
     
     // ブドウ　→　ぶどう　に変更
     list.set(1, "ぶどう" );
     
     // 削除後の確認
     System.out.println("更新後：" + list);
  }

  public static void Variable_ArryList_Remove (ArrayList<String> list) {
      System.out.println("");
      System.out.println("削除");
      System.out.println("全要素:" + list);
      System.out.println("削除２");

      // 削除 
      list.remove(2);

     // 削除後の確認
     System.out.println("全要素:" + list);
  }
}
