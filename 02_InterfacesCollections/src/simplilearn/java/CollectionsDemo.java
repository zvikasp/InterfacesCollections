package simplilearn.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionsDemo {

	public static void main(String[] args) {
		// creating ArrayList
		System.out.println("ArrayList");
		ArrayList<String> city = new ArrayList<>();
		city.add("Bangalore");
		city.add("Delhi");
		System.out.println(city);

		// creating Vector
		System.out.println("\nVector");
		Vector<Integer> vec = new Vector<>();
		System.out.println("Vector Capacity: " + vec.capacity());
		vec.addElement(15);
		vec.addElement(30);
		System.out.println(vec);
		System.out.println("Vector Capacity: " + vec.capacity());

		// creating LinkedList
		System.out.println("\nLinked List");
		LinkedList<String> names = new LinkedList<>();
		names.add("Mary");
		names.add("Hari");
		Iterator<String> itr = names.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		// creating HashSet
		System.out.println("\nHashSet");
		HashSet<Integer> set = new HashSet<>();
		set.add(101);
		set.add(103);
		set.add(102);
		set.add(104);
		System.out.println(set);

		// creating LinkedHashSet
		System.out.println("\nLinkedHashSet");
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(11);
		set2.add(13);
		set2.add(12);
		set2.add(14);
		System.out.println(set2);
	}
}
