class Abc8{
	String show()
	{
		System.out.println("show() in Abc");
		
		return "Test";
	}
}

public class DataMemberObject {
	int i;
	Abc8 obj;
	
	DataMemberObject()
	{
		i = 10;
		obj = new Abc8();
	}
	
	public static void main(String[] args) {
		
		DataMemberObject dmo = new DataMemberObject();
		System.out.println(dmo.i);
		System.out.println(dmo.obj.show());
	}
}
