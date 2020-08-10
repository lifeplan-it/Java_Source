// Class_Inheritance_Base.java
class Class_Inheritance_Base {
   public static void main(String[] args)   {
 	BaseBoll_Payer  P1 = new BaseBoll_Payer () ;
 	P1.Walk  ( "20Km" ) ;
	P1.Speak( "こんにちは" ) ;
	P1.Strike( "二塁打" );
   }
}

class BaseBoll_Payer extends Human {
    public BaseBoll_Payer() {
	super() ;
	System.out.println( "野球選手"  );
    }

    public void Strike ( String Stk ) {	  // メソッドの定義
         System.out.println( "打つ："  + Stk );
   }
   public void Walk( String Spd ) {	  // メソッドの定義
         System.out.println( "走る：" + Spd );
   }
}

class Human {
   public Human () {		// コンストラクタ
         System.out.println( "人間："  );
   }
   public void Walk( String Spd ) {	  // メソッドの定義
         System.out.println( "歩く：" + Spd );
   }
   public void Speak(String Spk ) {	  // メソッドの定義
         System.out.println( "話す：" + Spk );
   }
}

