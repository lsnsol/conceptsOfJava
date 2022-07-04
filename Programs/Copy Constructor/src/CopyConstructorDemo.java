//ANother example, Rectangle with width and height
 
class Complex {
 
    private double re, im;
     
    // A normal parametrized constructor 
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
     
    // copy constructor
    Complex(Complex c) {
        System.out.println("Copy constructor called");
        re = c.re;
        im = c.im;
    }
      
    /*// Overriding the toString of Object class
    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }*/
    
    public void show(){}
}
 
public class CopyConstructorDemo {
 
    public static void main(String[] args) {
    Complex c1 = new Complex(10, 15);
     
    // Following involves a copy constructor call
    Complex c2 = new Complex(c1);    

    System.out.println(c2); // toString() of c2 is called here
    }
}