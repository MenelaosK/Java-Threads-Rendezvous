
public class RThread extends Thread{
	Rendezvouss rant;
	int id;
	
	public RThread(int id,Rendezvouss rant) {
		this.id=id;
		this.rant=rant;
		
		
	}

	public void run() {
		rant.rantevou(id);
		
	}
}
