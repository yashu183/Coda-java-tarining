package FunLabDay5;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a+" "+b+" ");
		int k = 0;
		while(k <= n-2)
		{
			c = a+b;
			System.out.print(c+" ");
			k++;
			a = b;
			b = c;
		}
	}
}
