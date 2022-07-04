
class Xyz99{
	int arr[];
	Xyz99()
	{
	arr= new int[10000000];
	}
}

public class OutOfMemoryEg {
	public static void main(String[] args) {
		Xyz99 oxyz[] = new Xyz99[10000];
		
		for(int i=0;i<oxyz.length;i++)
		{
			oxyz[i] = new Xyz99();
		}
	}
}
