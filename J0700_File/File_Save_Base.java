// File_Save_Base.java
import java.io.*;

class File_Save_Base {
   public static void main(String[] args)    {
	String FileName = "test2.txt" ;
	File_Save_Test ( FileName ) ;
   }

   public static void File_Save_Test (String Fn)    {
      try{
         PrintWriter pw = new PrintWriter
         (new BufferedWriter(new FileWriter( Fn )));
         
         pw.println("Hello!");
         pw.println("GoodBye!");
         System.out.println("ファイルに書きこみました。");

         pw.close();
      }
         catch(IOException e){
         System.out.println("入出力エラーです。");
      }
   }
}
