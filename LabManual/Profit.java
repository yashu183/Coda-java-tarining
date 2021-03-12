package labAssignment;

public class Profit {
	public static void main(String[] args) {
		float amount = 14000f;
		//40% profit in first year..
		amount += 2*amount/5;
		amount -= 1500;
		amount += 12*amount/100;
		System.out.println(amount);
	}
}
