import java.util.ArrayList;
import java.util.List;
class A9{}

public class GenericWildcard {
 
	//list of any type can be sent as parameter
	static void displayListItems(List<?> list){
	    for (Object listItem : list){
	        System.out.println(listItem);
	    }
	}
 
	public static void main(String args[]){
 
		//Arraylist of string type.	
		List<String> list2 = new ArrayList<String>();
		list2.add("str1");
		list2.add("str2");
		list2.add("str3");	
 
		displayListItems(list2);
		
		List<A9> list3 = new ArrayList<A9>();
		list3.add(new A9());
		list3.add(new A9());
		list3.add(new A9());	
		
		displayListItems(list3);
		
 
	}
}