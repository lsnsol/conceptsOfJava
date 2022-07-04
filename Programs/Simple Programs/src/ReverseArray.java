public class ReverseArray {
public static void main(String args[])
{
	int marks[] = {10,20,30,40,50,60,70};
	
	int tmp, n = marks.length;
	
	for(int i=0;i<n/2;i++)
	{
		tmp = marks[i];
		marks[i] = marks[n-i-1];
		marks[n-i-1] = tmp;		
	}
	
	for(int i=0;i<n;i++)
	{
		System.out.print(marks[i]+" ");
	}
}
}
