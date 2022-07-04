
public class BreakDemo {

	public static void main(String[] args) {
		int j=0;
		
		int testval = 5;//= is assignment operator
		
		while(testval<=30)
		{
			testval++;
			if((testval==10)||(testval==20)||(testval==30))
			{
				System.out.println("continuing...");
				continue;
			}
			
			System.out.println(testval);
		}
		
		System.out.println("After While loop");

	}

}
