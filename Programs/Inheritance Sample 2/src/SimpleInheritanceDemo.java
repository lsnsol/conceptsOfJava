
class Base4
{
	int i,j;
	
	public Base4(){
		System.out.println("Base4() Constructor");
	}
	
	public void displayij()
	{
		System.out.println("i="+i+" j="+j);
	}
}

class Derived4 extends Base4
{
	int k;
	public Derived4(int x,int y,int z)
	{
		System.out.println("Derived4() Constructor");
		i = x;
		j = y;
		k = z;
	}
	
	
	public void displayValues()
	{	
		displayij();
		System.out.println("Value of k:"+k);
	}
}



public class SimpleInheritanceDemo {

	public static void main(String args[])
	{
		Derived4 obj = new Derived4(20,40,60);
		//Base4 bobj = new Base4();
		//obj.displayij();
		obj.displayValues();
	}
}
