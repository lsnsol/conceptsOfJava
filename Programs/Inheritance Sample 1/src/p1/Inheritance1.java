package p1;

class Base1
{
	int i,j;
	
	public Base1(){ System.out.println("Base1() cons");}
	
	public void show()
	{
		System.out.println(" (Base1)values of i and j:"+i+" "+j);
	}
}


class Derived1 extends Base1
{
	int k;
	
	public Derived1(int x,int y, int z)
	{
		System.out.println("Derived1() Cons");
		i = x;
		j = y;
		k = z;
		
	}
	
	public void show()
	{
		System.out.println(" (Derived)values ar e"+i+" "+j+" "+k);
	}
}


public class Inheritance1 {
	public static void main(String args[])
	{
		Derived1 obj = new Derived1(10,20,30);
		
		//obj.show();
		
		obj.show();
	}
}
