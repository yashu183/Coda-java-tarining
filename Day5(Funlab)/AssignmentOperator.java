package FunLabDay5;

public class AssignmentOperator {
 public static void main(String[] args) {
	int add = 0, sub = 10, mul = 5, divi = 64;
	System.out.println("Before assigning "+"add : "+add+" sub : "+sub+" mul : "+mul+" div : "+divi);
	add += 234;
	sub -= 6;
	mul *= 76;
	divi /= 32;
	System.out.println("After assigning "+"add : "+add+" sub : "+sub+" mul : "+mul+" div : "+divi);
}
}
