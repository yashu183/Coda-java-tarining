package day9_lab;

public class ExceptionQ4 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			arr[0] = 5;
			throw new ArrayAssign();
		}catch(Exception e)
		{
			System.out.println("Array Assign not possible.... Exception Thrown/....");
		}
	}
}

class ArrayAssign extends Exception
{
	
}