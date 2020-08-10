// Syntax_Switch_Base.java
// スイッチ文の使い方
// キーボードから整数を入力して
// 整数に応じた文字列を返す。
// 0を入力したら終了
import java.util.Scanner;
class Syntax_Switch_Base {
   public static void main(String[] args)  {
	// キーボード読み込み
	int var = Input_Scanner_int () ;
	// 整数を渡して文字列を取得する。
	String str = Syntax_Switch ( var ) ;
	// 取得した文字列を
	System.out.println ( str ) ;
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
