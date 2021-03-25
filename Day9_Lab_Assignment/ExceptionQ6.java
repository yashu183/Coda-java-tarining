package day9_lab;

public class ExceptionQ6 {
	public static void main(String[] args) {
		
	}
}

class Parent
{
	public Parent() throws ArithmeticException
	{
		System.out.println("Parent const...");
		try {
		int i = 1/0;
		}finally {
			
		}
	}
}

class Child extends Parent
{
	public Child()
	{
//		catch(ArithmeticException e)
//		{
//			System.out.println("Exceptiopn catched...");
//		}
	}
}