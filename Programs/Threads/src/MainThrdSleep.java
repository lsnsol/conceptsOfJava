
public class MainThrdSleep {

	public static void main(String[] args) throws InterruptedException{
		int i = 1;
		//try
		//{
			while(i<=15)
			{
				i++;
				System.out.println("i val is:"+i);
				Thread.sleep(2000);//milliseconds
			}
		/*}
		catch(InterruptedException ie)
		{
			System.out.println("IE:"+ie.getMessage());
		}*/

	}

}
