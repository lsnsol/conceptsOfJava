
class TDemo11{
	public void met1() throws Exception
	{
		String str="2sdjhfgsdjhfgsdjh3";
		
		int i = Integer.parseInt(str);
	}
}

class TDemo22{
	public void met2() throws NullPointerException, Exception
	{
		try
		{
		TDemo11 td = new TDemo11();
		
		if(true)
		return;
		td.met1();
		}
		catch(Exception ep)
		{
			System.out.println("Exception catchinggggggggg");
			throw ep;
		}
		finally
		{
			System.out.println("finally  met2() in TDemo22");
		}
		
		System.out.println("out side finally met2() in TDemo22");
	}
}

public class NUmberFormatDemo {
	public static void main(String args[])
	{
		try{
		TDemo22 td2 = new TDemo22();
		td2.met2();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			System.out.println("dsdsfds");
		}
	}
}
