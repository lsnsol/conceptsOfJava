import java.io.FileInputStream;
import java.io.IOException;


public class SystemIORedirect1Demo {
public static void main(String[] args) throws IOException{
	FileInputStream fis = new FileInputStream("D:\\abcdef.txt");
	
	//Redirects, such that inputs can be taken from
	//file instead of standard input(which is keyboard)
	System.setIn(fis);
	
	//NOTE:System.in.read() by default reads 
	//one character from keyboard
	int i = 0;
	while(i != -1)
	{
	i = System.in.read();//reads each character from the file abcd.txt
	System.out.print((char)i);//prints the character read, above
	}
}
}
