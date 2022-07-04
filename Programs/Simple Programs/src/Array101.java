
public class Array101 {
	public static void main(String args[])
	{
		int marks[] = new int[10];
		int i;
		
		int total = 0;
		
		System.out.println("Assigning values to elements...");
		for(i=0;i<marks.length; i=i+1)
		{
			marks[i] = 23*i;
		}
		
		for(i=0;i<marks.length;i++)
		{
			//System.out.println("Element No "+i+":"+marks[i]);
			System.out.print(marks[i]+" ");
			total = total + marks[i]; //+ is addition here
		}
		
		//+ is concatenation
		System.out.println("\nTotal marks secured:"+total);
	}
}
