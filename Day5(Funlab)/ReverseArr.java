package FunLabDay5;

import java.util.Scanner;

public class ReverseArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			int x = sc.nextInt();
			arr[i] = x;
		}
		for(int i = n-1; i >= 0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
