package p1;


class W{
	int i;
	W()
	{
		System.out.println("W() Constructor");
	}
	
	void show1()
	{
		System.out.println("i="+i);
	}
}

class X extends W{
	int j;
	X()
	{
		System.out.println("X() Constructor");
	}
	
	void show2(){
		show1();
		System.out.println("j="+j);
	}
}

class Y extends X{
	int k;
	Y(int p,int q,int r)
	{
		i = p;
		j = q;
		k = r;
		System.out.println("Y() Constructor");
	}

	void show3(){
		show2();
		System.out.println("k="+k);
	}
}

public class MultiLevelExample1{
	public static void main(String[] s)
	{
		Y obj = new Y(11,22,33);
		obj.show3();
		
		X objx = new X();
		
		//System.out.println(obj);
	}
}
