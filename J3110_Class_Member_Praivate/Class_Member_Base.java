// Class_Member_Base.java
class Class_Member_Base {
   public static void main(String[] args)   {
     Standard_out_print Obj1 = new Standard_out_print();	// �I�u�W�F�N�g��
     Obj1.str = "HelloJAVA";		// �����o�ϐ��ɃA�N�Z�X   
     Obj1.Standard_out_print ();		//���\�b�h�ɃA�N�Z�X
   }
}

// Standard_out_print.java
class Standard_out_print {
    String str;			// �����o�ϐ��̒�`

    public void Standard_out_print() {	  // ���\�b�h�̒�`
         System.out.println( str );
   }
}

