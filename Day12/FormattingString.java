package day12;

public class FormattingString {
	public static void main(String[] args) {
		System.out.printf("%d numer is %s fav",5,"yashu");
		System.out.printf("\n%.5f",183.25692114);
		System.out.println();
		System.out.printf("%-10s%-10s%s","col1", "col2" ,"col3");
		System.out.println();
		System.out.printf("%10s%-10s%s","col1", "col2" ,"col3");
		System.out.println();
		fun(10,20,30,40,50);
	}
	public static void fun(int... i)
	{
		for(int num : i)
		{
			System.out.println(num);
		}
	}
}

