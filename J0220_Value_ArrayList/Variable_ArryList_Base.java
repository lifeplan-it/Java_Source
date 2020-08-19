// Java ArrayList �̎g����
// 
// ArrayList �̐錾
// ArrayList<�^> �z��ϐ��� = new ArrayList< �^ > ();
//
// ArrayList �f�[�^�̒ǉ�
//    �z��ϐ���.add( �l );
//    �z��ϐ���.add( id, �l );
//
// ArrayList �f�[�^�̍X�V
//    �z��ϐ���.set( id, �l );
//
// ArrayList �f�[�^�̍폜
//    �z��ϐ���.remove( id, �l );
//
// ���C���N���X
// Variable_ArryList_Base.java
// �ǉ������̃T���v�����\�b�h
//    void Variable_ArryList_Add ( ArrayList<String> list );
//
//�ύX�����̃T���v�����\�b�h
//    void Variable_ArryList_Set ( ArrayList<String> list ) ;
//
// �폜�����̃T���v�����\�b�h
//    Void Variable_ArryList_Remove( ArrayList<String> list );
//
// Array List ���C�u�����̓ǂݍ���
import java.util.ArrayList;
// ���C���N���X
public class Variable_ArryList_Base  {
  // ���C�����\�b�h
  public static void main(String[] args) {
    // ArrayList�ϐ��̏�����
    ArrayList<String> list = new ArrayList<String>();
    
    // List�̏������@�@
    list.add("���");
    list.add("�݂���");
    list.add("����");

    // �����f�[�^�̕\��
    System.out.println("�����f�[�^�̕\��");
    System.out.println("�v�f[0]:" + list.get(0));
    System.out.println("�v�f[0]:" + list.get(0));
    System.out.println("�v�f[1]:" + list.get(1));
    System.out.println("�v�f[2]:" + list.get(2));
    System.out.println("������" + list);
    
    // �ǉ������̃T���v�����\�b�h
    Variable_ArryList_Add ( list );

    //�ύX�����̃T���v�����\�b�h
    Variable_ArryList_Set ( list ) ;

    // �폜�����̃T���v�����\�b�h
    Variable_ArryList_Remove( list );
  }

  public static void Variable_ArryList_Add (ArrayList<String> list) {
     System.out.println("");
     System.out.println("�ǉ�");
     System.out.println("�S�v�f:" + list);
     System.out.println("�ǉ��i�u�h�E�j");
     // �u�h�E�̒ǉ�
     list.add(1,"�u�h�E");

     // �ǉ���̊m�F
     System.out.println("�ǉ���F" + list);
 }
  public static void Variable_ArryList_Set (ArrayList<String> list) {
     System.out.println("");
     System.out.println("�X�V����");
     System.out.println("�S�v�f:" + list);
     System.out.println("�X�V�i�Ԃǂ��j");
     
     // �u�h�E�@���@�Ԃǂ��@�ɕύX
     list.set(1, "�Ԃǂ�" );
     
     // �폜��̊m�F
     System.out.println("�X�V��F" + list);
  }

  public static void Variable_ArryList_Remove (ArrayList<String> list) {
      System.out.println("");
      System.out.println("�폜");
      System.out.println("�S�v�f:" + list);
      System.out.println("�폜�Q");

      // �폜 
      list.remove(2);

     // �폜��̊m�F
     System.out.println("�S�v�f:" + list);
  }
}
