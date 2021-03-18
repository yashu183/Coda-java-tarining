package FunLabDay5;

public class VolBox {
	public static void main(String[] args) {
		Box b = new Box(2,6,8);
		System.out.println(b.vol()+" is the vol of the box");
	}
}

class Box
{
	int l,b,h;
	public Box(int x, int y, int z)
	{
		l = x;
		b = y;
		h = z;
	}
	public int vol()
	{
		return l*b*h;
	}
}