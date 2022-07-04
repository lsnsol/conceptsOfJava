class Check{
	String str;
	
	Check(String str)
	{
		this.str = str;
	}
}

public class PassByValue {
	public static void main(String[] args) {
		Check tmp1 = new Check("first");
		Check tmp2 = new Check("second");
		
		System.out.println("Before swap:"+tmp1.str+" "+tmp2.str);
		
		swap(tmp1, tmp2);
		
		System.out.println("After swap:"+tmp1.str+" "+tmp2.str);
		
		int a = 2, b=3;
		
		System.out.println("Before swap:"+a+" "+b);
		
		swap(a, b);
		
		System.out.println("After swap:"+a+" "+b);	
	}
	
	static void swap(Check c1, Check c2)
	{
		Check c3;
		c3 = c1;
		c1 = c2;
		c2 = c3;
	}
	
	static void swap(int i, int j)
	{
		int tmp;
		tmp = i;
		i = j;
		j = tmp;
	}
}
