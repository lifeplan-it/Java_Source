// Java Param
// JAVA コマンドパラメータの使い方
// メインメソッドの引数は、コマンドラインから入力された値を受け取る事ができます。
// 
// 実行方法
//$ javac Input_param.java
//$ java  Input_param 1 4 7
// 実行結果
//入力されたパラメータ：1
//入力されたパラメータ：4
//入力されたパラメータ：7
// Input_param.java
class Input_param {
  public static void main(String[] args) {
	// パラメータの個数
	int P_count ;
	P_count = args.length ;

	// パラメータの個数のチェック
	if (P_count == 0) {
		// パラメータがが無ければ" No data "を出力して終了
		System.out.println(" No data ");
	} else {
	    System.out.println("パラメータの数：" + P_count );
	  // パラメータがあればパラメータの数だけ出力
	  for ( int i=0 ; i < P_count; i++ ) {
	    // パラメータを出力
	    System.out.println("入力されたパラメータ：" + args[i]);
	    }
	}
  }
}

// 実行方法
//$ javac Input_param.java
//$ java  Input_param 1 4 7
//入力されたパラメータ：1
//入力されたパラメータ：4
//入力されたパラメータ：7