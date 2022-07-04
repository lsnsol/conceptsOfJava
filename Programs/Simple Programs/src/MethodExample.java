
public class MethodExample {
public static void main(String[] args) {
	int x, y;

	x = 11;
	y = 13;
	
	int z = met1(x,y);
	
	System.out.println("Result value is:"+z);
}

//method declaration
static int met1(int i,int j)
{//method definition or method body
	int k;
	k = i + j;
	System.out.println("in met1()");
	met2();
	return k;
}

static void met2()
{
	System.out.println("in met2()");
}
}
