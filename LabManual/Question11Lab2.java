package labAssignment;

public class Question11Lab2 {
	C2 c = new C2();
}

class A2
{
	int a2;
	public A2(int x)
	{
		a2 = x;
		System.out.println("const of A");
	}
}

class B2
{
	int b2;
	public B2(int x)
	{
		b2 = x;
		System.out.println("const of B");
	}
}

class C2 extends A2
{
	public C2()
	{
		super(5);
		B2 b = new B2(10);
	}
}