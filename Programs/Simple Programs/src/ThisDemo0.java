
class A12{
	float var1, var2;
	int k;

	A12()
	{
		System.out.println("A12() invoked");
	}
	
	A12(float var1)
	{
		this.var1/*data member*/ = var1/* parameter */;
	}
	
	A12(float var1,int var2)
	{
		this(var1); //invokes A1() constructor	
		//this() should always be first statement
		//this() can be invoked from constructor only
		//NOTE: this() cannot be used in methods
		this.var1/*data member*/ = var1/*parameter*/;
		this.var2 = var2;		
		System.out.println("A1(float var1,float var2) invoked");
		
	}
	
	/*static public void xyz()
	{
		this.var1 = 10;
	}*/
	
	public void display()
	{
		int k;//local variable
		k = 30;
		//this(); //compiler error, cannot be invoked from a method
		this.k = k;
		System.out.println("display()"+this.var1);
		
		//this = new A1(); //an object cannot be assigned to this
	}
}

public class ThisDemo0 {
	public static void main(String[] args) {
	A12 obj/* name of object*/ = new A12((float)40.1,60)/*constructor*/;
	
	obj.display();
	}
}
