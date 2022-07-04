
public class StringAndBufferDemo {
	public static void main(String args[])
	{	
		String str = new String("first");
		//String is immutable i..e once created, String object content 
		//cannot be changed, where as StringBuffer is mutable
		
		System.out.println("Original String:"+str);	
		str = str.concat("ggggg");
		//str doesn't get updated itself, rather concatenated string is returned
		//old str object with "first" value remains unchanged and continues to exist,
		//even after new concatinated string "first ggggg" gets created
		
		System.out.println("After Concatinating String:"+str);	
		
		 str = str.replaceAll("f", "m");
		System.out.println("After replacing String:"+str);
		
		//get single character in a String
		char ch = str.charAt(2); //2 is index of required character
		
		//System.exit(0);
		
		StringBuffer strb = new StringBuffer("second");
		//StringBuffer is mutable, and can grows and shrink in size dynamically
		
		ch = strb.charAt(3);
		
		System.out.println("Original StringBuffer:"+strb);
		strb.reverse();
		
		System.out.println("Reversed StringBuffer:"+strb);
		
		strb.append(" tttttt");
		
		System.out.println(strb);
		
		strb.insert(6, "bbbbbbbbb");
		
		System.out.println(strb);
		
		strb.delete(3, 7);
		System.out.println(strb);
	}

}
