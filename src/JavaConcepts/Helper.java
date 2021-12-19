package JavaConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Helper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//char only one letter or one digit or one symbol
		
		// variable == single value
		int a =100;
		
		//Arrays  == to store multiple values of same datatype  {10,20}
		//10,20,30,40,50
		
		int s[] = {10,20,30,40,50,60,70,80,90};
		
		String name1[] = {"raju","thulasi","pavan","narasimha","sudheer"};
		
		System.out.println( name1.length);
		
		
		// to store multiple objects == list
		
		List<Object>  ls = new ArrayList<>();
		ls.add("Pavan");  // index 0
		ls.add(1);   // index 1
		ls.add('1');  // index 2
		ls.add(30.67);  // index 3
		
		System.out.println(ls.get(3));
		
		System.out.println(ls.size());
		
		List<Integer>  integerls = new ArrayList<>();
		
		integerls.add(1);
		
		List<String>  sls = new ArrayList<>();
		
		sls.add("vijay");
		
		
		String name="Vijay";  // a - lower case
		String anothername="Vijayabcd";  // A - upper case
		
		//System.out.println(anothername.length());
		
		//equals
		//equalsIgnorecase
		//contains
		//charAt
		
		// integer value comparision 2==2  1/2==1  double equalto
		// string comparision equals method
		
		
		if(name.contains(anothername)) {
			
			System.out.println("both names are equal");
			
		}else {
			System.out.println("else exceuted, because both names are not equal");
		}
		
		
	
		
		
		List<String>  listValues=new ArrayList<String>();
		
		listValues.add("abc");
		listValues.add("abc");
		listValues.add("abc");
		listValues.add("abc");
		listValues.add("abcd");
		
		
		
		
		Set<String> hs=new HashSet<String>();
		hs.add("abc");
		hs.add("abc");
		hs.add("abc");
		hs.add("abcd");
		hs.add("abcd");
		
		//for(String a:hs) {
			//System.out.println(a);
		//}
		
		

	}

}
