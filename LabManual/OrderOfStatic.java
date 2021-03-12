package labAssignment;

public class OrderOfStatic {
	public static void main(String[] args) {
		Static s = new Static();
	}
}

class Static
{
	static
	{
		System.out.println("static block 1");
	}
	static
	{
		System.out.println("static block 2");
	}
	public Static()
	{
		System.out.println("Const. called after static 1 and 2 but will run aftyer static 3");
	}
	static
	{
		System.out.println("static aftyer static 3 ..... 1 and 2 and const but will run before const..");
	}
}