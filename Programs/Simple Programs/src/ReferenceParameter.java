class Temp{
	int i,j;
	
	Temp()
	{
		i = 11;
		j = 22;
		System.out.println("Temp() constructor");
	}
	
	void print()
	{
		System.out.println("i="+i+", j="+j);
	}
}

public class ReferenceParameter {
	public static void main(String[] args) {
		Temp mt = new Temp();
		mt.print();
		test(mt);
		mt.print();
	}
	
	static void test(Temp ot)
	{
		ot.i = 68;
		ot.j = 95;
	}
}
