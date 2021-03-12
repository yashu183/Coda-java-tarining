package labAssignment;

public class FinalRefVar {
	public static void main(String[] args) {
		final Final f = new Final(); //final reference obj 
		Final f1 = new Final();
		//f = f1; // cant be done bcz f fis final cannot be reassigned or rereferenced
		System.out.println(f.fun());
		//but the feilds that obj(final) is refering to can be changed
		//changing 10 to 100
		f.funSet(100);
		System.out.println(f.fun());
	}
}

class Final
{
	int q = 10;
	public int fun()
	{
		return q;
	}
	public void funSet(int x)
	{
		q = x;
	}
}