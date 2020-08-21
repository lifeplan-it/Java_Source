# Java メソッド作成
　プログラミングの基礎勉強用のソースコードです。  
  メソッドの使い方のサンプルです。  

# クラスについて
# 解説  
## クラス HelloJava_Base を作成します  

# ソースコード記述の手順
## メインクラスを作成    
  ```
  // メインクラス  
  class HelloJava_Base  
  {  
    // メインメソッドを記述する  
  }  
  ````
## メインメソッドを作成します。  

  ```  
  // メインクラス
  class HelloJava_Base  
  {
    // メインメソッド  
    public static void main(String[] args)
    {
  	   // 処理を記述
    }
  }
  ```

## 3)処理を記述します  

  ```  
  // メインクラス
  class HelloJava_Base  
  {
    // メインメソッド  
    public static void main(String[] args)
    {
      // 処理を記述
      System.out.println("Hello JAVA!!") ;
    }
  }
  ```  
# 解説
## メソッドについて
  メソッドは、他のメソッドやメインメソッドから呼び出す事ができます。
  メソッドを呼び出すと、処理がメソッドに移り処理が終わると
  呼び出された次の行に移ります。  

# 処理内容
  メインメソッドから、メソッド(HelloJava_Print)を呼び出しています。  
  メソッド(HelloJava_Print)は、標準出力に文字を出力する処理を行います。  
  メソッド(HelloJava_Print)の処理が終わると処理は呼び出されたメソッドに戻ります。  

# ソースファイル
  HelloJava_Method.java

# メインクラス  
　HelloJava_Method

# メソッド
## void HelloJava_Print()
   標準出力に文字を出力します。
