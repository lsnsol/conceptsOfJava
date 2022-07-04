package p1;
class A9{
	
}

class Test extends A9{
	
}

public class ObjectSuperClass {
	public static void main(String args[])
	{
		Test obj = new Test();
		Class c = obj.getClass();
		Class sc = c.getSuperclass();

		System.out.println("Super class of Test is: "+sc.getName());
	}
}
