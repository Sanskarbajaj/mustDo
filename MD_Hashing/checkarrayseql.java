package MD_Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class checkarrayseql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean iseq(int arr[],int brr[])
	{
		HashMap<Integer,Integer>ha=new HashMap<>();
		HashMap<Integer,Integer>hb=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!ha.containsKey(arr[i]))
				ha.put(arr[i],1);
			else
				ha.put(arr[i],ha.get(arr[i])+1);
		}
		for(int i=0;i<brr.length;i++)
		{
			if(!hb.containsKey(brr[i]))
				hb.put(brr[i],1);
			else
				hb.put(brr[i],hb.get(brr[i])+1);
		}
		if(ha.equals(hb))
			return true;
	return false;}

}
