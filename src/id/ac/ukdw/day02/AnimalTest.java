package id.ac.ukdw.day02;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal a = new Animal();
		Animal as  = new Spider();
		as.eat();
		as.walk();
		
		Animal ac = new Cat();
		ac.eat();
		ac.walk();
		//ac.play();
		
		if(ac instanceof Cat){
			Cat c = (Cat) ac;
			c.setName("Tom");
			c.play();
			System.out.println(c.getName());
		}
		
		Set mySet = new HashSet();
		mySet.add("satu");
		mySet.add("dua");
		mySet.add("dua");
		mySet.add(new Integer(3));
		mySet.add(new Integer(3));
		System.out.println(mySet);
		
		List myList = new ArrayList();
		myList.add("satu");
		myList.add("dua");
		myList.add("satu");
		System.out.println(myList);
		
		Map myMap = new HashMap();
		myMap.put("key 1", "element 1");
		myMap.put("key 2", new Integer(10));
		myMap.put("key 2", new Double(2.0));
		System.out.println(myMap.values());
		System.out.println(myMap.keySet());
		System.out.println(myMap.entrySet());
		System.out.println(myMap); // sama dgn entri set tapi {
	
		Hari h = Hari.SENIN;
		for(Hari x : Hari.values()){
			System.out.println(x.getAlias());
		}
	}

}
