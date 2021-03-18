package FunLabDay5;

import java.util.Scanner;

public class EvenUptoRange {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Range");
		int n = sc.nextInt();
		System.out.println("Even numbers upto "+n+" are...");
		for(int i = 1; i <= n; i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
