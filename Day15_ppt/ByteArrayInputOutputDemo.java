package day15_ppt;

import java.io.ByteArrayInputStream;

public class ByteArrayInputOutputDemo {
	public static void main(String[] args) {
		String s = "abcdefghijkl";
		byte[] b = s.getBytes();
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		ByteArrayInputStream bais1 = new ByteArrayInputStream(b, 0, 5);
		
		int c;
		while((c = bais.read()) != -1)
		{
			System.out.print((char)c);
		}
		System.out.println();
		
		while((c = bais1.read()) != -1)
		{
			System.out.print((char)c);
		}
		//System.out.println(bais.mark(c));
		bais.reset();
	}
}
