# Java Windows から起動できる HelloJava GUI  

１）ソースファイルを作ります。
　　ソースファイル名：HelloJava_Gui.java　
　　GUIに「HelloJava」を出力するプログラムです。

２）コンパイルしてクラスファイルを作ります。
　　クラスファイル名
　　　HelloJava_GUI.class
　　　HelloGui$GuiWindowListener.class

３）マニフェスト（Manifest）ファイルを作ります。
　　マニフェストファイル名：HelloJava_Gui.mf
　　メインメソッドのあるクラス名を指定します。
　　　　Main-Class: HelloGuiMain
       　　改行

４）jar ファイルを作ります。
       構文
　　jar cvfm [jarファイル名]  [マニフェストファイル名]  [クラスファイル名]

　　サンプルコード
　　jar cvfm HelloJava_Gui.jar HelloJava_Gui.mf *.class

５）作成されたjar ファイルをWindowd でダブルクリックします。
　　プログラムが実行されます。
