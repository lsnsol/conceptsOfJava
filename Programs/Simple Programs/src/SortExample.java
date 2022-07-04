
public class SortExample {
	public static void main(String[] args) {
		
		int arr[] = {56,32,12,26,42,91,86};
		
		int tmp;
		
		//bubble sort logic
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					//below code swaps arr[j] and arr[j+1]
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
}
