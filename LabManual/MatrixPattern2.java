package labAssignment;

public class MatrixPattern2 {
	public static void main(String[] args) {
		int arr[][]= {
				{1},
				{2,3},
				{4,5,6},
				{7,8,9,10}
		};
		
		for(int i[] : arr)
		{
			for(int j : i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
