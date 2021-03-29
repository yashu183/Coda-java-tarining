package day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectReadWrite {
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee();
		emp.setSal(1000);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.dat"));
		
		System.out.println("before modification : "+emp.getSal());
		oos.writeObject(emp);
		
		emp.setSal(20000);
		System.out.println("After modification : "+emp.getSal());
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.dat"));
		emp = (Employee)ois.readObject();
		
		System.out.println("restored : "+emp.getSal());
		
	}
}

class Employee implements Serializable
{
	int sal;
	public void setSal(int sal)
	{
		this.sal = sal;
	}
	
	public int getSal()
	{
		return sal;
	}
}