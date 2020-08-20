// Java Map�̎g����
// ��{�\��
// Map �̐錾
//   Map<�L�[�̌^��, �l�̌^��> �I�u�W�F�N�g�� = new HashMap<>();
//
// Map �v�f��ǉ�
//   Map�^�I�u�W�F�N�g��.put(�L�[, �l);
//
// Map �v�f���擾
//   Map�^�I�u�W�F�N�g��.get(�L�[);
//
// String�^���w�肷��
//   Map<String, String> map = new HashMap<String, String>();
//
// MAP��List���w�肷��
// Map<String, List<String>> map = new HashMap<>();
//
//�N���X����
// �\�[�X�t�@�C����
// �@Variable_Map_Base.Java
//���C���N���X��
// �@Variable_Map_Base
//���\�b�h
//  Map�̐錾
//    Map<String, String> map = new HashMap<String, String>();
//  Map�̏��������s�����\�b�h
//    Variable_Map_Init ( Map<String, String> )
//  MAP�̕\�����s�����\�b�h
//    Variable_Map_Print_Val ( Map<String, String> )
//  Map�̃L�[��\�����郁�\�b�h
//    Variable_Map_Print_Key ( Map<String, String> )
//
// Variable_Map_Base.java
import java.util.*;
public class Variable_Map_Base  {
  // ���C�����\�b�h
  Public static void main(String[] args)  {
     // Map�̐錾
     Map<String, String> map = new HashMap<String, String>();
     // Map�̏��������s�����\�b�h
     Variable_Map_Init (map ) ;
     // MAP�̕\�����s�����\�b�h
     Variable_Map_Print_Val (map ) ;
     // Map�̃L�[��\�����郁�\�b�h
     Variable_Map_Print_Key (map ) ;
  }

    // Map�̏��������s�����\�b�h
    public static void Variable_Map_Init (Map<String, String> map ) {
        map.put("key1", "apple");
        map.put("key2", "orange");
        map.put("key3", "melon");
    }

    // MAP�̕\�����s�����\�b�h
    public static void Variable_Map_Print_Val (Map<String, String> map ) {
�@�@�@�@for( String val : map.values() ) {
�@�@�@�@�@�@System.out.println( val );
	�@}
  }

  // Map�̃L�[��\�����郁�\�b�h
  public static void Variable_Map_Print_Key (Map<String, String> map ) {
	  for( String key : map.keySet () ) {
		  System.out.println( key );
	  }
  }
}
