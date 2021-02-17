package MD_Array;

import java.util.HashMap;

public class eqnozeroandone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,1,0,1,0};
		System.out.println(countt(arr));

	}
	public static int countt(int arr[])
	{
		int sum=0;int max=0;
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			sum=sum+arr[i];
			else
				sum=sum-1;
			
			if(!hm.containsKey(sum))
				hm.put(sum, i);
			else
			{
				if(sum==0)
					max=i+1;
				else
				max=i-hm.get(arr[i]);
			}
		}
	return max;}

}
