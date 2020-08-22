// J0320_class_car_argument.java
// クラス名：（　  Car　　）
class Car
{
  // （ インスタンス）変数　修飾子をつけて（カプセル化）
	int num;	// 車のナンバーを設定
	double gas;	// ガソリン量を設定

	/* メソッド名：（ 　setCar　 ）
		仮引数 n , g から値を取得して表示します。
	  引数: 無
   	戻り値：（　無 ）
  */
	void setCar(int n , double g)
	{
		num = n ;
		gas = g ;
		System.out.println("仮引数から取得(SetCar)");
		System.out.println("車のナンバー:" + n + "です。");
		System.out.println("にガソリン量:" + g + "です。");
		System.out.println("");
	}

	/* メソッド名：（ 　setCar_show　 ）
		フィールド変数 num,gas から値を取得して表示します。
	  引数: 無
   	戻り値：（ 　無　　 ）
  */
	void setCar_show()
	{
		System.out.println("フィールド変数から取得");
		System.out.println("車のナンバー:" + num + "です。");
		System.out.println("ガソリンの量:" + gas + "です。");
		System.out.println("");
	}
}

// main クラス
class J0320_class_car_argument
{
  public static void main(String[] args)
	{
			int number1 ;
			double gasoline1 ;
    	//  Carクラスの（ オブジェクト作成 ） Car型の変数carに代入
  		Car car1 = new Car();

  		// オブジェクトの（　フィールド変数　）に数値を渡す。
			System.out.println("オブジェクト　car1 のインスタンス");
			car1.num = 1234;
			car1.gas = 20.5;
			car1.setCar_show();

			// 実引数　number1,	gasoline1から数知を渡す
			number1 = 893 ;
			gasoline1 = 55.0 ;
			car1.setCar(number1,gasoline1);

 	}
}
