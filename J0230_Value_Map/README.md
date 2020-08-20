# Java Mapの使い方
## 基本構文
### Map の宣言
   Map<キーの型名, 値の型名> オブジェクト名 = new HashMap<>();
### Map 要素を追加
   Map型オブジェクト名.put(キー, 値);

### Map 要素を取得
   Map型オブジェクト名.get(キー);

### String型を指定する
   Map<String, String> map = new HashMap<String, String>();

### MAPにListを指定する
   Map<String, List<String>> map = new HashMap<>();  

# クラス説明  
* ソースファイル名  
   　Variable_Map_Base.Java
* メインクラス名  
   　Variable_Map_Base
* メソッド  
**  MAPの初期化を行うメソッド  
      Variable_Map_Init ( Map<String, String>)    
**  MAPの表示を行うメソッド  
      Variable_Map_Print_Val( Map<String, String> )      
**  Mapのキーを表示するメソッド  
      Variable_Map_Print_Key ( Map<String, String> )  
