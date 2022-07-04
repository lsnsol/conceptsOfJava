import java.util.List;


class A6{}

class B6 extends A6{}

public class GenericLowerBound {
	
	static void printList(List<? super B6> lst)
	{
		for(Object obj: lst)
		{
			System.out.println(obj);
		}
	}
	
	public static void main(String[] args) {


		
		
		
	}
}
