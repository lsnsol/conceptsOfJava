
import java.math.BigInteger;

class Qrs{
	
}

public class BigIntegerDemo {

    public static void main(String[] args) {
        Qrs obj = new Qrs();
        
     
    	Integer i = new Integer(10);
    	
    	System.out.println(Integer.toBinaryString(10));
    	System.out.println(Integer.toHexString(10));
    	System.out.println(Integer.toOctalString(10));
    	
        BigInteger b1 = new BigInteger("987654321987654321000000000");
        BigInteger b2 = new BigInteger("987654321987654321000000001");
        
        BigInteger product = b1.multiply(b2);
        BigInteger division = b1.divide(b2);
        BigInteger sub = b1.subtract(b2);
        
        System.out.println("product = " + product);
        System.out.println("division = " + division);  
        System.out.println("subtract = " + sub); 
    
    }
}