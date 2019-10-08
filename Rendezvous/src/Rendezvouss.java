
public class Rendezvouss {
	MyLock lock;
	boolean busy=false;
	int prev=0;
	
	public Rendezvouss(MyLock lok) {
		this.lock=lok;
	}

	public void rantevou(int id) {
		lock.louketo.lock();
		while(!busy) {
			while(prev==id) {
				try {
					lock.cond.await();
				}
				catch(InterruptedException e) {
					
				}
			}lock.cond.signal();
			
		
			busy=true;
			System.out.println("Thread "+id+" is in");
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			prev=id;
			
			System.out.println("Thread "+id+" is out");
			busy=false;
		
		
		}
		lock.louketo.unlock();
		
		
		
	}
}
