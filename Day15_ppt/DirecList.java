package day15_ppt;

import java.io.File;

public class DirecList {
	public static void main(String[] args) {
		String s = "D:\\workspace\\java-ecllipse\\basicFromDay4\\testToCheckDirectory";
		File f = new File(s);
		System.out.println(f.getPath());
		if(f.isDirectory())
		{
			String[] arr = f.list();
			for(String s1 : arr)
			{
				System.out.println(s1);
			}
		}
		else
		{
			System.out.println("is not a directory");
		}
	}
}
