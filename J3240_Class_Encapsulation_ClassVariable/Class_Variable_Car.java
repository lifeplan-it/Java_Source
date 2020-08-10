// Class_Variable_Car.java

class Class_ClassVariable {
  public static int sum = 0;

  private int num;
  private double gas;

  public MethodClassVariable() {
	num = 0;	// 変数の初期化
	gas = 0.0;	// クラス変数の加算
	sum++;
	System.out.println("車を作成しました。");
  }

  //　setCarメソッドの（ オーバーロード  ）
  public void setCar(int n , double g)  {
	// 自分自身のメソッドの呼び出し　( this 省略可能)
	this.setCar_show();
	num = n ;
	gas = g ;
  }

  //　setCarメソッドの（ オーバーロード  ）
  public	void setCar(int n) {
	num = n;
	this.setCar_show();
  }

  //　インスタンス変数に仮引数 u, a,m を加算
  public void setCar_add(int u, double a, int m) {
	num = u ;
	gas = a ;
	sum = m ;
  }

  //　インスタンス変数　num を戻り値として返す
  public int  getNum() 	{
 	return this.num;
  }

  //　インスタンス変数 gas を戻り値として返す
  public double getgas() 	{
	return this.gas;
  }

  //　インスタンス変数を画面に出力
  public void setCar_show() 	{
	System.out.println("setCar_show");
	System.out.println("車のナンバー:" + this.num + "です。");
	System.out.println("ガソリンの量:" + this.gas + "です。");
	System.out.println("");
  }

	// クラス メソッド名：showSum
	public static void showSum() 	{
	// クラス変数　sum　の表示
 		System.out.println("車は全部で"  + sum + "台あります。");
	}
}

// クラス名：J0330_class_car_private
class J0370_class_car_classvariable {
	public static void main(String[] args) {
		int number1 ;
		double gasoline1 ;
    		//  Carクラスの（ オブジェクト作成 ） Car型の変数carに代入
  		Car car1 = new Car();
		Car car2 = new Car();

		number1 = 893 ;
		gasoline1 = 55.0 ;
		System.out.println("元のnumの値：" + number1);
		System.out.println("元のgasの値：" + gasoline1);
		car1.setCar(number1,gasoline1);

		number1 = 12345 ;
		gasoline1 = 60.0 ;
		System.out.println("元のnumの値：" + number1);
		System.out.println("元のgasの値：" + gasoline1);
		car2.setCar(number1,gasoline1);

		// クラス変数の参照
		System.out.println("クラス変数：" + Car.sum);
		Car.showSum() ;

		// インスタンス変数の参照　エラーになる
		// System.out.println("インスタンス変数：" + Car.num);
 	}
}
