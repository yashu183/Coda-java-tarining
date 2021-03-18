package FunLabDay5;

public class BiggestAmong3 {
	public static void main(String[] args) {
		int a = 12, b = 23, c = 4;
		if(a > b && a > c)
			System.out.println("A is bigger : "+a);
		else if(b > c)
			System.out.println("B is bigger : "+b);
		else
			System.out.println("C is bigger : "+c);
	}
}
