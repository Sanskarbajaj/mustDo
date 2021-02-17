package multithreadandsync;

public class multithrdbasic {

	public static void main(String[] args) {
		System.out.println("in thread"+Thread.currentThread().getName());
		Mythread thrd=new Mythread();
		thrd.start();
System.out.println("in thread"+Thread.currentThread().getName());
	}
	public static class Mythread extends Thread
	{
		@Override
		public void run()
		{
			System.out.println("in thread"+Thread.currentThread().getName());
		}
	}

}
