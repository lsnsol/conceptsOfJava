import java.util.*;

class Qrs{

}
public class OutOfBoundsExcp {
	public static void main(String[] args) {
		
		//Non generics, we can store Heterogenous objects
		//Generic Homogenous objects can be stored
		ArrayList<String> al = new ArrayList<String>();
		
		
		al.add("Hello");
		//al.add(new Qrs());
		
		al.add("Kiran");
		
		al.add("Kumar");
		
		al.add("HELLO");
		
		al.add("Anil");
		
		al.add("Nagesh");
		
		al.add("Kiran");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			String str = (String)itr.next();
			
			System.out.println(str);
		}
		
		System.out.println("--------------------------");
		Collections.shuffle(al);
		
		Iterator itr1 = al.iterator();
		while(itr1.hasNext())
		{
			String str = (String)itr1.next();
			
			System.out.println(str);
		}
	}
}
