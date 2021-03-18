package FunLabDay5;

public class ConstOverload {
	public static void main(String[] args) {
		Constr c = new Constr();
		Constr c1 = new Constr(1,2);
	}
}

class Constr
{
	int a, b, c;
	public Constr()
	{
		a = 0; b = 0; c = 0;
	}
	public Constr(int x, int y)
	{
		a = x;
		b = y;
		c = 1;
	}
}