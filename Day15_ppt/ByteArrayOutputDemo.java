package day15_ppt;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputDemo {
	public static void main(String[] args) throws Exception {
		String s = "asdfghjkl";
		byte[] b = s.getBytes();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(b);
		byte[] ba = baos.toByteArray();
		for(byte q : ba)
		{
			System.out.println((char)q);
		}
	}
}
