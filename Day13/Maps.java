package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {
		//Map<String, String> m = new HashMap<String, String>();
		Map<Employee1, String> m = new TreeMap<Employee1, String>((o1,o2)->{return o2.compareTo(o1);});
		m.put(new Employee1(200) , "Hello");
		m.put(new Employee1(400), "hii");
		m.put(new Employee1(100), "hyreffcdtr");
		
		System.out.println(m);
		Set<Map.Entry<Employee1, String>> s = m.entrySet();
		Iterator<Map.Entry<Employee1, String>> iter = s.iterator();
		while(iter.hasNext())
		{
			Map.Entry<Employee1, String> me = iter.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}
}
class Employee1 implements Comparable<Employee1>
{
	Integer eid;
	public Employee1(Integer x)
	{
		eid = x;
	}

	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return eid.compareTo(o.eid);
	}

	@Override
	public String toString() {
		return ""+eid;
	}
	
	
}