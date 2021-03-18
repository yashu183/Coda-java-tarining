package FunLabDay5;

import java.util.Scanner;

public class SumOfDigi {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number");
		int n = sc.nextInt();
		int i = 0;
		int ans = 0;
		while(n>=10)
		{
			int temp;
			temp = n%10;
			n = n/10;
			ans += temp;
			i++;
		}
		ans += n;
		System.out.println(ans);
	}
}
