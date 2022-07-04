
 //step 1
class MyRunnableThread1 implements Runnable{
    
    //step 2
    public void run() {
        while(ET1.idx < ET1.str.length()){
            try{
                System.out.println("Other Thread: "+
                		ET1.str.charAt(ET1.idx));
                ET1.idx++;
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
}
public class ET1 {

	static String str = "www.java652.com";
	static int idx=0;
	
    public static void main(String a[]) {

        System.out.println("Starting Main Thread...");
        
        //step 3
        MyRunnableThread1 mrt = new MyRunnableThread1();
        
        //step 4
        Thread t = new Thread(mrt);
        
        //step 5
        t.start();
        while(idx < str.length()){
            try{
 
                System.out.println("Main Thread: "+str.charAt(idx));
                idx++;
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}