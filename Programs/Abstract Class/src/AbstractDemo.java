
abstract class Animal{
	int i,j;
	Animal(){
		System.out.println("Animal() Constructor");
	}
	
	public abstract void move();

	public void takeRest()
	{
		System.out.println("Sleeping.....");
	}
}

class Monkey extends Animal{
	
	public void move()
	{
		System.out.println("Jumping....");
	}
}


class HumanBeing extends Animal{
	public void move()
	{
		System.out.println("Walk or run....");
	}
	
}

public class AbstractDemo{
	public static void main(String args[])
	{
		Animal aobj = new Monkey();
		
		aobj.move();
		aobj.takeRest();
		
		aobj = new HumanBeing();
		aobj.move();
	}
}
