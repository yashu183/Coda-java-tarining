package day9_lab;

import java.util.Scanner;

public class ExceptionQ9 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			try {
			int x = Integer.parseInt(sc.next());
			if(x < 0)
				throw new NegativeNum();
			if(x > 100)
				throw new OutOfRange();
			}catch(ArithmeticException e)
			{
				System.out.println("Pls Enter the Integer...");
				i--;
			}catch(NegativeNum nn)
			{
				System.out.println("pls enter positive integer... marks cant be neagtive..");
			}catch(OutOfRange or) {
				System.out.println("Marks cant be greayter than 100 .. pls enter again");
			}
		}
		int ans = 0;
		for(int i : arr)
		{
			ans += i;
		}
		System.out.println("Average of marks is : "+ans/10);
	}
}

class NegativeNum extends Exception
{
	
}

class OutOfRange extends Exception
{
	
}