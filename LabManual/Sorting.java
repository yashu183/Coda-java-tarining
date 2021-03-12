package labAssignment;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = {2,5,1,7,9,3,4,6,8};
	
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int tmp = 0;  
				if (arr[i] > arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}
			}  
		}
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
