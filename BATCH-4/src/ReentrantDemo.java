import java.util.concurrent.locks.*;

public class ReentrantDemo {

	public static void main(String[] args) {
	ReentrantLock r= new ReentrantLock() ;
	r.lock();
	
	r.unlock();
	System.out.println(r.isLocked());
	r.lock();
	r.lock();
	r.lock();
	r.lock();
	r.lock();
	
	System.out.println(r.isHeldByCurrentThread());
	
	System.out.println(r.getQueueLength());
	
	System.out.println(r.getHoldCount());
	}

}
