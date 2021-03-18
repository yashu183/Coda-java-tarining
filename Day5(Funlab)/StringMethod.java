package FunLabDay5;

public class StringMethod {
	public static void main(String[] args) {
		String s = "Hello World";
		char c[] = s.toCharArray();
		int let = 0, num = 0, space = 0, oth = 0;
		for(char ch : c)
		{
			if(ch == ' ')
				space++;
			else if(Character.isDigit(ch))
				num++;
			else if(Character.isLetter(ch))
				let++;
			else
				oth++;
		}
		System.out.println("Letters : "+let);
		System.out.println("Numbers : "+num);
		System.out.println("spaces : "+space);
		System.out.println("Other chars : "+oth);
	}
}
