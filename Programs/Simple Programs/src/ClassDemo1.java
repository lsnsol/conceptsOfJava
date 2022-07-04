class Test2
{
	int i,j;//data members or member variables or properties or instance variables
	
	 Test2()//default constructor
	{
		i = 0;
		j = 0;
		
		System.out.println("Test2() Constructor");
	}

	 Test2(int x,int y)//parameterized constructor
	{
		i = x;
		j = y;
		
		System.out.println("Test2(int x,int y) Constructor");
	}
	 
	/*Test2(int a,int b)//parameterized constructor
		{//Compiler error, since duplicate constructor, and cannot be overloaded
			i = a;
			j = b;
			
			System.out.println("Test2(int x,int y) Constructor");
		}*/
	
	 Test2(float a,float b)
	{
		i = (int)a;//Type Casting
		j = (int)b;
		System.out.println("Test2(float a,float b) Constructor");
	}
	
	 void show()//member method
	{
		System.out.println(i+" "+j);
		return;
	}
	
	 int add()//member method
	{
		 int k;
		 k = i+j;
		return k;
	}
}

public class ClassDemo1 {
 public static void main(String args[])
{
	Test2 abc;
	
	abc =new Test2();//default constructor
	abc.show();
	
	
	
	Test2 obj1 =new Test2(10,40);//overloaded constructor
	obj1.show();
	
	int bangalore = obj1.add();
	System.out.println("Result1 is:"+bangalore);//here + means concatinates
	
	//float gt = (float)3.56;
	
	Test2 obj3 = new Test2(10.5f,13.2f);
	
	int val = obj3.add();
	System.out.println("Result is:"+val);
	
}
}
