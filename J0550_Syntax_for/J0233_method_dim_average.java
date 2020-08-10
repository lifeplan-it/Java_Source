// J0233_method_dim_average.java
//
import java.io.*;

class J0233_class_dim_average
{
   public static void main(String[] args) throws IOException
   {
     // 変数定義
     // 合計の変数　goukei
     int goukei = 0;
     // 入力個数　kosu
	   int kosu = 0;
     // 平均値　heikin
	   double heikin = 0.0;
     // 最大値　max1
     int max1 = 0;
     // 最長地　min1
     int min1 = 0;

     // 配列の定義
     int[] test;
	   test = new int[5];

     // キーボード入力の定義
     BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

      // 入力
      for(int i=0; i< 5; i++)
      {
        // 入力の誘導
	      System.out.println("整数を入力してください。");

        // キーボード入力
        String str = br.readLine();

        // 整数　res に　文字列　str を変換
        int res = Integer.parseInt(str);

        // 配列　test に　整数　res を代入
        test[i] = res ;

        // 入力回数のカウント
        kosu++;
      }

      // 合計の計算
      for(int i=0; i< 5; i++){
	       goukei = goukei + test[i];
      }

      // 平均の計算
      heikin = (double)goukei / (double)kosu;

      // 最大値の計算
      max1 = test[0];
      for(int i=0; i< 5; i++){
        if (max1 < test[i]) {
          max1 = test[i];
        }
    	}

      // 最小値の計算
      min1 = test[0];
      for(int i=0; i< 5; i++){
        if (min1 > test[i]) {
          min1 = test[i];
        }
    	}

      System.out.println("個数:" + kosu);
      System.out.println("合計:" + goukei);
      System.out.println("平均:" + heikin);
      System.out.println("最大値：" + max1);
      System.out.println("最小値：" + min1);
   }
}
