
/*Create a Rectangle class width and Height as input, expose methods to find area, perimeter
Create an array of objects, try to sort objects based on Area*/


class Rectangle{
	double width, height;
	
	//Default
	Rectangle()
	{
		width = 0;
		height = 0;
	}
	
	Rectangle(double side)
	{
		width = side;
		height = side;
	}
	
	Rectangle(double pwidth, double pheight)
	{
		width = pwidth;
		height = pheight;
	}
	
	double getPerimeter()
	{
		return 2*(width+height);
	}
	
	double getArea()
	{
		return width*height;
	}
	
	boolean isSquare()
	{
		if(width==height)
		{
			return true;
		}
		
		return false;
	}
}

public class MyFirstClass {
	public static void main(String[] args) {

		Rectangle or = new Rectangle(3.4, 6.5);
		
		Rectangle rarr[] = new Rectangle[5];
		rarr[0] = or;
		rarr[1] = new Rectangle(5.5, 6.3);
		rarr[2] = new Rectangle(8.8);
		rarr[3] = new Rectangle(6.3, 9.4);
		rarr[4] = new Rectangle(2.6, 8.6);
		
		for(int i=0;i<rarr.length;i++)
		{
			for(int j=0;j<rarr.length-1;j++)
			{
				if(rarr[j].getArea()<rarr[j+1].getArea())
				{
					Rectangle tmpr = null;
					
					tmpr = rarr[j];
					rarr[j] = rarr[j+1];
					rarr[j+1] = tmpr;
				}
			}
		}
		
		System.out.println("Sorted as per area...");
		
		//enhanced for loop
		for(Rectangle lor:rarr)
		{
			System.out.print(lor.getArea()+"\t");
			System.out.println(lor.isSquare()?"Square":"Rectangle");
		}
	}
}
