// awt_Base_Event.java
// awt ライブラリのインポート
import java.awt.* ;
// awt イベント用ライブラリインポート
import java.awt.event.* ;

// メインクラス
class awt_Base_Event {
    // メインメソッド
    public static void main( String[] arge ){
	// コントロールメソッドの呼び出し
	awt_Base_Method();
    }

    // コントロールメソッド
    public static void awt_Base_Method (){
	// サブクラスのオブジェクト化
	awt_Base_Frame_Event mF 
		= new awt_Base_Frame_Event ();
	// 表示用メソッド（showFrame ）の呼び出し
	mF.showFrame ();
    }
}

// Frameを拡張してサブクラスを作成します。
// イベントを追加します。
// awt_Base_Frame_Event.java
class awt_Base_Frame_Event extends Frame {
    // コンストラクタ
    public awt_Base_Frame_Event() {
	
    }

    // Frameを表示するメソッド
    public void showFrame (){
	// タイトルの設定
	setTitle( "awtFrame" );
	// Frameの表示位置
	setBounds( 640, 480, 100, 80 );
	// サイズ設定
	setSize( 480, 240 );
	// 表示/非表示をON
	setVisible( true );
	
	// イベント用クラスのオブジェクト化
	FrameWindowListener wl 
		= new FrameWindowListener();
	// オブジェクト化したクラスをFrameに追加
	addWindowListener( wl ) ;

    }
    
    // WindowAdapter を拡張して
    // イベント処理クラスを作成
    class FrameWindowListener extends WindowAdapter {
	// WindowsのClse ボタンが押されたと時の処理
	public void windowClosing( WindowEvent e ) {
		// 終了の処理
		System.exit( 0 );
	}
    }
}
