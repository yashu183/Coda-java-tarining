package FunLabDay5;

import java.util.Scanner;

public class AreaAndPeri {
	public static void main(String[] args) {
		int sqSide;
		int base, height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of a square");
		sqSide = sc.nextInt();
		System.out.println("Entre base of triangle");
		base = sc.nextInt();
		System.out.println("Enter height of triangle");
		height = sc.nextInt();
		int s1,s2;
		System.out.println("Enter remaining 2 sides of triangle");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		System.out.println("Area of Square : "+sqSide*sqSide);
		System.out.println("Perimeter of Square : "+4*sqSide);
		System.out.println("Area of Triangle : "+base*height/2);
		int x = s1+s2+base;
		System.out.println("Perimeter of Triangle : "+x);
	}
}
