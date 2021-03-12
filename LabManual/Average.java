package labAssignment;

import java.util.Scanner;

public class Average {
	public static float avg(int[] arr)
	{
		int ans = 0;
		for(int i = 0; i < arr.length; i++)
		{
			ans += arr[i];
		}
		return ans/arr.length;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			int temp = sc.nextInt();
			arr[i] = temp;
		}
		System.out.println(avg(arr));
	}
}
