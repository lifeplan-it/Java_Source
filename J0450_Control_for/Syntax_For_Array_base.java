// Syntax_For_Array_base.java
class Syntax_For_Array_base {
   public static void main(String[] args)   {

	int count = 5 ;	// �z��̒���

	int[] test  ; 	// �z��錾
	test = new int [ count ] ;

	test[0] = 3;	// �z��̏�����
	test[1] = 5;
	test[2] = 2;
	test[3] = 4;
 	test[4] = 6;

	Syntax_For_Array_Print ( test, count) ; 	// �z��̓��e�\��
  }

  public static void Syntax_For_Array_Print ( int[] val, int Count )  {
	for( int i = 0 ; i < Count ; i++ ) {
		System.out.println( val[ i ] );
	}
   }
  
}
