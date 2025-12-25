package core;

class ByRunnable implements Runnable{
	Thread t = new Thread();
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " : " + this.t);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class ByThread extends Thread{
	Thread t = new Thread();
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " : " + this.t);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class P025_Thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t = new Thread();
		ByRunnable b = new ByRunnable();
		t.setName("MyThread");
		System.out.println(t);
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " : " + t);
			b.run();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
