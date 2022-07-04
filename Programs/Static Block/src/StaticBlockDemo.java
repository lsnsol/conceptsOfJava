

class TestMe{
	{//instance initializer
		System.out.println("This is non static block");
	}
	
	//But in a class that had multiple constructors, you would have to repeat the code in each constructor. With an instance initializer, 
	//you can just write the code once, and it will be executed no matter what constructor is used to create the object. Instance initializers
	//are also useful in anonymous inner classes, which can't declare any constructors at all.
	static {//static block
		System.out.println("in static block 1 TestMe");
	}	
	
	static {
		System.out.println("in static block 2 TestMe");
	}	
	
	TestMe()
	{
		System.out.println("in TestMe()");
	}
}
public class StaticBlockDemo {
	
	public static void main(String[] args) {

		System.out.println("in main program");
		
		//static block is executed before class gets loaded
		//static block is executed only once, whether zero or more than--
		//--one object is created
		//instance initializer is executed once for every new object created
		//There can be multiple static and non static blocks in a class
		TestMe tm = new TestMe();
		TestMe tm1 = new TestMe();
		TestMe tm2 = new TestMe();
	}

}
