// Java 演算式の例
// 四則演算の事例です。
// 算術演算子
// 主な算術演算子		
// 演算子	概要	例
// +	加算	1 + 2 // 3
// -	減算	5 ? 2 // 3
// *	乗算	3 * 4 // 12
// /	除算	5.0 / 2 // 2.5
// %	剰余	5 % 2 // 1
// +	文字列の連結	“A” + “B” // 
// ++	インクリメント	x = 1;x++; // 2
// ?	デクリメント	x = 1;x?; // 0
// 実行結果
// 足し算：　10
// 引き算：　4
// 掛け算：　21
// 割り算：　2.3333333333333335
// 余り(i % j)：　2
// 　
// 代入加算（i += j）
// 引数i:5
// 引数j:9
// 結果i:14
// 結果j:9
// 　
// 代入減算（i -= j）
// 引数i:9
// 引数j:5
// 結果i:4
// 結果j:5
// 　
// 代入除算（i /= j）
// 引数i:20.0
// 引数j:5.0
// 結果i:4.0
// 結果j:5.0
// 　
// インクリメント（i++）
// 引数i:4
// 結果i:5
// 　
// ディクリメント（i--）
// 引数i:4
// 結果i:3
// 
// Syntax_Calculation_Base.java
class Syntax_Calculation_Base {
   public static void main(String[] args) {
	int 	i ;
	double	d ;
	i = Addition( 3, 7) ;
	i = Subtraction ( 7, 3) ;
	i = Multiplication ( 7, 3) ;
	d = Division ( 7, 3);
	i = modulo( 12, 5);

	i = Assignment_plus( 5 , 9);
	i = Assignment_minus ( 9, 5) ;
	d = Assignment_Division(20.0,5.0);

	i = Increment( 4 );
	i = Decrement( 4 );
   }

   private static int Addition (int i,int j) {
	int res ;
	res = i + j;
	System.out.println("足し算：　" + res );
	return res ;
   }

  private static int Subtraction (int i,int j) {
	int res ;
	res = i - j;
	System.out.println("引き算：　" + res );
	return res ;  
   }

   private static int Multiplication (int i,int j) {
	int res ;
	res = i * j;
	System.out.println("掛け算：　" + res );
	return res ;      
   }

   private static double Division (int i,int j) {
	double res ;
	res = (double)i / (double)j;	//整数を浮動小数点に変換
	System.out.println("割り算：　" + res );
	return res ;     
   }

   private static int modulo (int i,int j) {
	int res ;
	res = i % j;
	System.out.println("余り(i % j)：　" + res );
	return res ;     
   }

   private static int Assignment_plus (int i,int j) {
	System.out.println("　");
	System.out.println("代入加算（i += j）");
	System.out.println("引数i:" + i  );
	System.out.println("引数j:" + j  );

	i += j;

	System.out.println("結果i:" + i  );
	System.out.println("結果j:" + j  );
	return i ;     
   }

   private static int Assignment_minus (int i,int j) {
	System.out.println("　");
	System.out.println("代入減算（i -= j）");
	System.out.println("引数i:" + i  );
	System.out.println("引数j:" + j  );

	i -= j;

	System.out.println("結果i:" + i  );
	System.out.println("結果j:" + j  );
	return i ;     
   }

   private static int Assignment_Multiplication(int i,int j) {
	System.out.println("　");
	System.out.println("代入乗算（i *= j）");
	System.out.println("引数i:" + i  );
	System.out.println("引数j:" + j  );

	i *= j;

	System.out.println("結果i:" + i  );
	System.out.println("結果j:" + j  );
	return i ;     
   }

   private static double Assignment_Division(double i,double j) {
	System.out.println("　");
	System.out.println("代入除算（i /= j）");
	System.out.println("引数i:" + i  );	
	System.out.println("引数j:" + j  );

	i /= j;

	System.out.println("結果i:" + i  );	
	System.out.println("結果j:" + j  );
	return i ;     
   }

   private static int Increment(int i) {
	System.out.println("　");	
	System.out.println("インクリメント（i++）");	
	System.out.println("引数i:" + i  );

	i++;

	System.out.println("結果i:" + i  );
	return i ;     
   }

   //Decrement
   private static int Decrement(int i) {

	System.out.println("　");	
	System.out.println("ディクリメント（i--）");	
	System.out.println("引数i:" + i  );

	i--;

	System.out.println("結果i:" + i  );
      	return i ;     
   }

}
