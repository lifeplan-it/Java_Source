// Hellojava_Class_Constructor.java
// �T�v
// �R���X�g���N�^���g����Hello Java
//
// ���C���N���X
class Hellojava_Class_Constructor {
  // ���C�����\�b�h
  public static void main ( String[] args )
  {
    // ���\�b�h�Ăяo��
    Hellojava_Class_method()  ;
  }

  // ���\�b�h
  public static void Hellojava_Class_method()
  {
    // �T�u�N���X Hellojava_Class_Sub���C���X�^���X��
    new Hellojava_Class_Sub () ;
  }
}

// Hellojava_Class_Sub.java
// �T�u�N���X
class Hellojava_Class_Sub {
  // �R���X�g���N�^�F�C���X�^���X�������Ɠ����Ɏ��s�����
  public Hellojava_Class_Sub ()
  {
    System.out.println( "Hello Java" );
  }
}
