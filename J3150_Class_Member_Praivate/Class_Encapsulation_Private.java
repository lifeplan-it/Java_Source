// Class_Encapsulation_Private.java
class Class_Encapsulation_Private {
   public static void main(String[] args)   {
	Private_out_print Obj1 
		= new Private_out_print();

     	// Obj1.Local_str = �gHello�h;�@�G���[
     	// Obj1.Local_out_print ( ); �@ �G���[

	Obj1.Public_str = "Public�ϐ��̒l" ;

	String str = "�����̒l" ;
	Obj1.Standard_out_print( str );
   }
}

// Private_out_print.java
class Private_out_print {
	// �A�N�Z�X�s�iprivate�j�ϐ�
	private String Local_str;

	// �����o�ϐ��i�A�N�Z�X�\�j
	public String Public_str;
	public void Standard_out_print( String s ) {
		System.out.println( "���� s �F" + s );
		Local_str = s ; 	  // ���������[�J���ϐ��ɓn��
		Local_out_print( ) ;  // ���[�J���ŌĂяo���\
	}

	// private���\�b�h�i�A�N�Z�X�s�j
	private void Local_out_print( ) {
		System.out.println( "private str �F" + Local_str );
		System.out.println( "public  str �F" + Public_str );
	}
}
