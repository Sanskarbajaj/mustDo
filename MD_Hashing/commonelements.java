package MD_Hashing;

import java.util.HashMap;
import java.util.TreeSet;

public class commonelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public static void comele(int arr[],int brr[],int crr[])
	{
		HashMap<Integer,Integer>a=new HashMap<>();
		HashMap<Integer,Integer>b=new HashMap<>();
		HashMap<Integer,Integer>c=new HashMap<>();
		TreeSet<Integer>ts=new TreeSet<>();
		for(int i=0;i<arr.length;i++)
			a.put(arr[i],1);
		for(int i=0;i<brr.length;i++)
				b.put(brr[i],1);
		for(int i=0;i<crr.length;i++)
					c.put(crr[i],1);
		boolean flag=false;
	for(int i=0;i<arr.length;i++)
	{
		if(b.containsKey(arr[i])&&c.containsKey(arr[i]))
		{flag=true;
		   ts.add(arr[i]);
		}
	}
	if(flag==false)
   System.out.print("-1");
	else
	{
		for(int x:ts)
		{
			System.out.print(x+" ");
		}
	}
		
	}

}
