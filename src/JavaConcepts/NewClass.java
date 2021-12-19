package JavaConcepts;

public class NewClass {
	
	int englishmarks=95;  // instance variable

	 int socialmarks=90;  // instance variable
	 
	 static int matMarks=99; // static variable
	
	public static void socialmarks() {
		
		int telugumarks=95; // localvariable
		
		//System.out.println(socialmarks);
	}
	
	public void marks() {
		System.out.println(socialmarks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewClass.socialmarks();
		
		
	}

}
