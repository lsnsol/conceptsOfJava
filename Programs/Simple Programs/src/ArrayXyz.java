
public class ArrayXyz {
	public static void main(String[] args) {
		int testa[][] = {{33,21,3},{23,28,32}};
		
		System.out.println("No. of rows:"+testa.length+
				"  No. of cols:"+testa[0].length);
		for(int i=0;i<testa.length;i++)
		{
			for(int j=0;j<testa[0].length;j++)
			{
				System.out.print(testa[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
