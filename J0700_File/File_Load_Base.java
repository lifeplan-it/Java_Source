// File_Load_Base.java

import java.io.*;
class File_Load_Base {
   public static void main(String[] args)    {
	String FileName = "test1.txt" ;
	File_Load_Text ( FileName )  ;
   }

   // File �ǂݍ��݃��\�b�h
   public static void File_Load_Text (String Fn )    {
     try{
	// �t�@�C���̃p�X���w�肷��
	File FileName = new File("client2.csv");

	// �t�@�C�������݂��Ȃ��ꍇ�ɗ�O����������̂Ŋm�F����
	if ( !FileName.exists() ) {
		System.out.print("�t�@�C�������݂��܂���");
                		return;
            	}
	// �ǂݍ���
	FileReader fr = new FileReader( FileName );
	BufferedReader br = new BufferedReader( fr );
	// BufferedReader br = new BufferedReader(new FileReader( FileName ));

	String data;
	while ( ( data = br.readLine()) != null) {
                		System.out.println(data);
            	}
         
	// ���\�[�X���J������
            	br.close();
	fr.close();
      }
      catch(IOException e){
         System.out.println("���o�̓G���[�ł��B");
      }
  }
}
