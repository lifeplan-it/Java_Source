// Variable_Array.java
class variable_Array  {
   public static void main(String[] args)  {

   }
    
public viod Variable_Declaration() {
// 変数定義
// 合計の変数　goukei
     int goukei = 0;
     int kosu = 5;
     double heikin = 0.0;
     int max1 = 0;
     int min1 = 0;

     // 配列の定義
     int[] test;
	   test = new int[kosu];

     // 配列の初期化
     test[0] = 3;
     test[1] = 5;
     test[2] = 2;
     test[3] = 4;
     test[4] = 6;

      // 合計の計算
      for(int i=0; i< kosu; i++){
	       goukei = goukei + test[i];
      }

      // 平均の計算
      heikin = (double)goukei / (double)kosu;

      // 最大値の計算
      max1 = test[0];
      for(int i=0; i< kosu; i++){
        if (max1 < test[i]) {
          max1 = test[i];
        }
    	}

      // 最小値の計算
      min1 = test[0];
      for(int i=0; i< kosu; i++){
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
