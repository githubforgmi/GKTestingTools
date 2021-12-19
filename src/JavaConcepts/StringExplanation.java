package JavaConcepts;

public class StringExplanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Pavan123"; // no of characters  =string
			//		 01234567  //index
		
		char a='7';
		
		name.charAt(0); //p
		System.out.println(name.charAt(4));
		
		System.out.println(name.charAt(7));
		
		System.out.println(name.charAt(6));
		
		
		System.out.println(45/2);
		
		System.out.println(45%2);
		
		int i=19;
		
		if(i%2==0) {
			//even
		}else {
			//odd
		}
		
		
		// ++ increment
		// -- decrement 
		// 2++  3 3-- 2  2++  3++ 4
		// int a=10;   a--  9    a++  10  a++  11   a--   10
		
		System.out.println();
		
		int z=10;
		int b=20;
		
		if(z>b) {
			System.out.println("condition true, so if block executed");
		}else {
			System.out.println("condition false , so else block exceuted");
		}
		
		// iteration  b=20,  z=10;
		while(b>z) {
			
			//z++;
			System.out.println("condition true, so while block executed"+b);
			b--;
		}
		
		
		
		//variableitialization  condition  incr/decr
		//  1>1  false
		// p=10,  9  8  7  6  5 4 3 2 1
		for(int p=10;p>1;p--) {
			
			System.out.println(p);
		}
		
		
		
		
		

	}

}
