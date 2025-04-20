package Practice;
import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<>();
		  cars.add("Volvo");
		  cars.add("BMW");
		  cars.add("Ford");
		  cars.add("BMW");
		  cars.add("Mazda");
		  System.out.println(cars);
		  System.out.println(cars.contains("Mazda"));
		  cars.remove("Ford");
		  System.out.println(cars);
		  System.out.println(cars.size());
		  for (String i : cars) {
			  System.out.println(i);
			}
		  
		  HashSet<Integer> numbers = new HashSet<>();
		  numbers.add(4);
		  numbers.add(7);
		  numbers.add(8);
		  
		 System.out.println(numbers);
		 
		 for (int i = 1; i <= 10; i++) {
			if(numbers.contains(i)) {
				System.out.println(i + " was found in the set.");
			}else {
				System.out.println(i + " was not found in the set.");
			}
			
		}
		  
	}

}
