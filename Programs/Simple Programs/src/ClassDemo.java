
class Test1
{
	int i,j; //data members or member variables or instance variables
	//scope of data members is thru out the class
	
	Test1()//constructor
	{
		float z=  30;//local variable
		i = 20;
		j = 11;
		System.out.println("Test1() Constructor");
	}
	
	void add() //member methods
	{
		int k; //local variable i..e not a member variable of Test1 class
		//NOTE: k cannot be accessed from object of Test1 class
		//Also k is not accessible in other methods of Test1 class
		k = i+j;
		System.out.println("Add Result is:"+k);
	}
	
	void sub()
	{
		int z = i- j;
		System.out.println("Sub Result is:"+z);
	}
}//end of the class Test1


public class ClassDemo {
//Always program execution starts from below main method	
public static void main(String args[])
{
	System.out.println("Main method beginning");
	//instantiation
	Test1 obj; //declaring object reference

	//new keyword is used to allocate memory to object
	obj=new Test1(); //creating and initializing object of Test1 class
	obj.add(); //invoking add() method of Test1 class, using object obj
	
	obj.sub();
	System.out.println("Main method ending");
}
}
