package p1;

class Alpha extends Beta{
	
}

class Beta extends Teta{
	
}

class Teta extends Alpha{
	
}

public class Misc1 {
public static void main(String[] args) {
	Teta ot = new Teta();
	System.out.println("Everything works fine");
}
}
