package FunLabDay5;

import java.util.Scanner;

public class Calci {
	public static void main(String[] args) {
		int a, b;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First NUm");
		a = sc.nextInt();
		System.out.println("Enter Second NUm");
		b = sc.nextInt();
		System.out.println("Enter a operation to perform");
		c = sc.next().charAt(0);
		switch(c)
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		}
	}
}
