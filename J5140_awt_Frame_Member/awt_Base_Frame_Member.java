// awt_Base_Frame_Member.java
// awt ライブラリのインポート
import java.awt.* ;

// メインクラス
class awt_Base_Frame_Member {
    // メインメソッド
    public static void main( String[] arge ){
	// コントロールメソッドの呼び出し
	awt_Base_Method();
    }

    // コントロールメソッド
    public static void awt_Base_Method (){
	// サブクラスのオブジェクト化
	awt_Main_Frame mF = new awt_Main_Frame ();

	// メンバ変数へのアクセス
	mF.Frame_X = 480;
	mF.Frame_Y = 480;
	mF.Frame_W = 640;
	mF.Frame_H = 320;

	// 表示用メソッド（showFrame ）の呼び出し
	mF.showFrame ();
    }
}

// Frameを拡張してサブクラスを作成します。
// awt_Main_Frame.java
class awt_Main_Frame extends Frame {
    // メンバ変数の宣言	
    public int Frame_X ;
    public int Frame_Y ;
    public int Frame_W ;
    public int Frame_H ;

    // コンストラクタ
    public awt_Main_Frame() {

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
