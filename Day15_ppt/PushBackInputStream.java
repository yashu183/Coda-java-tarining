package day15_ppt;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

public class PushBackInputStream {
	public static void main(String[] args) throws Exception {
		ByteArrayInputStream bais = new ByteArrayInputStream("supportStaff".getBytes());
		PushbackInputStream pis = new PushbackInputStream(bais);
		int ch;
		while((ch = pis.read()) != -1)
		{
			if((char)ch == 's')
				pis.unread('S');
			else
				System.out.println((char)ch);
		}
	}
}
