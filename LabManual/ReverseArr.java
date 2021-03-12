package labAssignment;

import java.util.Scanner;

public class ReverseArr {
	public static void reverse(int[] arr)
	{
		int str = 0;
		int end = arr.length-1;
		while(str <= end)
		{
			int temp;
			temp = arr[str];
			arr[str] = arr[end];
			arr[end] = temp;
			str++;
			end--;
		}
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
		reverse(arr);
		for(int i : arr)
		{
			System.out.println(i);
		}
	}
}
