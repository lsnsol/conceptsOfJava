
public class StackOverflowExample {
	static int i=0;
	public static void main(String[] args) {
		i++;
		System.out.println(i);
		
		//whenever a method gets invoked, an entry is added to stack memory
		//in this case, an entry is continuously added to stack memory
		main(args);
	}
}
