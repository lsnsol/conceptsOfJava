
public class TwoDArrayOperations {
	public static void main(String[] args)
	{
		double area[][] = {{25,28,94},{56.3,23.1,38.3}};
		
		int sum =0;
		for(int i=0;i<area.length;i++) //controls row number
		{
			for(int j=0;j<area[i].length;j++) //controls column number
			{
				System.out.println(area[i][j]+" ");
			}
			
			//System.out.println();
		}
		
	}
}
