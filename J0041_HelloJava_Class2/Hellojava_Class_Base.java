// Hellojava_Class_Base.java
// ���C���N���X
class Hellojava_Class_Base
{
  public static void main(String[] args)
  {
    // Hellojava_Class_sub���C���X�^���X��
    Hellojava_Class_sub Obj1 = new Hellojava_Class_sub() ;
   // �����o�ϐ��ɒl����
    Obj1.str = "HelloJava";
    // ���\�b�h�̎��s
    Obj1.Standard_out();
  }
}

// Hellojava_Class_sub.java
// �T�u�N���X
class Hellojava_Class_sub {
  // �����o�ϐ��̒�`
  String str;
  // �����o�ϐ��̒�`
  public void Standard_out()
  {
    // ���\�b�h�̒�`
    System.out.println( str );
  }
}
