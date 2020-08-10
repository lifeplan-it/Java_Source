// File_Load_Base.java

import java.io.*;
class File_Load_Base {
   public static void main(String[] args)    {
	String FileName = "test1.txt" ;
	File_Load_Text ( FileName )  ;
   }

   // File 読み込みメソッド
   public static void File_Load_Text (String Fn )    {
     try{
	// ファイルのパスを指定する
	File FileName = new File("client2.csv");

	// ファイルが存在しない場合に例外が発生するので確認する
	if ( !FileName.exists() ) {
		System.out.print("ファイルが存在しません");
                		return;
            	}
	// 読み込み
	FileReader fr = new FileReader( FileName );
	BufferedReader br = new BufferedReader( fr );
	// BufferedReader br = new BufferedReader(new FileReader( FileName ));

	String data;
	while ( ( data = br.readLine()) != null) {
                		System.out.println(data);
            	}
         
	// リソースを開放する
            	br.close();
	fr.close();
      }
      catch(IOException e){
         System.out.println("入出力エラーです。");
      }
  }
}
