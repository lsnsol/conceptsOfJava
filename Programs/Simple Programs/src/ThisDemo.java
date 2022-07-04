class A1{
	float var1, var2;
	static int k;

	A1()
	{
		System.out.println("A1() invoked");
	}
	
	A1(float tst)
	{
		
		this();//invokes A1() constructor
		//A1();//directly invoking constructor, not allowed
		System.out.println("A1(float) invoked");
	}
	
	A1(float var1,int var2)
	{
		this(var1); //invokes A1(float) constructor	
		//this() should always be first statement
		//this() can be invoked from constructor only
		//NOTE: this() cannot be used in methods
		this.var1/*data member*/ = var1/*parameter*/;
		this.var2 = var2;		
		System.out.println("A1(float var1,float var2) invoked");
		
		int tmp = this.met1();
		System.out.println(tmp);
	}
	
	public void show()
	{
		A1 obj5 = this; //assigning current object to obj
		System.out.println(" "+var1+" "+var2);
		obj5.var1 = 45;
		System.out.println(" "+var1+" "+var2);
		obj5.display();//can be invoked as display(); also
	}
	
	private int met1()
	{
		float var1 = 2.3f;
		this.var1 = var1;//avoiding name collision between field and local variable
		System.out.println("private int met1()");
		return 10;
	}
	private void display()
	{
		int k;
		k = 30;
		//this(); //compiler error, cannot be invoked from a method
		this.k = k;
		System.out.println("display()"+this.var1);
		
		//this = new A1(); //an object cannot be assigned to this
	}
	
	private static float met3()
	{
		//this.var1 = 34; 
		//Compiler Error: this keyword, cannot be used in static methods

		return 1.3f;
	}
}

public class ThisDemo {
	public static void main(String[] args) {
	A1 obj/* name of object*/ = new A1((float)40.1,60)/*constructor*/;
	
	obj.show();
	}
}
