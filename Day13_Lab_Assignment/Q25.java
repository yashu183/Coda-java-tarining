package day13_assignment;
import java.util.*;
public class Q25 {
	public static void main(String[] args) {
		// INSERT DECLARATION HERE
		//List<List<Integer>> table = new List<List<Integer>>();
		ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();
		//List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();
		//List<List, Integer> table = new List<List, Integer>();
		//List<List, Integer> table = new ArrayList<List, Integer>();
		//List<List, Integer> table = new ArrayList<ArrayList, Integer>();
		for (int i = 0; i <= 10; i++) {
		ArrayList<Integer> row = new ArrayList<Integer>();
		for (int j = 0; j <= 10; j++)
		row.add(i * j);
		table.add(row);
		for (List<Integer> row1 : table)
		System.out.println(row1);
	}
}

/*
 * or List<List<Integer>> table = new ArrayList<List<Integer>();
 *    List<Integer> row = new ArrayList<Integer>(); 
 */
*/