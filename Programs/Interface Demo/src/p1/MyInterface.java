package p1;

//outer interface cannot be private or protected
public interface MyInterface {
	/*private*/ int ABC = 1; //by default all data members(in an interface) are static and final
	
	/*MyInterface(){
		//constructor not allowed in interface
	}*/
	public void met1();
	
	//private int met2(); Compiler error, private or protected not allowed
	
	double met2();
}


