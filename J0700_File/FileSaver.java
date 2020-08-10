/* FileSaver.java
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


/* FileSaver
 */
public class FileSaver {

	/**
	 * フィールド
	 */
	private String fileName;

	/** コンストラクタ FileSaver
	 * @param String fileName
	 */
	FileSaver( String fileName ) {
		this.fileName = fileName;
	}

	/** write
	 * @param RecordList rl
	 * @throws FileNotFoundException, IOException
	 */
	public void write( RecordList rl )
	 throws FileNotFoundException, IOException {
		// ファイル名＝fileNameのファイルに
		// 書き込みを行う
		BufferedWriter output = null;
		try {
			try {

				output = new BufferedWriter( new FileWriter( fileName ) );

				// 引数RecordListに格納されたレコードを１行ずつ書き込む
				int idx = 0;
				Record r;
				while( idx < rl.size() ) {
					r = rl.getRecord( idx );
					output.write( r.writeForCSV() );
					output.newLine();     // 改行文字をファイルに出力
					idx++;
				}
			} finally {
				if (output != null)
					output.close();
			}
		} catch( FileNotFoundException e ) {
			System.out.println( fileName + "を開くことができません。" );
			throw e;
		} catch( IOException e ) {
			System.out.println( "ファイル書込み中にエラーが発生しました。" );
			throw e;
		}
	}
}
