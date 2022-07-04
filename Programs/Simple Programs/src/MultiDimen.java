public class MultiDimen {

	public static void main(String[] args)
	{
		//float array with 3 rows, 2 columns
		float  arr[][] = new float[3][2];
		
		//double[][] barr = {{2.3,3.4},{4.6,6.5}};
		arr[0][0] = 35.4f;
		arr[0][1] = 68.3f;
		
		arr[1][0] = 53.2f;
		arr[1][1] = 68.3f;
		
		arr[2][0] = (float)45.7;//Type Casting
		arr[2][1] = 78.3f;

		float total = 0, all_total = 0;
		System.out.println("Rows:"+ arr.length);//number of rows
		System.out.println("Cols:"+ arr[0].length);//number of columns
		
		for(int i=0;i<arr.length;i++)//to iterate thru rows
		{
			total = 0;
			
			System.out.print("Marks of student:"+i+"   ");
			for(int j=0;j<arr[0].length;j++)//to iterate thru columns
			{
				System.out.print(arr[i][j]+" ");
				
				total = total + arr[i][j];
			}
			
			all_total = all_total + total;
			System.out.println("Total marks:"+total);
		}
		
		System.out.println("Total of all Marks:"+all_total);
		
		
	}
}
