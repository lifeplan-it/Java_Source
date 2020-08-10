// Java Map�̎g����
// Map �̐錾
// Map<�L�[�̌^��, �l�̌^��> �I�u�W�F�N�g�� = new HashMap<>();
// Map �v�f��ǉ�
// Map�^�I�u�W�F�N�g��.put(�L�[, �l);
// Map �v�f���擾
// Map�^�I�u�W�F�N�g��.get(�L�[);
// String�^���w�肷��
// Map<String, String> map = new HashMap<String, String>();
// List���w�肷��
// Map<String, List<String>> map = new HashMap<>();
// for(�^ �ϐ��� : List��){
//    System.out.println(�ϐ���);
// }

// Variable_Map_Base.java
import java.util.*;
public class Variable_Map_Base  {
    public static void main(String[] args) {
        // Map�̐錾
        Map<String, String> map = new HashMap<String, String>();

        Variable_Map_Init (map ) ;
        Variable_Map_Print_Val (map ) ;
        Variable_Map_Print_Key (map ) ;

    }
    public static void Variable_Map_Init (Map<String, String> map ) {
        map.put("key1", "apple");
        map.put("key2", "orange");
        map.put("key3", "melon");
    }

    public static void Variable_Map_Print_Val (Map<String, String> map ) {
	for( String val : map.values() ) {
		System.out.println( val );
	}
    }

    public static void Variable_Map_Print_Key (Map<String, String> map ) {
	for( String key : map.keySet () ) {
		System.out.println( key );
	}
    }
}

