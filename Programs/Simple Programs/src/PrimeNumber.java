/*
 * Prime number is divisible only by itself or 1
 */
public class PrimeNumber {
public static void main(String[] args) {
	int num1 = 11;
	boolean is_prime = true;
	
	for(int i=2;i<num1;i++)
	{
		//System.out.println("checking if divisible by "+i);
		if(num1%i==0) //check if num1 is divisible by any number between 2 and num1
		{
			//System.out.println(num1+ " is divisible by "+i);
			is_prime = false;
			break; //come out of for loop
		}
	}
	
	if(is_prime == true)
	{
		System.out.println(num1+" is Prime Number");
	}
	else
	{
		System.out.println(num1+" is not a Prime Number");
	}
	
}
}
