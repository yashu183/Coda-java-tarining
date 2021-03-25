package day13_assignment;

import java.awt.List;
import java.util.ArrayList;

public class Q1 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= 10; i++) { 
			ArrayList<Integer> row = new ArrayList<Integer>(); 
			for (int j = 0; j <= 10; j++) 
			row.add(i * j); 
			table.add(row); 
			} 
			for (ArrayList row : table) {
			System.out.println(row); 
			} 

	}
}
