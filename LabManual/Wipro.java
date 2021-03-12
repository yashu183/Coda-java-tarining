package labAssignment;

public class Wipro {
	public static void main(String[] args) {
		WiproBase[] w = new WiproBase[3];
		WiproTechnologies wt = new WiproTechnologies();
		WiproInfotech wi = new WiproInfotech();
		WiproBPO wb = new WiproBPO();
		w[0] = wt;
		w[1] = wi;
		w[2] = wb;
		w[1].fun();
	}
}

class WiproBase
{
	public void fun()
	{
		System.out.println("Welcome to Wipro");
	}
}

class WiproTechnologies extends WiproBase
{
	public void fun()
	{
		System.out.println("Welcome to WiproTechnologies");
	}
}

class WiproInfotech extends WiproBase
{
	public void fun()
	{
		System.out.println("Welcome to WiproInfotech");
	}
}

class WiproBPO extends WiproBase
{
	public void fun()
	{
		System.out.println("Welcome to WiproBPO");
	}
}