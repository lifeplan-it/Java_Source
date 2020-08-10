// Java Mapの使い方
// Map の宣言
// Map<キーの型名, 値の型名> オブジェクト名 = new HashMap<>();
// Map 要素を追加
// Map型オブジェクト名.put(キー, 値);
// Map 要素を取得
// Map型オブジェクト名.get(キー);
// String型を指定する
// Map<String, String> map = new HashMap<String, String>();
// Listを指定する
// Map<String, List<String>> map = new HashMap<>();
// for(型 変数名 : List名){
//    System.out.println(変数名);
// }

// Variable_Map_Base.java
import java.util.*;
public class Variable_Map_Base  {
    public static void main(String[] args) {
        // Mapの宣言
        Map<String, String> map = new HashMap<String, String>();

        Variable_Map_Init (map ) ;
        Variable_Map_Print_Val (map ) ;
        Variable_Map_Print_Key (map ) ;

    }
    public static void Variable_Map_Init (Map<String, String> map ) {
        map.put("key1", "apple");
        map.put("key2", "orange");
        map.put("key3", "melon");
    }

    public static void Variable_Map_Print_Val (Map<String, String> map ) {
	for( String val : map.values() ) {
		System.out.println( val );
	}
    }

    public static void Variable_Map_Print_Key (Map<String, String> map ) {
	for( String key : map.keySet () ) {
		System.out.println( key );
	}
    }
}

