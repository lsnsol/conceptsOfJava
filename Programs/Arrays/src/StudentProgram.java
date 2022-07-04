
class Student{
	int marks[];
	
	Student(int m[])
	{
		marks = m;
	}
	
	private int getTotal(){
		int sum = 0;
		for(int i=0;i<marks.length;i++)
		{
			sum = sum+marks[i];
		}
		
		System.out.println("Total marks are:"+sum);
		
		return sum;
	}
	
	public int getAvg(){
		return getTotal()/marks.length;
	}
}

public class StudentProgram {
	public static void main(String arg[])
	{
		int tmp[]=new int[5];
		tmp[0] = 45;
		tmp[1] = 54;
		tmp[2] = 43;
		tmp[3] = 52;
		tmp[4] = 63;
		
		Student obj1 = new Student(tmp);
		
		//obj1.getTotal(); //private, hence cannot be invoked from outside Student class
		
		System.out.println(obj1.getAvg());
		
		int gmp[] = getArray();
		
		for(int item:gmp)
		{
			System.out.println(item);
		}
	}
	
	
	private static int[] getArray()
	{
		int smp[] = {45,64,53,26};
		
		return smp;
	}
}
