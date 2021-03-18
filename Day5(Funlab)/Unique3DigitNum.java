package FunLabDay5;

public class Unique3DigitNum {
	public static void main(String[] args) {
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
				for(int k = 0; k < 4; k++)
					if(i != j && i != k && j != k)
					{
						System.out.print(i+j+k+" ");
					}
		System.out.println();
		System.out.println(4*3*2);
	}
}
