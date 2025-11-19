
public class DemoExceptionHandling {

	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 0;
		
		try {
			int result = num1/num2;
			System.out.println("Result is: "+result);
		}
		
		//System.out.println("In between");   //ERROR: not allowed		
		catch (ArithmeticException e){
			System.out.println("Cannot divide by Zero");
			e.printStackTrace(); //This print complete Stack trace on console needed for debugging.
		}
	}
}
