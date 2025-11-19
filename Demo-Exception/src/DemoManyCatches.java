
public class DemoManyCatches {

	public static void main(String[] args) {
		
		try {
			String s = null;
			System.out.println(s.length());
			System.out.println(args[0]);
			System.out.println(1/0);
		}
		
		catch(ArithmeticException e){
			
			System.out.println("Cannot divide by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of range");
			
		}
		catch(NullPointerException e) {
			System.out.println("Cannot invoked method on NULL reference");
		}
		catch(Exception e) {
			System.out.println("Generic"); //Common for all the exception.//Generic catch
		}
		System.out.println("After");
	}
}
