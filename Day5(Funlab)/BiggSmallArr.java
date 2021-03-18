package FunLabDay5;

import java.util.Scanner;

public class BiggSmallArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			int x = sc.nextInt();
			arr[i] = x;
		}
		int lar = Integer.MIN_VALUE;
		int sma = Integer.MAX_VALUE;
		for(int i : arr)
		{
			if(i > lar)
				lar = i;
			if(i < sma)
				sma = i;
		}
		System.out.println("small : "+sma+" large : "+lar);
	}
}
