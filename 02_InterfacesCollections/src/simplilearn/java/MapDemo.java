package simplilearn.java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		// HashMap
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Tim");
		hm.put(2, "Mary");
		hm.put(3, "John");

		System.out.println("\nThe elements of Hashmap are ");
		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// HashTable
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(4, "Alice");
		ht.put(5, "Mike");
		ht.put(6, "Rose");
		ht.put(7, "Tom");

		System.out.println("\nThe elements of HashTable are ");
		for (Map.Entry<Integer, String> m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// TreeMap
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Annie");
		map.put(9, "Carlotte");
		map.put(10, "Catie");

		System.out.println("\nThe elements of TreeMap are ");
		for (Map.Entry<Integer, String> l : map.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}

	}

}
