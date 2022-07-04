public class StudentDemo
{
	public static void main(String args[])
	{
	double marks[][] = new double[3][2];
	
	marks[0][0] = 38;
	marks[0][1] = 45;
	
	marks[1][0] = 68;
	marks[1][1] = 55;
	
	marks[2][0] = 78;
	marks[2][1] = 39;
	
	for(int i=0;i<marks.length;i++)
	{
		double sum =0;
		int j;
		for(j=0;j<marks[0].length;j++)
		{
			sum = sum + marks[i][j];
		}

		double avg = sum/j;
	int student_num = i+1;
	System.out.println("Avg marks of Student "+student_num+" is "+avg);
	}
	
	}
}