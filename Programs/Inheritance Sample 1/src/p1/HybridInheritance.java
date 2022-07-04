package p1;


class A12{
	int i;

	A12(int i)
	{
		this.i/* data member*/ = i/*parameter*/;
		System.out.println("A(int i)");
	}
	
	public void show()
	{
		System.out.println("Value of A.i is:"+i);
	}
}

class B12 extends A12{
	int j;
	public B12(int p,int j)
	{
		super(p); //shud be first statment in cosntructor
		this.j = j; 
		System.out.println("B(int i,int j)");
	}
	public void show()
	{
		super.show();
		System.out.println("Value of B.j is:"+j);
	}
}

class C12 extends B12{
	int k;
	public C12(int i,int j,int k)
	{
		super(i,j);
		this.k = k;
		System.out.println("C(int i,int j,int k)");
	}
	
	public void show()
	{
		super.show();
		System.out.println("Value of C.k is:"+k);
	}
}

class D12 extends B12{
	public D12()
	{
		super(10,20);
	}
}

public class HybridInheritance {
	public static void main(String[] args) {
		C12 obj = new C12(10,20,30);
		obj.show();
	}
}
