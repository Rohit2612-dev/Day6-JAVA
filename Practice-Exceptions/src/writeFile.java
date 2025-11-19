import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeFile {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream("copyreadme2.txt");
			fis= new FileInputStream("readme2.txt");
			int data = fis.read();
			while (data != -1) {
				fos.write(data);
				data = fis.read();
			}
			}
		catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
}
