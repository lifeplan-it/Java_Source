// Class_Constructor_Base.java
// ���C�����\�b�h
class Class_Constructor_Base  {
   public static void main(String[] args)    {
	// �I�u�W�F�N�g�쐬
        Class_Constructor_Sub Obj1
	 = new Class_Constructor_Sub();

        Obj1.str = "���C��";
        Obj1.Standard_out();
   }
}

// Class_Constructor_Sub.java
class Class_Constructor_Sub  {
	// �t�B�[���h
	public String str;	

	// �R���X�g���N�^�i�N���X���Ɠ������\�b�h���j
	public Class_Constructor_Sub ()   {
		str = "C/C++:JAVA";
		System.out.println( "�R���X�g���N�^�F" + str );
	}
	
	public void Standard_out()   {
		System.out.println("���\�b�h�o�́@�F" + str);
	}	
}
