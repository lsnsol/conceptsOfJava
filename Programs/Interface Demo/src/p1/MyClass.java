package p1;

import java.util.Scanner;

class InternalImpl  implements MyInterface
{
	public void met1(){
		System.out.println("met1() in MyClass");
	}
		
	public double met2(){
		System.out.println("met2() in MyClass");
		
		return 0.0;
	}
	
	//this class can have any other additional methods
}

class MyImpl  implements MyInterface
{
	public void met1(){
		System.out.println("met1() in MyImpl");
	}
		
	public double met2(){
		System.out.println("met2() in MyImpl");
		
		return 0.0;
	}
	
	//this class can have any other additional methods
}

public class MyClass{
	public static void main(String args[])
	{	
		//MyInterface obj2 = new MyInterface(); 
		//Compiler error, interface cannot be instantiated
		
		MyInterface obj1;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please select the implementation:");
		
		int opt = scnr.nextInt();
		
		if(opt==1)
		{
		obj1 = new InternalImpl();
		}
		else
		{
			obj1 = new MyImpl();
		}
		obj1.met1();
		
		obj1.met2();
		
		//MyInterface.ABC = 1; //Comp;iler err, coz ABC is static & final by default
		System.out.println(MyInterface.ABC);
	}
}
