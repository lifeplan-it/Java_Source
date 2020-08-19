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

// Variable_ArryList_Base.java
import java.util.ArrayList;
public class Variable_ArryList_Base  {
  public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("りんご");
        list.add("みかん");
        list.add("もも");
        System.out.println("要素[0]:" + list.get(0));
        System.out.println("要素[1]:" + list.get(1));
        System.out.println("要素[2]:" + list.get(2));
        System.out.println("初期化" + list);

	Variable_ArryList_Add ( list );
	Variable_ArryList_Set ( list ) ;
	Variable_ArryList_Remove( list );
  }

  public static void Variable_ArryList_Add (ArrayList<String> list) {
  
        System.out.println("追加");
        System.out.println("全要素:" + list);
        System.out.println("追加（ブドウ）");

        list.add(1,"ブドウ");

        System.out.println("追加後：" + list);
 
    }
  public static void Variable_ArryList_Set (ArrayList<String> list) {
        System.out.println("更新");
        System.out.println("全要素:" + list);
        System.out.println("更新（ぶどう）");
        list.set(1, "ぶどう" );
        System.out.println("更新後：" + list);
    }

   public static void Variable_ArryList_Remove (ArrayList<String> list) {
        System.out.println("削除");
        System.out.println("全要素:" + list);
        System.out.println("削除２");
        list.remove(2);
        System.out.println("全要素:" + list);
    }
}
