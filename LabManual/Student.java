package labAssignment;

public class Student {
	public static void main(String[] args) {
		
	}
}

class Student1
{
	String name;
	int rollNum;
}

class Exam extends Student1
{
	int s1, s2, s3;
}

class Result extends Exam
{
	int totalMarks;
	public int fun()
	{
		return s1+s2+s3;
	}
}