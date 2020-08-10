// J0360_class_car_overload.java
// クラス名：（　  Car　　）
class Car
{
  // （ インスタンス）変数　修飾子をつけて（カプセル化）
	private int num;	// 車のナンバーを設定
	private double gas;	// ガソリン量を設定

  //　setCarメソッドの（ オーバーロード  ）
	public void setCar(int n , double g)
	{
		num = n ;
		gas = g ;
		// 自分自身のメソッドの呼び出し　( this 省略可能)
		this.setCar_show();
	}

  //　setCarメソッドの（ オーバーロード  ）
  public	void setCar(int n)
	{
		num = n;
		this.setCar_show();
	}

	private void setCar_add()
	{
		num = num + 1000 ;
		gas = gas + 5.0  ;
	}

  public int  getNum()
	{
			return this.num;
	}

	public double getgas()
	{
			return this.gas;
	}

	public void setCar_show()
	{
		System.out.println("setCar_show");
		System.out.println("車のナンバー:" + this.num + "です。");
		System.out.println("ガソリンの量:" + this.gas + "です。");
		System.out.println("");
	}
}

	// クラス名：J0330_class_car_private
class J0360_class_car_overload
{
  public static void main(String[] args)
	{
			int number1 ;
			double gasoline1 ;
    	//  Carクラスの（ オブジェクト作成 ） Car型の変数carに代入
  		Car car1 = new Car();

			// 仮引き数　number1,gasoline1　
			number1 = 893 ;
			gasoline1 = 55.0 ;
			System.out.println("元のnumの値：" + number1);
			System.out.println("元のgasの値：" + gasoline1);
			car1.setCar(number1,gasoline1);

			number1 = 5589 ;
			System.out.println("元のnumの値：" + number1);
			car1.setCar(number1);

			int number2 = car1.getNum();
			double gasoline2 = car1.getgas();

			System.out.println("現在のnumの値：" + number2);
			System.out.println("現在のgasの値：" + gasoline2);

 	}
}
