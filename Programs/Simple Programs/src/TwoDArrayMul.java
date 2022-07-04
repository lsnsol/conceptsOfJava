
public class TwoDArrayMul {
	public static void main(String[] args) {
		int a[][] ={{1,2},{3,4}};
		int b[][] ={{25, 24},{12,15}};
		int c[][] ={{0,0},{0,0}};
 		for(int i=0;i<2;i++)
		{
			for(int k=0;k<2;k++)
			{
				for(int j=0;j<2;j++)
				{
					c[i][k] += a[i][j]*b[j][k];
				}
			}
		}
 		
 		
 		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
