
class Base5
{
	protected int i,j;
	
	/*public Base5()
	{
		System.out.println("Base()");
	}*/
	
	public Base5(int i,int j)
	{
		this.i = i;
		this.j = j;
		System.out.println("Base5(int i,int j)");
	}
}

class Derived5 extends Base5
{
	int k;
	public Derived5(int x,int y,int z)
	{
		super(x,y);
		i = x;
		j = y;
		k = z;
		
		System.out.println("Derived5(int x,int y,int z)");
	}
	
	//super cannot be used in static methods
	/*static void abc(){
		super.i = 30;
	}*/
}



public class ProtectedDemo {

	public static void main(String args[])
	{
		Derived5 obj = new Derived5(20,40,60);
	}
}
