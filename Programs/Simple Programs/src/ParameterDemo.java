class Test20{
	
}

class MyXyz{
	 int k;
	 Test20 obj;//object as data member
	
	//MyXyz obj1;//an object as data member of itself
	
	 MyXyz()
	{
		 System.out.println("MyXyz() constructor");
		k = 10;
		obj = new Test20();//creating object of another class in constructor
	}
	 int getK()
	{
		 System.out.println("getting k");
		return k;
	}
	
	 void setK(int p)
	{
		 System.out.println("setting k");
		k = p;
	}
}

class Abc{
	 int i,j;
	
	//object as parameter
	 void display(MyXyz obj)
	{
		System.out.println("Value:"+obj.getK());
	}
	
	//returns MyXyz object
	 MyXyz createObj()
	{
		float ftk;
		System.out.println("createObj() in Abc");
		MyXyz tobj = new MyXyz(); //object created locally, within a method
		tobj.setK(34);
		return tobj;
	}
}

 class ParameterDemo {
	public static void main(String[] args) {

		Abc myobj = new Abc();
		
		MyXyz obj1 = new MyXyz();
		
		obj1.setK(201);
		
		myobj.display(obj1); //sending obj1 as parameter
		
		MyXyz obj2 = myobj.createObj(); //returning obj2 from createObj() method
	}
}
