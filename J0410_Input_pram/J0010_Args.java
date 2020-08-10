// JAVA コマンドパラメータの使い方
// Java-args
// JAVA Sample Code
// J0010_Args.java

class J0010_Args {
  public static void main(String[] args) {
	// パラメータの個数
	int P_count ;
	P_count = args.length ;

	// パラメータの個数のチェック
	if (P_count == 0) {
		// パラメータがが無ければ" No data "を出力して終了
		System.out.println(" No data ");
	}
	else {
	// パラメータがあればパラメータの数だけ出力
		for ( int i=0 ; i < P_count; i++ ) {
			// パラメータを出力
			System.out.println("入力されたパラメータ：" + args[i]);
		}
	}
  }
}

// 実行方法
//$ javac J0010_Args.java
//$ java  J0010_Args 1 4 7
//入力されたパラメータ：1
//入力されたパラメータ：4
//入力されたパラメータ：7
