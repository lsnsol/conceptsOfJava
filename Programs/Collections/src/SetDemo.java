
import java.util.*;

public class SetDemo {

public static void main(String args[])
{
		//stores unique values only, and insertion order is not maintained
		HashSet hs = new HashSet();
		
		hs.add("to");
		hs.add("test");
		hs.add("random1");
		hs.add("string");
		hs.add("some");
		hs.add("random1");
		hs.add("abgh");
		
		System.out.println(" :"+hs);
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("--------------------");
		//ListIterator not available for Set
		
		/*Enumeration enm=Collections.enumeration(hs);
		
		for(;enm.hasMoreElements();)
		{
			System.out.println(enm.nextElement());
		}*/
		
		String min_str = (String)Collections.min(hs);
		
		System.out.println("Minimum is: "+min_str);
		
		//Collections.reverse(hs);// is supported only by List, and not Set
		
	}

}
