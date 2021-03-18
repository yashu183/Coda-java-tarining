package FunLabDay5;

import java.util.Scanner;

public class SeasonIfElse {
	public static void main(String[] args) {
		String[] s = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month");
		String ss = sc.nextLine();
		int q = 0;
		for(int i = 0; i < s.length; i++)
		{
			if(ss == s[i])
			{
				q = i;
			}
		}
		if(q >= 0 && q <= 2)
			System.out.println("Spring");
		else if(q >= 3 && q <= 5)
			System.out.println("Summer");
		else if(q >= 6 && q <= 8)
			System.out.println("Rainy");
		else
			System.out.println("Winter");
	}
}
