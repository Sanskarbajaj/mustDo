package multithreadandsync;

public class multithreadusingrunnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("in thread"+Thread.currentThread().getName());
		Mythread o=new Mythread();
		Thread th=new Thread(o);
		th.start();
		th.join();
		
System.out.println("in thread"+Thread.currentThread().getName());

	}
	public static class Mythread implements Runnable
	{
		@Override
		public void run() {
			System.out.println("in thread"+Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
