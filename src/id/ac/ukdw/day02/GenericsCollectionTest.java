package id.ac.ukdw.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class GenericsCollectionTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("satu");
		myList.add("dua");
		myList.add(2,"seratus");
		System.out.println(myList);
		//tidak bisa kalau int
		//myList.add(new Integer(3));
		Map<Integer,String> myMap = new HashMap<Integer,String>();
		myMap.put(1, "satu");
		myMap.put(2, "dua");
		myMap.put(1, "haha");
		System.out.println(myMap.values());
		System.out.println(myMap.keySet());
		System.out.println(myMap.entrySet());
		
		//List<?> myList2 = new ArrayList<Integer>();
		//myList2.add(new Integer(1));
		DVDItem d1 = new DVDItem("a","b",1);
		DVDItem d2 = new DVDItem("b","c",2);
		DVDItem d3 = new DVDItem("c","d",3);
		
		List<DVDItem> list = new ArrayList<DVDItem>();
		list.add(d1); list.add(d2); list.add(d3);
		
		Collections.sort(list); //natural order
		Collections.sort(list,new DVDYearComparator());
		System.out.println(list);
		
		Integer[] ar = {1, 2, 1, 3};
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(ar));
		set.add(4);
		for (Integer element : set) {
		 System.out.print(element);
		}
		
		List list1 = new ArrayList<String>();
	}
}
