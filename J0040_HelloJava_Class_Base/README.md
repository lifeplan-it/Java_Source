# Java サブクラスの利用
クラスのインスタンス化を学ぶサンプルコードです。
クラスを使って、文字列「HelloJava」を出力します。

# 解説  
## クラスについて
プログラムはクラス単位にまとめます。  
クラスには、メンバ変数とメソッドを記述します。  

クラスをインスタンス化する事で、クラスのメソッドを使用する事ができます。

# 処理内容
サブクラス（Hellojava_Class_sub)を作成しています。

メインクラス(Hellojava_Class_Main)の
メソッド(Hellojava_Class_method)の中で
サブクラス（Hellojava_Class_sub)をインスタンス化しています。
　
インスタンス化する事で、サブクラスのメソッド（Standard_out）を
メインメソッド（Hellojava_Class_Main）側で使用する事ができます。
　
# ソースファイル
  Hellojava_Class_Main.java

# メインクラス  
  Hellojava_Class_Main
## メソッド
  サブクラスのインスタンス化を行う  
  void Hellojava_Class_method()

# サブクラス
  Hellojava_Class_sub
## メソッド
  標準出力に文字を出力します。
  void HelloJava_Print()
