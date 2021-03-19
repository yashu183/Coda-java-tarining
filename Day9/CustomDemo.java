package day9;

public class CustomDemo {
	public static void main(String[] args) throws CustomException {
		test t = new test();
		System.out.println("Before");
		t.doTest();
		System.out.println("After");
	}
}

class test
{
	public void doTest() throws CustomException
	{
		throw new CustomException("custom msg by yashu");
	}
}