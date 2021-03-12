package labAssignment;

import java.util.Scanner;

public class LocationInArr {
	public static int locate(int[] arr, int q)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == q)
				return i;
		}
		return -1;
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
		System.out.println("enter the num location to be found");
		int q = sc.nextInt();
		System.out.println(locate(arr,q));
	}
}
