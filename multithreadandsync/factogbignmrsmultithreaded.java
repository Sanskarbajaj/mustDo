package multithreadandsync;

import java.math.BigInteger;

public class factogbignmrsmultithreaded {

	public static void main(String[] args) throws InterruptedException {
		long start=System.currentTimeMillis();
		int arr[]= {1000,2000,3000,4000,5000,6000,7000};
		Mythread th[]=new Mythread[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			th[i]=new Mythread(arr[i]);
			th[i].start();
		}
		for(int i=0;i<arr.length;i++)
		{
			
			th[i].join();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(th[i].res);
		}
		System.out.println(System.currentTimeMillis()-start);
	}
	public static class Mythread extends Thread
	{
		private int num;
		private BigInteger res;
		public Mythread(int num) {
			this.num=num;
			res=res.ONE;
		}
		@Override
		public void run()
		{
			calculate(num);
		}
		public void calculate(int num)
		{
			for(int i=num;i>=1;i--)
			{
			  res=res.multiply(res.valueOf(i));
			}
	}
	}

}
