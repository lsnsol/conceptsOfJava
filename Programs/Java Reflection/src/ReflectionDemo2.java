import java.lang.reflect.*;

class Abcd1
{
	public Abcd1()
	{
		System.out.println("This is Constructor");
	}
	
	public Abcd1(String str)
	{
		
	}
	
	public void met1()
	{
		System.out.println("This is met1()");
	}
	
	public void met2(String str)
	{
		System.out.println("This is met2(String) "+str);
	}
	
	public void met3(String str1,int io, String str2)
	{
		System.out.println("This is met3(String, Inetegr, String)... "+str1+" "+str2+" "+io);
	}
	
	public void met4(String str1,String str2,String str3)
	{
		System.out.println("This is met4(String, String, String) "+str1+" "+str2+" "+str3);
	}
	
	public void met5(String str, int i)
	{
		System.out.println(str+" "+i);
	}
}

public class ReflectionDemo2 {
	public static void main(String args[])
	{
		try
		{
	
			Class cp = Class.forName("java.lang.String");
			
			//no parameters
			Class no_params[] = {};
			
			//no parameters
			Class ones_params[] = {String.class};
			
			//get the Class instance of Abcd
			Class c = Class.forName("Abcd");
			
			//get the Constructor instance
			Constructor cons = c.getConstructor(no_params);
			
			
			//create object, which is required for invoke() method
			Object obj = cons.newInstance();
			
		
			Method method1 = c.getDeclaredMethod("met1",no_params);
			
			//Now, invoke method dynamically
			method1.invoke((Abcd)obj);
			
			//one String parameter
			Class str_params[] = {String.class};
			Method method2 = c.getDeclaredMethod("met2", str_params);
			
			
			
			Object obj11[] = new Object[1];
			obj11[0] = "fsdfsd";
			//Now, invoke method dynamically
			method2.invoke((Abcd)obj, obj11);
			
			//one String parameter
			Class str_str_params[] = {String.class, String.class};
			Method method3 = c.getDeclaredMethod("met3", str_str_params);
			//method3.
			//Now, invoke method dynamically
			method3.invoke((Abcd)obj, "First Param", "Second Param");
			
			
			//one String parameter
			Class sss_params[] = {String.class, String.class, String.class};
			Method method4 = c.getDeclaredMethod("met4", sss_params);
			//method3.
			//Now, invoke method dynamically
			method4.invoke((Abcd)obj, "First Param", "Second Param", "Third Param");
			
			
			//one String parameter
			Class si_params[] = {String.class, Integer.class};
			Method method5 = c.getDeclaredMethod("met5", si_params);
			//method3.
			//Now, invoke method dynamically
			method5.invoke((Abcd)obj, "First Param", 34);
			
		}catch(ClassNotFoundException cnf)
		{
			cnf.printStackTrace();
		}
		catch(NoSuchMethodException nsm)
		{
			nsm.printStackTrace();
		}
		catch(Exception ec)
		{
			ec.printStackTrace();
		}
	}
}
