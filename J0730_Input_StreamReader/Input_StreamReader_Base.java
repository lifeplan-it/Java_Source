// Input_StreamReader_Base.java
// ���o�́@���C�u�����̃C���|�[�g
import java.io.*;
class Input_StreamReader_Base {
     public static void main(String[] args) {
	String str ;
	str = Input_Stream ();
 	System.out.println("���͂��ꂽ�߂�l�́u" + str + "�v�ł�");
     }

    public static String  Input_Stream () {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
 
 	System.out.println("�L�[�{�[�h������͂��Ă�������");
	String s = null;
 
 	try {
            		s = br.readLine();
            		br.close();
	    	return s ;
        	} catch (IOException e) {
            		e.printStackTrace();
	    	return s ;
        	}
   } 
}