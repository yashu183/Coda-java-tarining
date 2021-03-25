package day13_assignment;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Q3 {
	public static void main(String[] args) {
		before();
	}
	
	public static void before() { 
		Set set = new TreeSet(); 
		set.add("2"); 
		set.add(3); 
		set.add("1"); 
		Iterator it = set.iterator();
		while (it.hasNext()) 
			System.out.print(it.next() + " ");
	}
}
