package day6;
import java.util.*;
public class IfElse {
	public static void main(String[] args) {
		S s = new S();
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter to pull the chain...");
			sc.next();
			s.pull();
		}
	}
}

class S{
	int state=0;
	public void pull() {
		switch(state) {
		case 0:{
			System.out.println("switch on state....");
			state=1;
			break;
		}
		case 1:{
			System.out.println("medium speed state....");
			state=2;
			break;
		}
		case 2:{
			System.out.println("high speed state.....");
			state=3;
			break;
		}
		case 3:{
			System.out.println("switch off state....");
			state=0;
			break;
		}
		}
	}
}