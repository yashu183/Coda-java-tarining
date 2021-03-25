package day12;
import java.lang.*;
import java.util.*;
public class Strings {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hii";
		StringBuilder sb = new StringBuilder("BuilderString");
		sb.append("hai");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(sb);
		
		StringBuffer sbf = new StringBuffer("Before Buffer");
		sbf.append("Buffer String");
		System.out.println(sbf);
		
		StringJoiner sj = new StringJoiner(",");
		sj.setEmptyValue("It's an empty string");
		System.out.println(sj);
		sj.add("Yashu");
		sj.add("Yashwanth");
		System.out.println(sj);
	}
}
