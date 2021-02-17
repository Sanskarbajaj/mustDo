package multithreadandsync;

public class banksynchro {

	public static void main(String[] args) throws InterruptedException {
		
		Mythread thread[]=new Mythread[6];
		   bankobj obj2=new bankobj(2,200);

		 bankobj obj1=new bankobj(1, 100);
		   thread[0]=new Mythread(obj1,true, 100);
		   thread[1]=new Mythread(obj1,true, 100);
		   thread[2]=new Mythread(obj1,true, 100);
		   
		  
		   thread[3]=new Mythread(obj2,true, 100);
		   thread[4]=new Mythread(obj2,true, 100);
		   thread[5]=new Mythread(obj2,true, 100);
		   for(int i=0;i<=5;i++){
	            thread[i].start();
	        }

	        for(int i=0;i<6;i++){
	            thread[i].join();
	        }

	        System.out.println("Balance of account 1: " + obj1.getBalance() + ", balance of account 2: " + obj2.getBalance());

	}
	public static class Mythread extends Thread
	{
	  bankobj obj;
	boolean isdeposit=false;
	int amount;
	public Mythread(bankobj obj,boolean isdeposit,int amount) {
		this.obj=obj;
		this.amount=amount;
		this.isdeposit=isdeposit;
	}
	   @Override
	   public void run()
	   {
		   if(this.isdeposit)
			try {
				deposit();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			try {
				withdraw();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	   public void deposit() throws InterruptedException
	   {synchronized (this.obj) {
		   System.out.println("In deposit function : obj is " + this.obj + ", thread = " + currentThread().getName());
           Thread.sleep(3000);
		   int ans=this.obj.getBalance();
		  this.obj.setBalance(ans+this.amount);
		 // System.out.println(obj.getBalance());
	   }
	   }
	   public void withdraw() throws InterruptedException
	   {synchronized (this.obj) {
           System.out.println("In withdraw function : obj is " + this.obj +  ", thread = " + currentThread().getName());
           Thread.sleep(3000);
		   int ans=this.obj.getBalance();
		  this.obj.setBalance(ans-this.amount);
	//	  System.out.println(obj.getBalance());
	      }
	   }
	   
	}
	

}
