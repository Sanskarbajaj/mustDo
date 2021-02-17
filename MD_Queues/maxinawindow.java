package MD_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class maxinawindow {

	public static void main(String[] args) {
		int arr[]= {1, 2 ,3 ,1, 4, 5, 2, 3, 6};
		int k=3;
		maxwin(arr, k);

	}
	public static void maxwin(int arr[],int k)
	{
		Queue<Integer>q=new LinkedList<Integer>();
		if(arr.length<k)
		{
			return;
		}else
		{
			q.add(0);
		for(int i=1;i<k;i++)
		{
			if(arr[i]>q.peek())
			{
				q.poll();
			}
			q.add(i);
		}
		
		}
		
		for(int i=k;i<arr.length;i++)
		{
			
			System.out.println(arr[q.peek()]);
			
			 while(q.peek()<=i-k)
			 {
				 q.poll();
			 }
			 
			 while(!q.isEmpty()&&arr[i]>q.peek())
				{
					q.poll();
				}
			
				q.add(i);
				if(i==arr.length-1)
				{
					System.out.println(q.peek());
				}
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
