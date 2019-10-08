
public class Main {

	public static void main(String[] args) {
		MyLock lock=new MyLock();
		Rendezvouss rant=new Rendezvouss(lock);
		RThread r1=new RThread(1,rant);
		RThread r2=new RThread(2,rant);
		
		r1.start();
		r2.start();

	}

}
