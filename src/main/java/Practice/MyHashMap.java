package Practice;
import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
	public static void main(String[] args) {	
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("India", "New Delhi");
		capitalCities.put("USA", "Washington D.C");
		capitalCities.put("Japan", "Tokyo");
		System.out.println(capitalCities);
		
		for(Map.Entry<String, String> entry: capitalCities.entrySet()) {
			System.out.println("Country:" + entry.getKey() + ", Capital: " + entry.getValue());
		}
		
		for(String key: capitalCities.keySet()) {
			System.out.println("Country:" + key + ", Capital: " +  capitalCities.get(key));
		}
		
		for(String capital: capitalCities.values()) {
			System.out.println("Capital:" + capital);
		}
		for(String key: capitalCities.keySet()) {
			System.out.println("Country:" + key);
		}
		System.out.println(capitalCities.size());
		System.out.println(capitalCities.remove("England"));
		System.out.println(capitalCities);
	}
}
