// Class_Member_Base.java
class Class_Member_Base {
   public static void main(String[] args)   {
	// �I�u�W�F�N�g��
	Standard_out_print Obj1 
		= new Standard_out_print();

	// �����o�ϐ��ɃA�N�Z�X
	Obj1.str = "HelloJAVA";

	//���\�b�h�ɃA�N�Z�X
	Obj1.Standard_out_print ();
   }
}

// Standard_out_print.java
class Standard_out_print {
	// �����o�ϐ��̒�`
	String str;
	// ���\�b�h�̒�`
	public void Standard_out_print() {
		System.out.println( str );
	}
}

