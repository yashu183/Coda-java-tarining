package FunLabDay5;

public class ArthematicOverload {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		Arthematic.met(a);
		System.out.println(Arthematic.met(a,b));
	}
}

class Arthematic
{
	public static void met(int a)
	{
		System.out.println(a+5);
	}
	public static int met(int a, int b)
	{
		return a*b;
	}
}