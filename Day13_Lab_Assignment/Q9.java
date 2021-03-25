package day13_assignment;
import java.util.*;
public class Q9 {
	public static void main(String[] args) {
		Object o = new Object(); 
		// insert code here 
		// Set s = new HashSet();
	// 	TreeSet s = new TreeSet();  classCastException...
		LinkedHashSet s = new LinkedHashSet(); 

		s.add(o);
		s.add("o"); 
		System.out.println(s);
	}
}
