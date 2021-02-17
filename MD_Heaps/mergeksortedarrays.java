package MD_Heaps;

import java.util.PriorityQueue;

public class mergeksortedarrays {

	public static void main(String[] args) {
		int arr[][]= {{4,5,6,},{7,8,9},{1,2,3}};
		mergeksorted(arr, 3);

	}
	public static void mergeksorted(int arr[][],int k){
		PriorityQueue<Integer>q=new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<k;j++ )
			{
				q.add(arr[i][j]);
			}
		}
		while(!q.isEmpty())
			System.out.println(q.poll());}
	

}
