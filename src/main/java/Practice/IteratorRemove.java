package Practice;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Ambuj");
		names.add("Amit");
		names.add("Vinay");
		names.add("Shyam");
		
		System.out.println("Original List:");
		System.out.println(names);
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			if(name.startsWith("A")) {
				it.remove();
			}
		}
		  System.out.println("\nList after removing names starting with 'A':");
		  System.out.println(names);
		  
//		    Integer myInt = 5;
//		    Double myDouble = 5.99;
//		    Character myChar = 'A';
//		    System.out.println(myInt);
//		    System.out.println(myDouble);
//		    System.out.println(myChar);
		    Integer myInt = 5;
		    Double myDouble = 5.99;
		    Character myChar = 'A';
		    System.out.println(myInt.intValue());
		    System.out.println(myDouble.doubleValue());
		    System.out.println(myChar.charValue());
		    
		    Integer myInt1 =100;
		    String myString1 = myInt1.toString();
		    System.out.println(myString1);
	    
	}

}
