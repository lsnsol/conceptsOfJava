class TDemo1{
	TDemo1()
	{
		System.out.println("TDemo1() constructor");
	}
	
	public void met1() throws Exception
	{
		int x = 1;
		if(x==1)
		{
			throw new Exception("Some Exception");
		}
	}
}

class TDemo2{
	
	TDemo2()
	{
		System.out.println("TDemo2() constructor");
	}
	
	public void met2() throws Exception,NullPointerException
	{

		TDemo1 td = new TDemo1();
		System.out.println("in met2(), b4 met1()");
		td.met1();
	}
}


public class ThrowsDemo {
	public static void main(String args[]) //throws Exception
	{
		try{
		TDemo2 td2 = new TDemo2();
		System.out.println("in main, b4 met2()");
		td2.met2();		
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception occurred"+e.getMessage());
			//prints(TO CONSOLE DIRECTLY) line number, class name, file name 
			//where the exception has occurred
			//and the methods thru which exception has been propogated, until caught
		}
	}
}
