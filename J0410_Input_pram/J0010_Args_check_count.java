// J0010_Args_check_count.java
// 実行時に与えたパラメータのテスト
//
// 実行方法　( Windows Shell )
// $javac J0001_Args_test.java
// $java J0001_Args_test 1
//
//
// main() クラス名　J0001_Args_test

class J0010_Args_check_count
{
// main() メソッド　
public static void main(String[] args)
	{
		// パラメータの個数
		int P_count ;
		P_count = args.length ;

		// パラメータの個数のチェック
		if (P_count == 0)
		{
			  // パラメータがが無ければ" No data "を出力して終了
				System.out.println(" No data ");
		}
		else
		{
			// パラメータがあればパラメータの数だけ出力
			for ( int i=0 ; i < P_count; i++ )
			{
				// パラメータを出力
				System.out.println(args[i]);
			}
		}
	}
}
