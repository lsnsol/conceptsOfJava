
class Wxyz{
	private int i,j;//data members are shared by all methods in the class
	
	public Wxyz(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	public void met1(int k)
	{
		int tmp = i+j+k; //tmp is local variable
		System.out.println("in met1 :"+ tmp);
	}
	
	public void met2()
	{
		int tmp = i-j;
		System.out.println("in met2 :"+tmp);
	}
	
	//without returning result, you can just print in method itself
	//but assume a scenario, where method invoker want to further perform calculations 
	//based on the result, here it is not possible with out returning value
}

public class ConstMethodParam {
	public static void main(String[] args) {
		Wxyz obj = new Wxyz(11,21);
		
		obj.met1(13);
		
		obj.met2();
	}
}
