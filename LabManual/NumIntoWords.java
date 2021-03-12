package labAssignment;

import java.util.Scanner;

public class NumIntoWords {
	public static void main(String[] args) {
		String[] arr = {"zero","one","two","three",":four","five","six","seven","eight","nine"};
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number");
		int n = sc.nextInt();
		int arrs[] = new int[10];
		int i = 0;
		while(n>=10)
		{
			int temp;
			temp = n%10;
			n = n/10;
			arrs[i] = temp;
			i++;
		}
		arrs[i] = n;
		String ans = "";
		for(int j = arrs.length-1; j >= 0; j--)
		{
			if(arrs[j] != 0)
			{
				ans += arr[arrs[j]]+" ";
			}
		}
		System.out.println(ans);
	}
}
