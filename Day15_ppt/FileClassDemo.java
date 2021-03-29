package day15_ppt;

import java.io.File;

//getName(), getPath(), canWrite(), isDirectory(), isExists()

public class FileClassDemo {
	public static void main(String[] args) {
		File f = new File("abcNew.txt");
		System.out.println("File Name : "+f.getName());
		System.out.println("File Path : "+f.getPath());
		System.out.println("Exists : "+f.exists());
		System.out.println("Directory : "+f.isDirectory());
		System.out.println("Can write : " + f.canWrite());
		
		//rename
		File f1 = new File("abcNew1.txt");
		System.out.println("rename successful : " + f.renameTo(f1));
		
		//delete
		System.out.println("Deleted : "+f1.delete());
	}
}
