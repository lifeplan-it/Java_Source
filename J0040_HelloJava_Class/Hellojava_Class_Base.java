// Hellojava_Class_Base.java
class Hellojava_Class_Base {		// ���C���N���X
   public static void main(String[] args)   {	// ���C�����\�b�h
      Hellojava_Class_method()  ;�@	// ���\�b�h�Ăяo��
   }

   public static void Hellojava_Class_method()   {	// ���\�b�h
      Hellojava_Class_sub Obj1 = new Hellojava_Class_sub() ; 	// Hellojava_Class_sub���I�u�W�F�N�g��
      Obj1.str = "HelloJava";  		// �����o�ϐ��ɒl����
      Obj1.Standard_out();  		// ���\�b�h�̎��s
  }
}

// Hellojava_Class_sub.java
class Hellojava_Class_sub {		// �T�u�N���X
    String str ;			// �����o�ϐ��̒�`
    public Hellojava_Class_sub () {	// �R���X�g���N�^
	// (�������Ȃ��j
    }
    public void Standard_out() {		// ���\�b�h�̒�`
         System.out.println( str );		// ����
   }
}


