package JavaConcepts;

public class PracticeClass {
	//practice class
	
	//== method overloading
	
	// creating multiple method with same name, but diff in the parameters
	
	// same  method name, but diff in no of parameters 
	// same  method name, but diff in data type of parameters 
	
	
	// in static methods we can call only static methods == directly
	
	// static methods == we can call based on classanme, based on object
	// instance methods/ non static methods == we can call based on object
	
	
	
	
	
	// these are called local variables == variable which we declare inside the method
	// only in that method we can use
	// we can't use outside of that method
	
	public static void socialMarks() {
		
		int mathmarks=90;
		int englishmarkes=95;
		int telugu=95;
		int socialmarks=90;
		
		System.out.println(socialmarks);
		
	}
	
	public static void marks() {
		
		//System.out.println(socialmarks);
		
	}
	
	public static void main(String[] args) {
		
		// at the time of object creation
		
		new PracticeClass();//contsructor  == object creation 
		
		System.out.println("Raju");
		
		int a=new NewClass().englishmarks;
		
		int b=new NewClass().matMarks;
		int c=NewClass.matMarks;
		

	}

}
