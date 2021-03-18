package day6;
//lambda used only in functional interfaces
//functional interface --> interface should have only one met
//marker interface --> interface with no method
public class LambdaDemo {
	public static void main(String[] args) {
		myInt myint=()->{
			System.out.println("Jst MyInt...");
		};
		myint.fun();
		
		myInt1 myint1=( i, s)->{
			System.out.println("got integer : "+i+" got string : "+s);
		};
		myint1.fun(10,"Yashu");
		
		myInt2 myint2 = (s)->{
			System.out.println("only string : "+s);
		};
		myint2.fun("Yashu");
		new LambdaDemo().myMethod(myint);
		
		myInt3 myint3 = (s)->{
			return "returnable string : "+s;
		};
		System.out.println(myint3.fun("Yashu"));
	}
	
	public void myMethod(myInt myint)
	{
		System.out.println("My Method is called");
		myint.fun();
	}
}

@FunctionalInterface
interface myInt
{
	public void fun();
	//public void fun1();
}

interface myInt1
{
	public void fun(int i, String s);
}

interface myInt2
{
	public void fun(String s);
}

interface myInt3
{
	public String fun(String s);
}