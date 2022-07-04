
public class ArrayElementsApnd {
	
	public int[] aAppend(int xarr[], int zarr[])
	{
		int f_len = xarr.length + zarr.length;
		int arr3[] = new int[f_len];
		
		for(int i=0,j=0;i<f_len;i=i+2,j++)
		{
			arr3[i] = xarr[j];
			arr3[i+1] = zarr[j];
		}
		
		return arr3;
	}
	
public static void main(String args[])
{
	int arr1[] = {1,2,3,4,11};
	int arr2[] = {5,6,7,8,16};
	
	ArrayElementsApnd obj = new ArrayElementsApnd();
	
	int sarr[] = obj.aAppend(arr1, arr2);
	
	for(int i=0;i<sarr.length;i++)
	{
		System.out.print(sarr[i]+ "  ");
	}
}
}
