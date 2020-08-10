// J0330_class_car_return
// クラス名：（　  Car　　）
class Car {
  	int num;	// 車のナンバーを設定
	double gas;	// ガソリン量を設定

	/* メソッド名：（ 　setCar_argument　 ）
		仮引き集　n,g から値を取得して表示します。
	 引数: 無
   	戻り値：（ 　無　　 ）
	  */
	void setCar(int n , double g) 	{
		System.out.println("メソッド名：setCar");
		num = n ;
		gas = g ;
		// メソッド　setCar_show を呼び出し
		this.setCar_show();
		// メソッド　setCar_add を呼び出し
		this.setCar_add();
		// メソッド　setCar_show を呼び出し
		this.setCar_show();
	}
	/* メソッド名：（ setCar_add ）
		フィールドの変数に加算しています。
	  引数: 無
   	戻り値：（ 　無　　 ）
	  */
	void setCar_add() 	{
		//	System.out.println("setCar_argument");
		System.out.println("メソッド名：setCar_add");
		num = num + 1000 ;
		gas = gas + 5.0  ;
	}
	/* メソッド名：（ getNum ）
		フィールド変数　num を戻り値として返す。
		引数: 無
   	戻り値：（ 　無　　 ）
  */
	 int  getNum() {
		return this.num;
	}
	/* メソッド名：（　getgas　）
		フィールド変数　gas を戻り値して返しています。
		引数: 無
   	戻り値：（ 　無　　 ）
  */
	double getgas() {
			return this.gas;
	}

	void setCar_show()
	{
		System.out.println("フィールド変数");
		System.out.println("車のナンバー:" + this.num + "です。");
		System.out.println("ガソリンの量:" + this.gas + "です。");
		System.out.println("");
	}
}

	// クラス名：J0330_class_car_private
class J0330_class_car_return
{
  public static void main(String[] args)
	{
			int number1 ;
			double gasoline1 ;
    	//  Carクラスの（ オブジェクト作成 ） Car型の変数carに代入
  		Car car1 = new Car();

  		// メソッド　Car_show　のフィールド変数にアクセス
			System.out.println("car1 のフィールド変数");
			car1.num = 1234;
			car1.gas = 20.5;
			car1.setCar_show();

			// メソッド　setCar_argument　に実引き数　number1,gasoline1　を渡す　
			System.out.println("car1 の引数");
			number1 = 893 ;
			gasoline1 = 55.0 ;
			car1.setCar(number1,gasoline1);

			// メソッド　getNum　の戻り値を　number2　に取得
			int number2 = car1.getNum();
			// メソッド　getgas　の戻り値を　gasoline2　に取得
			double gasoline2 = car1.getgas();

      // 戻り値を表示
			System.out.println("現在のnumの値：" + number2);
			System.out.println("現在のgasの値：" + gasoline2);
 	}
}
