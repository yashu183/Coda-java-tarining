package day13_assignment;
import java.util.*;
public class Q14 {
	public static void main(String[] args) {
		// INSERT DECLARATION HERE 
		List<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= 10; i++) { 
		ArrayList<Integer> row = new ArrayList<Integer>(); 
		for (int j = 0; j <= 10; j++) 
		row.add(i * j); 
		table.add(row); 
		} 
		for (List<Integer> row : table) 
		System.out.println(row); 
	}
}
