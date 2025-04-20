package Practice;
import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Ambuj");
		names.add("Vibhu");
		names.add("kaku");
		names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        Iterator<String> it= names.iterator();
        
        while(it.hasNext()) {
        	String name = it.next();
        	System.out.println(name);
        }
		
	}

}
