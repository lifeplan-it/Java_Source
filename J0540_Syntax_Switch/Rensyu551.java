// Rensyu551.java
// I/O ライブラリ
import java.io.*;
// クラス定義　
class Rensyu551 {
   public static void main(String[] args) throws IOException    {
      System.out.println("成績を入力してください。（1-5）");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
      
	String str1 = br.readLine();

	int res = Integer.parseInt(str1);
 
        if (res == 1) System.out.println("もっとがんばりましょう。");
        if (res == 2) System.out.println("もう少しがんばりましょう。");
        if (res == 3) System.out.println("さらに上をめざしましょう。");
        if (res == 4) System.out.println("たいへんよくできました。");
        if (res == 5) System.out.println("たいへん優秀です。");
        if (res < 1 || res > 6 )  System.out.println("１～５を入力してください。");

/* 
      switch(res){
         case 1:
            System.out.println("もっとがんばりましょう。");
            break;
         case 2:
            System.out.println("もう少しがんばりましょう。");
            break;
         case 3:
            System.out.println("さらに上をめざしましょう。");
            break;
         case 4:
            System.out.println("たいへんよくできました。");
            break;
         case 5:
            System.out.println("たいへん優秀です。");
            break;
         default:
            System.out.println("１～５を入力してください。");
            break;
	}
*/
   }
}
