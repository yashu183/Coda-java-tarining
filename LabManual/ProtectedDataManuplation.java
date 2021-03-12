package labAssignment;

public class ProtectedDataManuplation {
	public static void main(String[] args) {
		A q = new A();
		System.out.println("before manuplation");
		System.out.println(q.a);
		
		B b = new B();
		b.fun(q);
		System.out.println("After manup;lation");
		System.out.println(q.a);
	}
}

class A
{
	protected int a = 10;
	
}

class B
{
	public void fun(A q)
	{
		q.a = 100;
	}
}