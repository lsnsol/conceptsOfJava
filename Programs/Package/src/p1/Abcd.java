package p1;

//the class Abcd belongs to p1 package
//there can be only one package statement in a file
//and package statement shud be first statement always


//Abcd class can be used within p1 package, and outside p1 package also
public class Abcd {
	
	public Abcd(){
		System.out.println("in Abcd() constructor");
	}
	
	public void show()
	{
		System.out.println("Abcd.show() in p1 package");
	}
	
	public int show1()
	{
		System.out.println("Abcd.show1() in p1 package");
		
		return 0;
	}
}



