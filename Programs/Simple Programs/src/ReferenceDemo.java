
class Tuv{
	int a, b;
}

public class ReferenceDemo {
	public static void main(String args[])
	{
		Tuv obj/*name of reference*/ = new Tuv()/*creating object*/;
		//obj is the reference to Tuv object
		
		Tuv a_obj = obj;
		//creating another reference, and assigning to an existing object
		
		Tuv b_obj;//created reference, and not the object
		
		new Tuv().a = 50;//anonymous object, can be used only once
		//anonymous object does not have reference
		
		obj.a = 10;
		obj.b = 20;
		
		System.out.println("Before invoking check():"+obj.a+" "+obj.b);
		
		check(obj);
		
		System.out.println("After invoking check():"+obj.a+" "+obj.b);
	}
	
	static void check(Tuv tmp)
	{
		System.out.println("in check(), b4 changing:"+tmp.a+" "+tmp.b);
		
		tmp.a = 40;
		tmp.b = 50;
		
		System.out.println("in check(), after changing:"+tmp.a+" "+tmp.b);
	}
}
