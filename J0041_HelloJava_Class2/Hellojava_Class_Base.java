// Hellojava_Class_Base.java
class Hellojava_Class_Base {
   public static void main(String[] args)   {
      Hellojava_Class_sub Obj1 = new Hellojava_Class_sub() ; 	// Hellojava_Class_sub���I�u�W�F�N�g��
      Obj1.str = "HelloJava";  		// �����o�ϐ��ɒl����
      Obj1.Standard_out();  		// ���\�b�h�̎��s
   }
}

// Hellojava_Class_sub.java
class Hellojava_Class_sub {
    String str;			// �����o�ϐ��̒�`
    public void Standard_out() {		// ���\�b�h�̒�`
         System.out.println( str );
   }
}


