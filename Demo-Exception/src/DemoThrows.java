import java.io.IOException;

public class DemoThrows {

	public static void main(String[] args) {
		
//		IOException e = new IOException();
		
		//Handling Exceptions
//		try{
//			throw e;
//		}
//		catch(Exception ex) {	
//		}
		try {
			readFile();
		}
		catch(IOException e) {
			System.out.println("Hello mama");			
		}
	}
	static void readFile() throws IOException{
		IOException e = new IOException();
		throw e;
	}
}
