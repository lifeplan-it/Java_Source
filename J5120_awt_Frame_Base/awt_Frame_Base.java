// awt_Frame_Base.java
// awt ライブラリのインポート
import java.awt.* ;

// メインクラス
class awt_Frame_Base {
    // メインメソッド
    public static void main( String[] arge ){
	// コントロールメソッドの呼び出し
	awt_Base_Method();
    }

    // コントロールメソッド
    public static void awt_Base_Method (){
	// サブクラスのオブジェクト化
	awt_Main_Frame mF = new awt_Main_Frame ();
	// 表示用メソッド（showFrame ）の呼び出し
	mF.showFrame ();
    }
}

// Frameを拡張してサブクラスを作成します。
// awt_Main_Frame.java
class awt_Main_Frame extends Frame {
    // コンストラクタ
    public awt_Main_Frame() {
	
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
    }
}
