package xyz.itwill.thread;

public class MultiThreadTwo implements Runnable{

	@Override
	public void run() {
			for(char i='A';i<='Z';i++) {
				System.out.print(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
	}

}
