/*
# Java �N���X�̗��p
�N���X�̃C���X�^���X�����w�ԃT���v���R�[�h�ł��B
�N���X���g���āA������uHelloJava�v���o�͂��܂��B

# ���
## �N���X�ɂ���
�v���O�����̓N���X�P�ʂɂ܂Ƃ߂܂��B
�N���X�ɂ́A�����o�ϐ��ƃ��\�b�h���L�q���܂��B

�N���X���C���X�^���X�����鎖�ŁA�N���X�̃��\�b�h���g�p���鎖���ł��܂��B

# �N���X�ɂ���
## �N���X�̊�{�\��
�@�@
# �������e
�T�u�N���X�iHellojava_Class_sub)���쐬���Ă��܂��B

���C���N���X(Hellojava_Class_Main)��
���\�b�h(Hellojava_Class_method)�̒���
�T�u�N���X�iHellojava_Class_sub)���C���X�^���X�����Ă��܂��B
�@
�C���X�^���X�����鎖�ŁA�T�u�N���X�̃��\�b�h�iStandard_out�j��
���C�����\�b�h�iHellojava_Class_Main�j���Ŏg�p���鎖���ł��܂��B
�@
# �\�[�X�t�@�C��
  Hellojava_Class_Main.java

# ���C���N���X
�@Hellojava_Class_Main
## ���\�b�h
   �T�u�N���X�̃C���X�^���X�����s��
     void Hellojava_Class_method()

# �T�u�N���X
  Hellojava_Class_sub
## ���\�b�h
  �W���o�͂ɕ������o�͂��܂��B
    void HelloJava_Print()
*/

// Hellojava_Class_Base.java
// ���C���N���X
class Hellojava_Class_Base {
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
  // �R���X�g���N�^
  public void Hellojava_Class_sub()
  {
     // �����������Ȃ�
  }

  // ���\�b�h�̒�`
  public void Standard_out()
  {
    // ������ "Hello JAVA" ��W���o�͂ɏo�͂���B
    System.out.println("HelloJAVA");
  }
}
