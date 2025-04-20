package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
//import java.util.Map.Entry;
//import java.util.Collections;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("India", "New Delhi");
        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("France", "Paris");

        // ✅ Sort by Keys using TreeMap
        Map<String, String> sortedByKey = new TreeMap<>(capitalCities);
        System.out.println("✅ Sorted by Keys:");
        for (Map.Entry<String, String> entry : sortedByKey.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println(); // Line break for clarity

        // ✅ Sort by Values using List + Comparator
        List<Map.Entry<String, String>> entries = new ArrayList<>(capitalCities.entrySet());
        entries.sort(Map.Entry.comparingByValue());

        System.out.println("✅ Sorted by Values:");
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
