package day13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//tree set - sorted order ---- for larger collection
//hash set - unsorted order-- for shorter collection
public class SetCollection {
	public static void main(String[] args) {
		//Set<String> s = new HashSet<String>();
		Set<Student> s = new TreeSet<Student>((o1,o2)->{return o2.compareTo(o1);});
		s.add(new Student(878687));
		s.add(new Student(24255));
		s.add(new Student(565743));
		s.add(new Student(4567));
		
		System.out.println(s);
	}
}

class Student implements Comparable<Student>
{
	Integer marks;
	public Student(Integer marks)
	{
		this.marks = marks;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.marks.compareTo(marks);
	}
	@Override
	public String toString() {
		return ""+marks;
	}
	
	
}