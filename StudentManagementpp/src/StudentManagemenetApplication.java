
public class StudentManagemenetApplication {

	public static void main(String[] args) {
		
		
		//Create a reference of a student type
		//Student s1;
		
		System.out.println("No of Students Registered are: "+ Student.getCount());
		//System.out.println(s);  //ERROR:
		//2.create object and assign a reference variable
		//s1 = new Student();
//		s2 = new Student();
		//System.out.println(s);
		
//		System.out.println(s.rollNo);
//		System.out.println(s.name);
//		System.out.println(s.marks);
		
//		s.rollNo=-42;  //To stop this we make sure rollNo is not accessible outside the class
//						//in which it is declared
//		s.name="Ibrah";
//		s.marks=99.44f;
		
//		s1.accept(42, "Ibrah", 99.44f);
//		s2.accept(57, "Jignesh", 33.33f);
		//s1.display();   //Invoking display() method
		Student s;
//		s= new Student();
//		s.display();
//		s =new Student(2, "Ronaldo", 77.77f);
		
		s=new Student(1, "Ibrah", 99.99f);	System.out.println("No of Students Registered are: "+ Student.getCount());
		System.out.println(s);
		s.display("*");
	
	}
}
