// Class_Encapsulation_Base.java
class Class_Encapsulation_Base  {
   public static void main(String[] args)   {
 	Private_out_print Obj1 = new Private_out_print();
  	// Obj1.Local_str = "Hello" ;�@���[�J���ϐ��ɂ̓A�N�Z�X�ł��Ȃ�
	Obj1.Public_str = "Public�ϐ��̒l" ;

	String str = "�����̒l" ;
	Obj1.Standard_out_print( str );
	Obj1.Local_out_print ( );
   }
}

// Private_out_print.java
class Private_out_print {
    private String Local_str;	// ���[�J���ϐ�
    public   String Public_str;	// �����o�ϐ�
    public void Standard_out_print( String s ) {
	System.out.println( "���� s �F" + s );
	Local_str = s ; 	// ���������[�J���ϐ��ɓn��
    }
    public void Local_out_print( ) {
         	System.out.println( "private str �F" + Local_str );
	System.out.println( "public  str �F" + Public_str );
    }

}

