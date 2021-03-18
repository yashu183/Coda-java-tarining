package FunLabDay5;

import java.util.Scanner;

public class SwapArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i++)
		{
			int x = sc.nextInt();
			arr1[i] = x;
		}
		int[] arr2 = new int[n];
		for(int i = 0; i < n; i++)
		{
			int x = sc.nextInt();
			arr2[i] = x;
		}
		for(int i = 0; i < n; i++)
		{
			arr1[i] = arr1[i]+arr2[i];
			arr2[i] = arr1[i]-arr2[i];
			arr1[i] = arr1[i]-arr2[i];
		}
		for(int i : arr1)
		{
			System.out.print(i+' ');
		}
		for(int i : arr2)
		{
			System.out.print(i+' ');
		}
	}
}
