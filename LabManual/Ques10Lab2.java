package labAssignment;

public class Ques10Lab2 {
	public static void main(String[] args) {
		C c = new C();
	}
}

class A1
{
	public A1()
	{
		System.out.println("const of A");
	}
}

class B1
{
	public B1()
	{
		System.out.println("const of B");
	}
}

class C extends A1
{
	B1 b = new B1();
}