// IF の基本構文
// ==	左辺と右辺が等しければ（真）true	
// !=	左辺と右辺が等しくなければ（真）true	5 != 5 // false
// <	左辺が右辺より小さければ（真）true	5 < 7 // true
// <=	左辺が右辺以下であれば（真）true	5 <= 3 // false
// >	左辺が右辺より大きければ（真）true	7 > 5 // true
// >=	左辺が右辺以上であれば（真）true	5 >= 7 // false
// ?:	「条件式 ? 式1 : 式2」。条件式がtrueなら式1、falseなら式2
//  	i >= 1 ? “真” : “偽”
// 例題
// 数値　A　が　B　より大きい
// （真）そうなら "◎"
// （偽）そうでなければ "×" 
//  を、出力する
// Syantax_if_Base.java
class Syantax_if_Base {
  public static void main(String[] args){
	int  A   = 80 ;
	int  B   = 10 ;
	
	String str = Hikaku ( A , B ) ;
	System.out.println( str ) ;
  }
  public static String Hikaku( int a , int b ) {
	String res ;

	if ( a >= b ) {
	    res = "◎" ;
	} else {
	    res = "×" ;
	}
	return res ; 
  }
}
