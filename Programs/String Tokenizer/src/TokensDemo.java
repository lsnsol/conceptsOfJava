import java.util.StringTokenizer;


public class TokensDemo {
public static void main(String args[])
{
	StringTokenizer strt = 
		new StringTokenizer("This;is;to;test;only");
//System.out.println(strt.countTokens());
	while(strt.hasMoreTokens())
	{
		String tkn = strt.nextToken(";");
		
		System.out.println("Next Token is: "+tkn);	
		
	}
}
}
