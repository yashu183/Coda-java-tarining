package labAssignment;

public class NumberOfObjCreated {
public static void main(String[] args) {
	Sample2 s = new Sample2();
	System.out.println(s.fun());
	Sample2 s2 = new Sample2();
	System.out.println(s.fun());
}
}

class Sample2
{
	static int numOfObj;
	public Sample2()
	{
		numOfObj++;
	}
	public int fun()
	{
		return numOfObj;
	}
}