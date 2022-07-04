
class Qrst{
	private String name;
	private int age;
	
	public Qrst(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int hashCode()
	{
		int hcode = age;
		for(int i=0;i<name.length()-1;i++)
		{
			//charAt() method in String class, to return a specific character
			hcode = hcode + name.charAt(i);	
			//note: + between two chars, performs addition(and not concatenation)
		}
		
		return hcode;
	}
	
	public void show()
	{
		System.out.println("name is "+name+"\n age is "+age);
	}
}

public class OverrideHashCode {
	
	public static void main(String[] args) {
		Qrst obj1 = new Qrst("Naveen", 32);
		
		Qrst obj2 = new Qrst("Kumar", 34);
		
		Qrst obj3 = new Qrst("Naveen", 32);
		
		System.out.println("hc of obj1: "+obj1.hashCode());
		System.out.println("hc of obj2: "+obj2.hashCode());
		System.out.println("hc of obj3: "+obj3.hashCode());
	}

}
