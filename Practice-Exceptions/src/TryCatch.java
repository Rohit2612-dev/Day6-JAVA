import java.io.IOException;

public class TryCatch {

	public static void main(String[] args) {

		try {	
//			int n1 =10;
//			int n2 = 0;
//			int result = n1/n2;		
			String s1 = null;	
			System.out.println("Result is: "+ s1.length());
		}
		catch(NullPointerException e){
		
			System.out.println("Invalid string");
		}
		
	}
}
