package FunLabDay5;

public class Pattern {
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= i; j++)
				System.out.print(j+" ");
		    System.out.println();
		}
		System.out.println();
		Zero z = new Zero();
		z.fun();
	}
}

class Zero
{
	public void fun()
	{
		for(int ii = 1; ii <= 4; ii++)
		{
			for(int jj = 1; jj <= ii; jj++)
				System.out.print("0 ");
		    System.out.println();
		}
	}
}