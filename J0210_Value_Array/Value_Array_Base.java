// Java �z��ϐ��̐錾

// �z��ϐ��̐錾
// �^��[]	�z��ϐ���;
// �z��ϐ��� = new �^��[�v�f��] ;
// �ȗ��^
// �^��[]	�z��ϐ��� = new �^��[�v�f��] ;
// ���X�g�^
// �^��[]	�z��ϐ��� = { �l�P, �l�Q, �l�R,�E�E�E} ;

// Value_Array_Base.java
class Value_Array_Base {
  public static void main(String[] args)   {
	Value_Array_int ();
	Value_Array_String () ;
	Value_Array_List () ;
  }

  public static void Value_Array_int ()   {
	int Var1[] ;
	Var1 = new int [3] ;
	// int Var1[]  = new int [3] ;

	Var1[0] =  3 ;
	Var1[1] =  2 ;
	Var1[2] =  1 ;
	
	System.out.println( "�z��̒����F" + Var1.length );
	System.out.println( "�z��0�ԖځF" + Var1[0] );
	System.out.println( "�z��1�ԖځF" + Var1[1] );
	System.out.println( "�z��2�ԖځF" + Var1[2] );
  }
 
  public static void Value_Array_String ()   {
	String[] Line1 = new String[8];

	 Line1[0] = "   **   ";
	 Line1[1] = "  *  *  ";
	 Line1[2] = " *    * ";
	 Line1[3] = "********";
	 Line1[4] = "*      *";
	 Line1[5] = "*      *";
	 Line1[6] = "*      *";
	 Line1[7] = "*      *";
	System.out.println( "�z��̒����F" + Line1.length );
	System.out.println( Line1[0] );
	System.out.println( Line1[1] );
	System.out.println( Line1[2] );
	System.out.println( Line1[3] );
	System.out.println( Line1[4] );
	System.out.println( Line1[5] );
	System.out.println( Line1[6] );
	System.out.println( Line1[7] );
   }

  public static void Value_Array_List ()   {
	String[] Japn1 = { "�k�C��" , "�{�B" , "�l��", "��B", "����"  } ;

	System.out.println( "�z��̒����F" + Japn1.length );
	System.out.println( Japn1[0] );
	System.out.println( Japn1[1] );
	System.out.println( Japn1[2] );
	System.out.println( Japn1[3] );
	System.out.println( Japn1[4] );


   }
}
