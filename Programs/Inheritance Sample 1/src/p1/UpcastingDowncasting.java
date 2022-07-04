package p1;

interface A51 
{
  void display();
}
class B51 implements A51
{
    public void display() {
        System.out.println("display() in class B");
    }
 
}
class C51 extends B51
{
    public void display() {
        System.out.println("display() in class C");
    }
}

public class UpcastingDowncasting{
	public static void main(String args[]){
		// Upcast from subclass to super class.
        A51 obj=new C51();
 
        obj.display();
        //display() in class C
        
     // Upcasting from subclass to super class.
        A51 aRef=new C51();
 
        aRef.display();//Am in class C
        //Downcasting of reference to subclass reference.
        B51 bRef=(B51) aRef;
        bRef.display();//Am in class C
	
         //ClassCastException
      //Downcast of reference to subclass reference.
        C51 obj1=(C51) new B51();
        obj1.display();//display() in class B
        
	}
}