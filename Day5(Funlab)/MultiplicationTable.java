package FunLabDay5;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number");
		int n = sc.nextInt();
		int w = 1;
		do
		{
			System.out.println(n+" "+"x"+" "+w+" "+"="+" "+n*w);
			w++;
		}while(w <= 10);
	}
}
