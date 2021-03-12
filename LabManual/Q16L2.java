package labAssignment;

public class Q16L2 {
public static void main(String[] args) {
	 X x1 = new X(); 
	 X x2 = new Y();
	 Y y1 = new Y();
	 x2.do2();
}
}

class X { 
	void do1() {
		
	} 
	void do2()
	{}
	
}

class Y extends X 
{
	void do2() {
		
	}
} 