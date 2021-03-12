package labAssignment;

public class ReverseEachRow {
	public static void main(String[] args) {
		int arr[][] = {
				{70,80,90,95},
				{75,92,87,71},
				{88,91,73,97}
		};
		
		for(int i = 0; i < arr.length; i++)
		{
				int str = 0;
				int end = arr[i].length-1;
				while(str <= end)
				{
					int temp;
					temp = arr[i][str];
					arr[i][str] = arr[i][end];
					arr[i][end] = temp;
					str++;
					end--;
				}
		}
		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
