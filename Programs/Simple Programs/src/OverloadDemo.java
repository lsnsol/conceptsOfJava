
public class OverloadDemo {

	//method overloading
	static double add(double i,double j)
	{
		System.out.println("add(double i,double j)");
		return i+j;
	}
	

	static double add(double i,double j, double k)
	{
		System.out.println("add(double i,double j, double k)");
		return i+j+k;
	}
	
	static int add(int i,int j)
	{
		System.out.println("add(int i,int j)");
		return i+j;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("in main()");
		int mn = add(10,20);
		System.out.println(mn);
		
		double x = add(10.3,20.5);
		System.out.println(x);
		
		System.out.println(add(10.2,20.1,30.3));
		System.out.println(add(10.2f,20.1f,30.3f));
		
		System.out.println("exiting main()");
	}
}
