package day9_lab;

import java.util.Scanner;

public class ExceptionQ8 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			try {
			arr[i] = Integer.parseInt(sc.next());
			}catch(Exception e)
			{
				System.out.println("Pls Enter the Integer...");
				i--;
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
