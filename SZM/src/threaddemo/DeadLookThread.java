package threaddemo;
@SuppressWarnings("all")
public class DeadLookThread extends Thread {
	private char[] scurce;
	private char[] dest;
	private char[] source;

	public DeadLookThread(char[] source, char[] dest) {
		this.source = source;
		this.dest = dest;
	}

	public void run() {
			synchronized (source) {
				try {
Thread.sleep(1000);				
			}
		 catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (dest) {
		 System.arraycopy(scurce,0,dest,0,scurce.length);
			System.out.println(dest);
			
		}
		
		
	}
	}
}
