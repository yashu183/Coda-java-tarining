package day9_lab;

public class ExceptionQ5 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			arr[0] = 5;
			throw new ArrayAssign();
		}catch(Exception e)
		{
			
		}
		finally {
			System.out.println("Finally.....");
		}
	}
}
//unhandled exception...