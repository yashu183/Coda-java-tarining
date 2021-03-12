package labAssignment;

import java.util.Scanner;

public class Occurance {
	public static void locate(int[] arr, int q)
	{ int w = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == q)
			{
				w  = 1;
				int y = i+1;
				System.out.println("the given ele is found at location : "+y);
				int count = 0;
				for(int j = 0; j < arr.length; j++)
				{
					if(arr[j] == q)
						count++;
				}
				System.out.println("The given element occurs "+count+" number of times.");
				break;
			}
		}
	if(w == 0)
		System.out.println("not found");
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
		locate(arr,q);
	}
}
