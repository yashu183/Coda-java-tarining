package FunLabDay5;

public class reverseAstring {
	public static void main(String[] args) {
		char[] s = {'Y','a','s','h','u'};
		int str = 0;
		int end = s.length-1;
		while(str <= end)
		{
			char c = s[str];
			s[str] = s[end];
			s[end] = c;
		}
		for(char i : s)
		{
			System.out.print(i+" ");
		}
	}
}
