package MD_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthsmallestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		System.out.println(kthsmallest(arr, 2));
	}
	public static int kthsmallest(int arr[],int k)
	{
		PriorityQueue<Integer>heap=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
		{
			heap.add(arr[i]);
		}
		int ans=0;
		for(int i=0;i<k;i++)
		{
			ans=heap.poll();
		}
	return ans;}

}
