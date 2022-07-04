
public class MethodExample0 {
public static void main(String[] args) {
	int x, y;

	x = 11;
	y = 13;
	System.out.println("b4 calling add() method");
	 add(x,y);
	 System.out.println("After calling add() method");
	 
	 int lalu = 26, tejas = 42;
	 
	 add(lalu, tejas);
}

//method declaration
static void add(int i,int j)
{//method definition or method body
	int k;
	k = i + j;
	System.out.println("Result is "+k);
}

}