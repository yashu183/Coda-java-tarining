package day9;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Before exception .....");
		//int i = 1/0; //arthematic exception
		try
		{
			//int i = 1/Integer.parseInt("0");
			System.out.println(args[0]);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}catch(Exception ge)
		{
			System.out.println(ge);
		}
		System.out.println("After the exception....");
	}
}
