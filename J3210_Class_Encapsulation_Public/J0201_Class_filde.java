// J0201_class_filde.java
// �N���X�̒�`
class Class_system_out {
  // �t�B�[���h���@str �̒�`
  String str;

 // ���\�b�h���@Standard_out�@�̒�`
 public void Standard_out()  {
  // �W���o�͂Ɂ@str ���o��
	System.out.println( str );
  }
}

// �N���X���@J0200_class_filde �̒�`
class J0200_class_filde {
   // ���\�b�h���@main()�@�̒�`
   public static void main(String[] args)  {
	// �I�u�W�F�N�g���쐬
	Class_Example1 Cs1 = new Class_system_out();

	// Class �̃t�B�[���h str �ɒl��������
	Cs1.str = "Hello";

	// Class �̃��\�b�h�@Standard_out�@���Ăяo��
	Cs1.Standard_out();

   }
}
