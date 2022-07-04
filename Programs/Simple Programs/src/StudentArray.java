
class Student8{
	private String name;
	private int marks;
	private int age;
	
	Student8(String nm, int mk,int ag)
	{
		name = nm;
		marks = mk;
		age = ag;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMarks()
	{
		return marks;
	}
	
	public int getAge()
	{
		return age;
	}
}

public class StudentArray {

	public static void main(String args[])
	{
		Student8 sarr[] = new Student8[5];
		
		Student8 obj1 = new Student8("Ravi",45,23);
		
		Student8 obj2 = new Student8("Kumar",56,25);
		
		Student8 obj3 = new Student8("Kishore",57,35);
		
		Student8 obj4 = new Student8("Kiran",56,25);
		
		//Student8 obj5 = new Student8("Rama",66,29);
		
		sarr[0] = obj1;
		sarr[1] = obj2;
		sarr[2] = obj3;
		sarr[3] = obj4;
		sarr[4] = new Student8("Rama",66,29);
		for(int i=0;i<sarr.length;i++)
		{
			Student8 tobj = sarr[i];
			
		
		System.out.print(tobj.getName());
		System.out.print(" ");
		System.out.print(tobj.getAge());
		System.out.print(" ");
		System.out.println(tobj.getMarks());
		
	}
		
		}
	
}
