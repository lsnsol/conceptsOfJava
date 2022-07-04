
class OverloadDemo1 {
	int multiple, start, end;
	
	OverloadDemo1()
	{
		multiple = 1;
		start = 1;
		end = 10;
		System.out.println("OverloadDemo1()");
	}
	
	OverloadDemo1(int m)
	{
		multiple = m;
		start = 1;
		end = 10;
		
		System.out.println("OverloadDemo1(int m)");
	}
	
	OverloadDemo1(int m, int s, int e)
	{
		multiple = m;
		start = s;
		end = e;
		
		System.out.println("OverloadDemo1(int m, int s, int e)");
	}
	
	void printMultiples()
	{
		System.out.println("printing multiples...");
		int tmp;
		for(int i=start; i<=end;i++)
		{
			tmp = multiple*i;
			
			System.out.println(multiple+"X"+i+"="+tmp);
		}
	}
}

public class OverloadClass {
	public static void main(String[] args) {
		OverloadDemo1 obj = new OverloadDemo1();
		
		obj.printMultiples();
		
		System.out.println("----------------------------------");
		OverloadDemo1 obj1 = new OverloadDemo1(5,6,15);
		
		obj1.printMultiples();
	}
}
