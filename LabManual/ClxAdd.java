package labAssignment;

public class ClxAdd {
	public static void main(String[] args) {
		Complex c = new Complex();
		c.set(1, 2);
		Complex c1 = new Complex();
		c1.set(4,5);
		System.out.println("before add");
		c.display();
		c1.display();
		c.add(c1);
		System.out.println("After Add");
		c.display();
	}
}

class Complex
{
	int real;
	int clx;
	public void set(int a, int b)
	{
		this.real = a;
		this.clx = b;
	}
	public void add(Complex c)
	{
		this.real += c.real;
		this.clx += c.clx;
	}
	public void display()
	{
		System.out.println(this.real+"+i"+this.clx);
	}
}