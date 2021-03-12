package labAssignment;

public class QuadEqu {
	public static void main(String[] args) {
		Quad q = new Quad(2,3,4);
		System.out.println(q.execute(10));
	}
}

class Quad
{
	int a,b,c;
	public Quad(int x,int y, int z)
	{
		a = x;
		b = y;
		c = z;
	}
	public Quad()
	{
		a = 1;
		b = 1;
		c = 1;
	}
	public int getA()
	{
		return a;
	}
	public int getB()
	{
		return b;
	}
	public int getC()
	{
		return c;
	}
	public void setVal(int x,int y, int z)
	{
		a = x;
		b = y;
		c = z;
	}
	public int execute(int x)
	{
		return ((x*x)*a)+(b*x)+c;
	}
}