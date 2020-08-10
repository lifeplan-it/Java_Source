// Input_StreamReader_Base.java
// 入出力　ライブラリのインポート
import java.io.*;
class Input_StreamReader_Base {
     public static void main(String[] args) {
	String str ;
	str = Input_Stream ();
 	System.out.println("入力された戻り値は「" + str + "」です");
     }

    public static String  Input_Stream () {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
 
 	System.out.println("キーボードから入力してください");
	String s = null;
 
 	try {
            		s = br.readLine();
            		br.close();
	    	return s ;
        	} catch (IOException e) {
            		e.printStackTrace();
	    	return s ;
        	}
   } 
}