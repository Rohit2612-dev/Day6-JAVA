import java.util.Scanner;

public class TryCatchFinal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        String str = "HelloWorld";
	        
	        try {
	        		System.out.println("Enter Index");
	        	   int index = sc.nextInt();
	        	   System.out.println("Character: "+ str.charAt(index));        	      	
	        }
	        catch(StringIndexOutOfBoundsException e){
	         System.out.println("Invalid index! Please enter a valid range.");         	
	        } 
	        finally{
	        	 System.out.println(" Operation complete.");
	             sc.close();   	
	        }
	}
}
