//an example where multiple threads work on the same object and we use wait, 
//notify and notifyAll methods.

class Message {
    private String msg;
     
    public Message(String str){
        this.msg=str;
    }
 
    public String getMsg() {
        return msg;
    }
 
    public void setMsg(String str) {
        this.msg=str;
    }
 
}

class Waiter implements Runnable{
    
    private Message msg;
     
    public Waiter(Message m){
        this.msg=m;
    }
 
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        long t = System.currentTimeMillis();
        synchronized (msg) {
            try{
                System.out.println(name+" waiting to get notified at time:"+t);
                msg.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            System.out.println(name+" Time difference:"+(System.currentTimeMillis()-t));
            //process the message now
            System.out.println(name+" processed: "+msg.getMsg());
        }
    }
 
}


class Notifier implements Runnable {
	 
    private Message msg;
     
    public Notifier(Message msg) {
        this.msg = msg;
    }
 
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(5000);
            //in real application, here there can b some logic like downloading, uploading files, etc...
            
            synchronized (msg) {
                msg.setMsg(name+" Notifier work done");
                msg.notify();//wake up one first thread waiting to get notified
                // msg.notifyAll(); //to wake up all threads waiting to get notified
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
    }
 
}

public class NotifyWaitDemo0 {
	 public static void main(String[] args) {
	        Message msg = new Message("process it");
	        //Message msg1 = new Message("jdsfdjshfsd");
	        
	        Waiter waiter = new Waiter(msg);
	        new Thread(waiter,"waiter").start();
	         
/*	        Waiter waiter1 = new Waiter(msg);
	        new Thread(waiter1, "waiter1").start();
	        */
	         
	        Notifier notifier = new Notifier(msg);
	        new Thread(notifier, "notifier").start();
	        System.out.println("All the threads are started");
	    }
}
