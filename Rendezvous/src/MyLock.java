import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
public class MyLock {
	int n;
	Lock louketo=new ReentrantLock();
	Condition cond=louketo.newCondition();
	
	
	
	public MyLock() {
		this.n=0;
	}
}
