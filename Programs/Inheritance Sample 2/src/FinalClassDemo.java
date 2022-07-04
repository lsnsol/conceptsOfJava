
final class Wxy{
	int val1;
	double val2;
	public void show()
	{
		System.out.println("show() in Wxy");
	}
}

/*//error, since Wxy is final class, 
//hence it cannot be Base class
class Abc extends Wxy{
	void display()
	{
		System.out.println("display() in Abc");
	}
}*/

public class FinalClassDemo {
public static void main(String args[])
{
	Wxy obj = new Wxy();
	obj.show();
}
}
