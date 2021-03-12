package labAssignment;

import java.util.Scanner;

public class StackInt {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number");
		int n = sc.nextInt();
		Stack s = new Stack(n);
		s.push(1);
		s.push(2);
		s.push(3);
	}
}


class Stack
{
	int size;
	int start = 0;
	public Stack(int n)
	{
		size = n;
	}
	int arr[] = new int[size];
	//Arrays.fill(arr,Integer.MAX_VALUE);
	public void push(int x)
	{
		arr[start] = x;
		start++;
	}
	public void pop()
	{
		for(int i = 0; i < start; i++)
		{
			arr[i] = arr[i+1];
		}
		start--;
	}
}