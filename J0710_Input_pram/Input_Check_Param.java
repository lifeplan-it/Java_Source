// Input_Check_Param.java
class J0010_Args_check_count {
  public static void main(String[] args) {
	// パラメータの個数
	int P_count ;
	P_count = args.length ;

	// パラメータの個数のチェック
	if (P_count == 0) {
		  // パラメータがが無ければ" No data "を出力して終了
		System.out.println(" No data ");
	} else {
		// パラメータがあればパラメータの数だけ出力
		for ( int i=0 ; i < P_count; i++ )
		{
			// パラメータを出力
			System.out.println(args[i]);
		}
	}
	
  }
}
