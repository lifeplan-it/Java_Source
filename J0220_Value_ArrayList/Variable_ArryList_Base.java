// Java ArrayList �̎g����
// ArrayList �̐錾
// ArrayList<�^> �z��ϐ��� = new ArrayList< �^ > ();
// ArrayList �f�[�^�̒ǉ�
//    �z��ϐ���.add( �l );
//    �z��ϐ���.add( id, �l );
// ArrayList �f�[�^�̍X�V
//    �z��ϐ���.set( id, �l );
// ArrayList �f�[�^�̍폜
//    �z��ϐ���.remove( id, �l );

// Variable_ArryList_Base.java
import java.util.ArrayList;
public class Variable_ArryList_Base  {
  public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("���");
        list.add("�݂���");
        list.add("����");
        System.out.println("�v�f[0]:" + list.get(0));
        System.out.println("�v�f[1]:" + list.get(1));
        System.out.println("�v�f[2]:" + list.get(2));
        System.out.println("������" + list);

	Variable_ArryList_Add ( list );
	Variable_ArryList_Set ( list ) ;
	Variable_ArryList_Remove( list );
  }

  public static void Variable_ArryList_Add (ArrayList<String> list) {
  
        System.out.println("�ǉ�");
        System.out.println("�S�v�f:" + list);
        System.out.println("�ǉ��i�u�h�E�j");

        list.add(1,"�u�h�E");

        System.out.println("�ǉ���F" + list);
 
    }
  public static void Variable_ArryList_Set (ArrayList<String> list) {
        System.out.println("�X�V");
        System.out.println("�S�v�f:" + list);
        System.out.println("�X�V�i�Ԃǂ��j");
        list.set(1, "�Ԃǂ�" );
        System.out.println("�X�V��F" + list);
    }

   public static void Variable_ArryList_Remove (ArrayList<String> list) {
        System.out.println("�폜");
        System.out.println("�S�v�f:" + list);
        System.out.println("�폜�Q");
        list.remove(2);
        System.out.println("�S�v�f:" + list);
    }
}
