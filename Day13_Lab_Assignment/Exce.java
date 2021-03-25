package day13_assignment;

import java.util.*;

public class Exce {
	public static void main(String[] args) {
		Set<Sample> s = new HashSet<Sample>();
		s.add(new Sample(12));
		s.add(new Sample(22));
		s.add(new Sample(26));
		s.add(new Sample(56));
		System.out.println(s);
		System.out.println(s.size());
	}
}

class Sample
{
	int x;
	Sample(int x)
	{
		this.x = x;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}