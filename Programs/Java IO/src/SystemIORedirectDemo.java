import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class SystemIORedirectDemo {
public static void main(String[] args) {
	try{
	FileOutputStream fos = new FileOutputStream("wxyz.txt");
	PrintStream ps = new PrintStream(fos);
	System.setOut(ps);
	
	System.out.println("Hello, How are you");
	System.out.println("Note that this content is saved to abcd.txt file");
	
	System.err.println("jdshfgsdjfhsd");
	}
	catch(IOException ioe)
	{
		System.out.println("IOException occurred:"+ioe.getMessage());
	}
}
}
