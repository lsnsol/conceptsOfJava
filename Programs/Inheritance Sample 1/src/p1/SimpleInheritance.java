package p1;

class Base
{
	int i,j;
	
	protected float f;
	
	public Base(){ System.out.println("Base() ");}
	
	public Base(int i,int j)
	{
		this.i = i;
		this.j = j;
		System.out.println("Base(int i,int j) ");
	}
	
	public void show()
	{
		System.out.println(" values of i and j:"+i+" "+j);
	}	
}


class Derived extends Base
{
	int k;
	
	public Derived(int k)
	{
		this.k = k;
		f = k;		
	}
	
	public Derived(int x,int y, int z)
	{
		super(x,y);//first statement
		
		super.i = 10;
		
		this.k = z;	
		System.out.println("Derived(int x,int y, int z)");
	}
	
	public void show()
	{
		System.out.println(" values of k is:"+k);
		
		super.show(); //calls Base class show() method
	}
}


public class SimpleInheritance {
	public static void main(String args[])
	{
		Derived obj = new Derived(10,20,30);
		
		obj.show();
	}
}
