package MD_Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class runningmedian {

	public static void main(String[] args) {

		int arr[]= {5,15,1,3};
runningmedian(arr);
	}
	public static  void runningmedian(int arr[])
	{
		PriorityQueue<Integer>max=new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer>min=new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++)
		{
		if(max.isEmpty()&&min.isEmpty())
		{
			max.add(arr[i]);
		}
		else if(arr[i]<max.peek())
		{
			max.add(arr[i]);
		}else
		{
			min.add(arr[i]);
		}
		if(Math.abs(max.size()-min.size())>1)
		{
			int mx=max.size();
			int mn=min.size();
			if(mx>mn)
			{
				if(!max.isEmpty())
				min.add(max.poll());
			}
			else
			{
				if(!min.isEmpty())
				max.add(min.poll());
			}
		}
		
		if(max.size()==min.size())
		{
			System.out.println((max.peek()+min.peek())/2);
		}
		else
		{
			if(max.size()>min.size())
			System.out.println(max.peek());
			else
			System.out.println(min.peek());
		}
		}
		
		
	}

}
