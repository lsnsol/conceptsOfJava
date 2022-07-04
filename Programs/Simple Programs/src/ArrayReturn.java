
public class ArrayReturn {
	public static void main(String[] args) {
		int arr[] = { 23,9,11,42,3,65,4};
		
		int brr[] = sortArray(arr);
		
		for(int k=0;k<brr.length;k++)
		{
			System.out.print(brr[k]+"  ");
		}
	}
	
	static int[] sortArray(int parr[])
	{
		int tmp;
		for(int i=0;i<parr.length;i++)
		{
			for(int j=0;j<parr.length-1;j++)
			{
				if(parr[j]>parr[j+1])
				{
					tmp = parr[j];
					parr[j] = parr[j+1];
					parr[j+1] = tmp;
				}
			}
		}
		
		return parr;
	}
}
