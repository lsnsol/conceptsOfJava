//Array Demo
public class BasicArray {
	
	public static void main(String args[])
	{
		double marks[] = new double[5];
		//array declaration
		//memory is allocated for 5 double s sequentially
		
		double sum=0;
		
		marks[0] = 23;
		marks[1] = 46;
		marks[2] = 36;
		marks[3] = 63;
		marks[4] = 42;
		
		System.out.println("Marks size:"+marks.length);
		System.out.println("Students Marks, as below");
		//marks.length gives length of marks array
		//i..e number of elements in array
		for(int i=0;i<marks.length;i++)
		{
			sum = sum + marks[i];
			System.out.println("Student "+i+" marks:"+marks[i]);
		}
		
		System.out.println("Sum of marks is "+sum);
	}
}
