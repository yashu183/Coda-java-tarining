package FunLabDay5;

public class MetOverriding {
	public static void main(String[] args) {
		Child c = new Child();
		c.fun();
	}
}

class Parent
{
	int a = 10;
	public void fun()
	{
		System.out.println(a);
	}
}

class Child extends Parent
{
	int a = 100;
	public void fun()
	{
		System.out.println(a);
		super.fun();
	}
}