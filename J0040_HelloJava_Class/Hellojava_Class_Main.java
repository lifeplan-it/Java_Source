/*
#�\�[�X�t�@�C��
�@�@
*/

// Hellojava_Class_Main.java
// ���C���N���X
class Hellojava_Class_Main {
  // ���C�����\�b�h
   public static void main(String[] args)
   {
      // ���\�b�h�Ăяo��
      Hellojava_Class_method() ;
   }

   // �T�u�N���X�̃C���X�^���X�����s��
   public static void Hellojava_Class_method()
   {
     // Hellojava_Class_sub���C���X�^���X��
     Hellojava_Class_sub Obj1 = new Hellojava_Class_sub() ;
     // �T�u�N���X�̃��\�b�h�Ăяo��
     Obj1.Standard_out();
  }
}

// Hellojava_Class_sub.java
// �T�u�N���X
class Hellojava_Class_sub
{
  // ���\�b�h�̒�`
  public void Standard_out()
  {
    System.out.println("HelloJAVA");
  }
}
