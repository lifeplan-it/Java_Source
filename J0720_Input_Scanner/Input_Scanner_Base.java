// Java キーボード入力（Scanner）
// Input_Scanner_Base.java
import java.util.Scanner;
class Input_Scanner_Base {
  public static void main(String[] args) {
	String str = Input_Scanner_str () ;
      	System.out.println("入力された文字は「" + str + "」です");

	int num = Input_Scanner_int () ;
      	System.out.println("入力された数字「" + num  + "」です");
  }

  public static String Input_Scanner_str () {
	System.out.println("キーボードから文字を入力してください");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
      	// System.out.println("入力された文字は「" + str + "」です");
   	return str ;
  }

  public static int Input_Scanner_int () {
	System.out.println("キーボードから数字を入力してください");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	int num = Integer.parseInt(str);
      	// System.out.println("入力された数字「" + num  + "」です");
   	return num ;
  }
}
