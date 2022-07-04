
//Below is an example of Generic class
class Wrapper<H> {

  private H m;

  public void put(H m) {
    this.m = m;
  }

  public H get() {
	  System.out.println("in get()");
    return m;
  }
}

class A{
	
}

public class Box
{
  public static void main(String[] args) {
     Wrapper<String> stringBox = new Wrapper<String>();
     Wrapper<Float> fltBox = new Wrapper<Float>();
     Wrapper<A> aBox = new Wrapper<A>();
     
     //Generic class doesn't work for primitive data types
     //Wrapper<int> iBox = new Wrapper<int>();
     
    Float it = new Float(3.4);
    fltBox.put(it);
    
     stringBox.put(new String("Hello Java652.com"));

     //System.out.println("Integer Value is "+ integerBox.get());
     System.out.println("String Value is "+ stringBox.get());
     
     System.out.println("Float obj:"+fltBox.get());
  }
}