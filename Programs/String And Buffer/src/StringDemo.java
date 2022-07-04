
public class StringDemo {
	public static void main(String args[])
	{
		String str = "This is simple String to test";
		
		String tmp_str;
		
		System.out.println("index of s is: "+str.indexOf("s"));
		tmp_str = str.substring(3/* start index*/, 10/*end index*/);
		System.out.println("Sub String is:"+tmp_str);
		
		tmp_str = str.replace('s', 'k');
		
		//tmp_str = str.replace("sgfhfg", "k");
		System.out.println("replaceis:"+tmp_str);
		
		int la = str.lastIndexOf("e");
		System.out.println("Last index of "+la);
		
		System.out.println(" char at "+str.charAt(3) +" Length of str:"+str.length());
		
		System.out.println(" to lower case "+str.toUpperCase());
	}
}
