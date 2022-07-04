import java.util.concurrent.Semaphore;

public class SemaphoreEg {

    Semaphore binary = new Semaphore(3);
  
    public static void main(String args[]) {
        final SemaphoreEg test = new SemaphoreEg();
        
        for(int i=0;i<=8;i++)
        {
	        new Thread(){
	            @Override
	            public void run(){
	              test.mutualExclusion(); 
	            }
	        }.start();
        }
      
    }
  
    private void mutualExclusion() {
        try {
            binary.acquire();

            //mutual exclusive region
            System.out.println(Thread.currentThread().getName() + " inside mutual exclusive region");
            Thread.sleep(1000);

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } finally {
            binary.release();
            System.out.println(Thread.currentThread().getName() + " outside of mutual exclusive region");
        }
    } 
  
}

