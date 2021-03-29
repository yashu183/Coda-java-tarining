package day15_ppt;

import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;
import java.io.StringBufferInputStream;

public class SequenceInputStreamDemo {
	public static void main(String[] args) throws Exception {
		StringBufferInputStream sbis = new StringBufferInputStream("StringBuffer");
		ByteArrayInputStream bais = new ByteArrayInputStream("ByteArray".getBytes());
		SequenceInputStream sis = new SequenceInputStream(sbis,bais);
		int x;
		while((x = sis.read()) != -1)
		{
			System.out.println((char)x);
		}
	}
}
