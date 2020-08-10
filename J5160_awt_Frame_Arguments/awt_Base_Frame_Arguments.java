// awt_Base_Frame_Arguments.java
// awt ライブラリのインポート
import java.awt.* ;

// メインクラス
class awt_Base_Frame_Arguments {
    // メインメソッド
    public static void main( String[] arge ){
	// コントロールメソッドの呼び出し
	awt_Base_Method();
    }

    // コントロールメソッド
    public static void awt_Base_Method (){
	// 引数の初期化
	int x = 480;
	int y = 240;
	int w = 640;
	int h = 320;
	// サブクラスのオブジェクト化
	awt_Main_Frame mF = new awt_Main_Frame (x,y,w,h);

	// 表示用メソッド（showFrame ）の呼び出し
	mF.showFrame ();
    }
}

// awt_Main_Frame.java
class awt_Main_Frame extends Frame {
	private int Frame_X ;
	private int Frame_Y ;
	private int Frame_W ;
	private int Frame_H ;

    // コンストラクタ
    public awt_Main_Frame(int fx,int fy,int fw,int fh) {
	Frame_X = fx;
	Frame_Y = fy;
	Frame_W = fw;
	Frame_H = fh;
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
