// awt_Base_Frame_Private.java
// awt ライブラリのインポート
import java.awt.* ;

// メインクラス
class awt_Base_Frame_Private {
    // メインメソッド
    public static void main( String[] arge ){
	// コントロールメソッドの呼び出し
	awt_Base_Method();
    }

    // コントロールメソッド
    public static void awt_Base_Method (){
	// サブクラスのオブジェクト化
	awt_Main_Frame mF = new awt_Main_Frame ();

	// メンバ変数へのアクセスはエラー
	// mF.Frame_X = 480;
	// mF.Frame_Y = 480;
	// mF.Frame_W = 640;
	// mF.Frame_H = 320;

	// 表示用メソッド（showFrame ）の呼び出し
	mF.showFrame ();
    }
}

// Frameを拡張してサブクラスを作成します。
// awt_Main_Frame.java
class awt_Main_Frame extends Frame {
    // メンバ変数の定義
	private int Frame_X ;
	private int Frame_Y ;
	private int Frame_W ;
	private int Frame_H ;

    // コンストラクタ
    // メンバ変数の初期化
    public awt_Main_Frame() {
	Frame_X = 480;
	Frame_Y = 480;
	Frame_W = 640;
	Frame_H = 320;
    }

    // Frameを表示するメソッド
    public void showFrame (){
	// タイトルの設定
	setTitle( "awtFrame" );
	// Frameの表示位置
	setBounds( Frame_X, Frame_X, Frame_W, Frame_H );
	// サイズ設定
	setSize( Frame_W, Frame_H );
	// 表示/非表示をON
	setVisible( true );
    }
}
