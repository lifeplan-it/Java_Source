// awt_Base_Frame_Constructor.java
// awt ライブラリのインポート
import java.awt.* ;

// メインクラス
class awt_Base_Frame_Constructor {
    // メインメソッド
    public static void main( String[] arge ){
	// コントロールメソッドの呼び出し
	awt_Base_Method();
    }

    // コントロールメソッド
    public static void awt_Base_Method (){
	// サブクラスのオブジェクト化
	awt_Main_Frame mF = new awt_Main_Frame ();
	// mF.showFrame (); // 呼び出しをしない
    }
}

// Frameを拡張してサブクラスを作成します。
// awt_Main_Frame.java
class awt_Main_Frame extends Frame {
    // コンストラクタ
    // オブジェクト化と同時に実行される
    public awt_Main_Frame() {
	// タイトルの設定
	setTitle( "awtFrame" );
	// Frameの表示位置
	setBounds( 640, 480, 100, 80 );
	// サイズ設定
	setSize( 480, 240 );
	// 表示/非表示をON
	setVisible( true );
    }
}
