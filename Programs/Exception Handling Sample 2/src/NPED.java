
class Abcdef{
	void show(){}
}

public class NPED {

	public static void main(String[] args){
		try
		{
			System.out.println("stmt 1");
			Abcdef obj = null;
			System.out.println("stmt 2");
			obj.show(); //JVM throws NullPointerException 
			System.out.println("stmt 3");
		}
		catch(NullPointerException et)
		{
			System.out.println("Exception occurred:"+et.getMessage());
		}	
	}

}
