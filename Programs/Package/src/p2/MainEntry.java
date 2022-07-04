package p2;//contents of this file belongs to p2 package

import p1.*;//there can be multiple import statements in a file

//above two lines can be replaced with import p1.*;

public class MainEntry {
public static void main(String args[])
{
	p1.Abcd obj = new p1.Abcd();
	
	//Internal dsjhf=new Internal(); 
	//not accessible since Internal class is default
	
	obj.show();
	obj.show1(); 

	
	Abcd obj2 = new Abcd();
	obj2.show();
	
	Xyz obj1 = new Xyz();
	obj1.display();
}
}
