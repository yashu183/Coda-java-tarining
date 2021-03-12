package labAssignment;

public class LargerInEachRow {
	public static void main(String[] args) {
		int arr[][] = {
				{70,80,90,95},
				{75,92,87,71},
				{88,91,73,97}
		};
		int k = 1;
		for(int i[] : arr)
		{
			int lar = 0;
			for(int j : i)
			{
				if(j > lar)
					lar = j;
			}
			System.out.println("The largest in the "+k+"is : "+lar);
			k++;
		}
	}
}
