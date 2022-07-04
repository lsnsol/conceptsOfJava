
 //step 1
class MyRunnableThread implements Runnable{

    public int myCount = 0;
    /*public MyRunnableThread(){
         
    }*/
    
    //step 2
    public void run() {
        while(myCount <= 10){
            try{
            	
            	//++myCount;
                System.out.println("Other Thread: "+myCount);
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
}
public class ExampleThread {

    public static void main(String a[]) {
    	int i = 0;
    	
        System.out.println("Starting Main Thread...");
        
        //step 3
        MyRunnableThread mrt = new MyRunnableThread();
        
        //step 4
        Thread t = new Thread(mrt);
        
        //step 5
        t.start();
        while(i <= 10){
            try{
            	//++i;
                System.out.println("Main Thread: "+i);
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}