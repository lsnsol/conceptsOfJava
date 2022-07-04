
public class RecursionDemo {

	static String str="Testing purpose";
	
	String str1 = new String("hgfjhsgdfhjs");
	public static void main(String[] args) {
		printChar(0);
	}
	
	static void printChar(int i)
	{
		System.out.println(str.charAt(i));
		
		if(i<(str.length()-1))
		{
		printChar(i+1);
		}
	}
}
