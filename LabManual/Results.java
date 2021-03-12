package labAssignment;

public class Results {
	public static void main(String[] args) {
		int arr[][] = {
				{70,80,90,95},
				{75,92,87,71},
				{88,91,73,97}
		};
		int k = 1;
		for(int i[] : arr)
		{
			int total = 0;
			for(int j : i)
			{
				total += j;
			}
			System.out.println("Total marks of student - "+k+" "+"is"+" "+":"+" "+total);
			System.out.println("Percentage of student - "+k+" "+"is"+" "+":"+" "+total/arr[0].length+"%");
			k++;
			System.out.println();
		}
	}
}
