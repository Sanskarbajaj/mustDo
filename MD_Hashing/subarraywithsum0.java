package MD_Hashing;

import java.util.HashMap;

public class subarraywithsum0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15 ,-2, 2 ,-8, 1, 7, 10 ,23};
System.out.println(sumz(arr, 0));
	}
	public static int sumz(int arr[],int k)
	{
		int sum=0;
		int pre[]=new int[arr.length];
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			pre[i]=sum;
		}
		int count=0;
		hm.put(pre[0],1);
		for(int i=1;i<pre.length;i++)
		{
			if(!hm.containsKey(pre[i]))
				hm.put(pre[i], 1);
			else if(pre[i]==0||hm.containsKey(pre[i]))
				count=i;
		}
	return count;}

}
