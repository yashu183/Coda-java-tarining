package FunLabDay5;

import java.util.Scanner;

public class AvgOfOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Range");
		int n = sc.nextInt();
		System.out.print("Avg of Odd numbers upto "+n+" is : ");
		int count = 0;
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			if(i%2 != 0)
			{
				sum += i;
				count++;
			}
		}
		System.out.print(sum/count);
	}
}
