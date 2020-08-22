// Syntax_While_Base.java
// スイッチ文の使い方
// キーボードから整数を入力して
// 整数に応じた文字列を返す。
// 0を入力したら終了
import java.util.Scanner;
class Syntax_While_Base {
   public static void main(String[] args)  {
	// １回目のwhile が終了しない様に初期化
	int var = -1;
	// 0 が入力されるまで繰り返し
	while ( var != 0 ) {
	    // キーボード読み込み
	    var = Input_Scanner_int () ;
	    // 値　var  に応じた文字列を　str に返す
	    String str = Syntax_Switch ( var ) ;
	    // Str の出力
	    System.out.println ( str ) ;
	}  // While は処理を実行して終了
   }
  // 引数　res  に応じた文字列を返す
  public static String Syntax_Switch ( int s ) {
         String res ;
         switch( s ){
         case 0:
            res = "終了します。";
            break;
         case 1:
            res = "がんばりましょう。";
            break;
         case 2:
            res = "もう少しがんばりましょう。"  ;
            break;
         case 3:
            res = "がんばりましたね。" ;
            break;
         case 4:
            res = "たいへんよくできました。" ;
            break;
         case 5:
            res = "最高点です。" ; 
            break;
         default:
            res = "0、１～５の値を入力してください。"  ;
            break;
        }
	return res ;
  }

  public static int Input_Scanner_int () {
	System.out.println("キーボードから数字を入力してください（ 0：終了）");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	int num = Integer.parseInt(str);
      	// System.out.println("入力された数字「" + num  + "」です");
   	return num ;
  }
}
