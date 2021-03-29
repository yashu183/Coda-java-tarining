package day15_ppt;

import java.io.File;
import java.io.FilenameFilter;

import javax.swing.filechooser.FileFilter;

public class FilterDemo {
	public static void main(String[] args) {
		File f = new File("D:\\workspace\\java-ecllipse\\basicFromDay4\\testToCheckDirectory");
		String s = "sample ";
		//FilenameFilter fnf;
		FilenameFilter fnf = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith("txt");
			}
		};
		String[] arr = f.list(fnf);
		for(String s1 : arr)
		{
			System.out.println(s1);
		}
	}
}
