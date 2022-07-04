import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* In below program, two threads tries to acquire read lock on a resource, at a time */

public class ReadWriteLockDemo {
    public static void main(String[] args) {
                  ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
        MyRunnable myRunnable=new MyRunnable(readWriteLock);
        new Thread(myRunnable,"Thread-1").start();
        new Thread(myRunnable,"Thread-2").start();
    }
}
 
 
class MyRunnable implements Runnable{
 
    ReadWriteLock readWriteLock;
    public MyRunnable(ReadWriteLock readWriteLock) {    
        this.readWriteLock=readWriteLock;
    }
    
    public void run(){
    
           /*
            * More than one threads can acquire readLock at a time provided no
            * other thread is acquiring writeLock at same time.
            */
           readWriteLock.readLock().lock();
 
    	//readWriteLock.writeLock().lock();
           System.out.println(Thread.currentThread().getName()
               +" has acquired read lock.");
 
           try {
                  Thread.sleep(5000);
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
           
        System.out.println(Thread.currentThread().getName()
                   +" has released read lock.");
 
           readWriteLock.readLock().unlock();
        //readWriteLock.writeLock().unlock();
 
    }
}